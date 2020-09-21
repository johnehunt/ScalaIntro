package com.jjh.actors.classic

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.pattern.gracefulStop

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class Greeter extends Actor {
  def receive: Receive = {
    case "hello" => println("Hello World")
    case "Goodbye" => println("Goodbye World")
    case 42 => println("Its the answer to Everything")
    case _ => println("Hello Whoever")
  }
}
object GracefulStopActorApp extends App {
  // configure the actor system
  val props: Props = Props(new Greeter())
  val system: ActorSystem = ActorSystem("MyActorSystem")
  // create an actor
  val actor: ActorRef = system.actorOf(props)
  // send messages to the actor
  actor ! "hello"
  actor ! "Goodbye"

  // Graceful stop of actor
  val stopped: Future[Boolean] = gracefulStop(actor, 2.seconds)
  Await.result(stopped, 3.seconds)
  println("actor was stopped")

  //shutdown the actor system
  system.terminate()
}
