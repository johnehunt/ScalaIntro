package com.jjh.actors.classic

import akka.actor.{Actor, ActorSystem, Props}

class Greeter(val prompt: String) extends Actor {
  def receive: PartialFunction[Any, Unit] = {
    case "hello" => println(s"$prompt Hello World")
    case "goodbye" => println(s"$prompt Hello World")
    case _ => println(s"$prompt Hello Whoever")
  }
}

object Greeter {
  def props(args: String): Props = Props(classOf[Greeter], args)
  def props2(args: String): Props = Props(new Greeter(args)) // Recommended alternative
}

object ActorWithParametersApp extends App {
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(Greeter.props(":> "))
  actor ! "hello"
  system.terminate()
}
