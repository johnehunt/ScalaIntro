package com.jjh.actors.classic

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem

class LifecycleGreeter extends Actor {

  override def preStart(): Unit = println("preStart")
  override def postStop(): Unit = println("postStop")

  def receive: PartialFunction[Any, Unit] = {
    case "hello" => println("Hello World")
    case "stop" => context.stop(self)
    case _ => println("Hello Whoever")
  }
}

object ActorLifecycleApp extends App {
  val props = Props[LifecycleGreeter]
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(props)
  actor ! "hello"
  actor ! "Welcome"
  actor ! "stop"
}
