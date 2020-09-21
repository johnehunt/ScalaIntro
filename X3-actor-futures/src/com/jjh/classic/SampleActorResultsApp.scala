package com.jjh.classic

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem

object Controller {
  // String controller passed as a parameter to the constructor
  // of the controller class
  def props: Props = Props(classOf[Controller], "controller")
}

class Controller(name: String) extends Actor {
  def receive: Receive = {
    case "start" =>
      println(name + ": starting calculator")
      context.actorOf(Calculator.props) ! 4
      println(name + ": message sent")
    case result: Int =>
      println(name + " received: " + result)
      context.stop(self)
  }
}

object Calculator {
  def props: Props = Props(new Calculator())
}

class Calculator extends Actor {
  def receive: Receive = {
    case x: Int =>
      println("Calculator received: " + x)
      var total = x
      for (i <- 1 to x) total = total * i
      println("Calculator processing completed, returning result")
      sender ! total
  }
}

object SampleActorResultsApp extends App {
  println("Starting Actor returns Reply Test application")
  val system = ActorSystem("MyActorSystem")
  val controller = system.actorOf(Controller.props)
  controller ! "start"
  println("End of ReplyTest body")

  //shutdown the actor system
  system.terminate()
}
