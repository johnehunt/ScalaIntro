package com.jjh.actors.classic

import akka.actor._

class LifecycleGreeter extends Actor {

  override def preStart(): Unit = println("preStart")
  override def postStop(): Unit = println("postStop")

  override def preRestart(reason:Throwable, message: Option[Any]): Unit = println(s"preRestart $reason - $message")
  override def postRestart(reason:Throwable): Unit = println(s"postRestart $reason")

  def receive: PartialFunction[Any, Unit] = {
    case "hello" => println("Hello World")
    case "error" => throw new RuntimeException("Opps")
    case "stop" => context.stop(self)
    case _ => println("Hello Whoever")
  }
}

object ActorLifecycleApp extends App {
  val props = Props[LifecycleGreeter]
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(props)
  actor ! "hello"
  actor ! "error"
  actor ! "stop"

  //shutdown the actor system
  system.terminate()
}
