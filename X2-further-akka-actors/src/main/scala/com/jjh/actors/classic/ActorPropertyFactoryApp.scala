package com.jjh.actors.classic

import akka.actor.{Actor, ActorSystem, Props}

object Calculator {
  def props: Props = Props[Calculator]
}

class Calculator extends Actor {
  def receive: PartialFunction[Any, Unit] = {
    case x: Int =>
      println("Calculator received: " + x)
      var total = x
      for (i <- 1 to x) total = total * i
      println("Calculator processing completed: " + total)
  }
}


object ActorPropertyFactoryApp extends App {
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(Calculator.props)
  actor ! 4
  println("Message sent")

  //shutdown the actor system
  system.terminate()
}
