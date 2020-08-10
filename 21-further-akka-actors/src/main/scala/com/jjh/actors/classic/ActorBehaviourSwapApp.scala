package com.jjh.actors.classic

import akka.actor._

class HotSwapActor extends Actor {
  def angry: Receive = {
    case "foo" => println("I am already angry?")
    case "bar" => context.become(happy)
  }

  def happy: Receive = {
    case "bar" => println("I am already happy :-)")
    case "foo" => context.become(angry)
  }

  def receive: Receive = {
    case "hello" => println("Hello World")
    case "foo" => context.become(angry)
    case "bar" => context.become(happy)
  }
}

object ActorBehaviourSwapApp extends App {
  val props = Props[HotSwapActor]
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(props)
  actor ! "hello"
  actor ! "foo"
  actor ! "foo"
  actor ! "bar"
  actor ! "bar"

  system.terminate()
}
