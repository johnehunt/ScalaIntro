package com.jjh.classic

import scala.collection.mutable
import scala.concurrent.duration.DurationInt

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.OneForOneStrategy
import akka.actor.Props
import akka.actor.SupervisorStrategy.Restart
import akka.actor.actorRef2Scala

object ActorSupervisionExampleApp extends App {
  val props = Props[Supervisor]
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(props, name = "supervisor")
  actor ! "run"
  Thread.sleep(100)
  actor ! "error"
  actor ! "run"
}


class Supervisor extends Actor {
  val children: mutable.ArrayBuffer[ActorRef] = mutable.ArrayBuffer[ActorRef]()

  // Restart the child actors child when RuntimeException is thrown.
  // After 3 restarts within 1 minute it will be stopped.
  override val supervisorStrategy: OneForOneStrategy =
  OneForOneStrategy(maxNrOfRetries = 3, withinTimeRange = 1.minute) {
    case _: RuntimeException =>
      println("Supervisor Restarting")
      Restart
  }

  override def preStart(): Unit = {
    children.addOne(context.actorOf(Props(new ChildActor(name = "child1"))))
    children.addOne(context.actorOf(Props(new ChildActor(name = "child2"))))
  }

  def receive: Receive = {
    case "run" =>
      println("Supervisor run")
      children.foreach(a => a ! "msg")
    case "error" =>
      println("Supervisor error")
      children.foreach(a => a ! "error")
  }
}

class ChildActor(name: String) extends Actor {
  override def preStart(): Unit = println(name + " preStart")
  override def postStop(): Unit = println(name + " postStop")

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    super.preRestart(reason, message)
    println(name + " preRestart")
  }

  override def postRestart(reason: Throwable): Unit = {
    println(name + " postRestart")
    super.postRestart(reason)
  }

  def receive: Receive = {
    case "error" => throw new RuntimeException(name)
    case _ => println(name + " received msg")
  }
}