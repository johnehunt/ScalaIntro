package com.jjh.actors.classic

import akka.actor.{Actor, ActorSystem, Props}

class LongProcessor extends Actor {
  def receive: Receive = {
    case s: String =>
      for (_ <- 1 to 10) print(s)
      Thread.sleep(1000)
      for (_ <- 1 to 10) print(s)
  }
}

object ActorConfigTest extends App {
  println("Set up configuration for Actor System")
  val props = Props[LongProcessor].withDispatcher("akka.actor.jeh-pool-dispatcher")
  val system = ActorSystem("MyActorSystem")
  println("Creating Actors")
  val actor1 = system.actorOf(props, name="actor1")
  val actor2 = system.actorOf(props, name="actor2")
  val actor3 = system.actorOf(props, name="actor3")
  val actor4 = system.actorOf(props, name="actor4")
  println("Sending messages")
  actor1 ! "A"
  actor2 ! "B"
  actor3 ! "C"
  actor4 ! "D"
  println("Messages sent")
}