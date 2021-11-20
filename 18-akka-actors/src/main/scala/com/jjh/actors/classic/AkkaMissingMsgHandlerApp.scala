package com.jjh.actors.classic

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.actor.UnhandledMessage

class Greeter2 extends Actor {
  def receive(): Receive = {
    case "hello" => println("Hello World")
    case "Goodbye" => println("Goodbye World")
  }
}

/**
 * This actor is used to handle unhandled messages
 */
class UnhandledMessageActorListener extends Actor {
  def receive(): Receive = {
    case u: UnhandledMessage => println("Unhandled message " + u.message)
  }
}

object AkkaMissingMsgHandlerApp extends App {
  // configure the actor system
  val system: ActorSystem = ActorSystem("MyActorSystem")
  // create a Greeter actor
  val actor: ActorRef = system.actorOf(Props[Greeter2]())
  // Now set up listener for unhandled messages
  val listener = system.actorOf(Props[UnhandledMessageActorListener]())
  system.eventStream.subscribe(listener, classOf[UnhandledMessage])

  // send messages to the actor
  actor ! "hello"
  actor ! "Goodbye"
  actor ! 42 // This one is not supported

  //shutdown the actor system
  system.terminate()
}
