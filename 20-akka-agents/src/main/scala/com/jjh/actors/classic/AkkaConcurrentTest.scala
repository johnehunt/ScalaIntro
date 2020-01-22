package com.jjh.actors.classic

import akka.actor.Props
import akka.actor.ActorSystem
import akka.actor.Actor

class PrinterActor extends Actor {
  def receive: PartialFunction[Any, Unit] = {
    case "A" => for (i <- 1 to 500) print("A")
    case "B" => for (i <- 1 to 500) print("B")
    case "C" => for (i <- 1 to 500) print("C")
    case _ => for (i <- 1 to 500) print("_")
  }
}

object AkkaConcurrentTest extends App {
  val props = Props[PrinterActor](new PrinterActor())
  val system = ActorSystem("mysystem")
  val actor1 = system.actorOf(props, name = "actor1")
  val actor2 = system.actorOf(props, name = "actor2")
  val actor3 = system.actorOf(props, name = "actor3")
  val actor4 = system.actorOf(props, name = "actor4")
  actor1 ! "A"
  actor2 ! "B"
  actor3 ! "C"
  actor4 ! "X"
}


