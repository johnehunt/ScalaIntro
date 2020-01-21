package com.jjh.actors.classic

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class Greeter extends Actor {
  def receive: PartialFunction[Any, Unit] = {
    case "hello" => println("Hello World")
    case "Goodbye" => println("Goodbye World")
    case 42 => println("Its the answer to Everything")
    case _ => println("Hello Whoever")
  }
}

object HelloClassicAkkaWorld extends App {
  val props: Props = Props(new Greeter())
  val system: ActorSystem = ActorSystem("MyActorSystem")
  val actor: ActorRef = system.actorOf(props)
  actor ! "hello"
  actor ! "Goodbye"
  actor ! 42
  actor ! true
}