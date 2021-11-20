package com.jjh.actors.classic

import akka.actor.Props
import akka.actor.ActorSystem
import akka.actor.Actor

class PrinterActor extends Actor {
  def receive(): Receive = {
    case "A" => for (_ <- 1 to 100) print("A")
    case "B" => for (_ <- 1 to 100) print("B")
    case "C" => for (_ <- 1 to 100) print("C")
    case _ => for (_ <- 1 to 100) print("_")
  }
}

object AkkaConcurrentTest extends App {
  val props = Props[PrinterActor]()
  val system = ActorSystem("MyActorSystem")
  // Set up a group of actors to run concurrently
  val actor1 = system.actorOf(props, name = "actor1")
  val actor2 = system.actorOf(props, name = "actor2")
  val actor3 = system.actorOf(props, name = "actor3")
  val actor4 = system.actorOf(props, name = "actor4")
  // send messages to each actor in turn
  actor1 ! "A"
  actor2 ! "B"
  actor3 ! "C"
  actor4 ! "X"

  //shutdown the actor system
  system.terminate()
}


