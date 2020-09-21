package com.jjh.classic

import akka.actor.{Actor, ActorSystem, Props}

import scala.concurrent.{ExecutionContext, Future}

case class Message(msg: String)

case object Shutdown

class BlockingActor extends Actor {
  def receive: Receive = {
    case Message(msg) =>
      println(s"Msg: $msg")
      Thread.sleep(1000) // Blocking behaviour
      println(s"done! $msg")
    case Shutdown =>
      context.stop(self)
  }
}

class NonBlockingActor extends Actor {

  import ExecutionContext.Implicits.global

  def receive: Receive = {
    case Message(msg) =>
      println(s"Msg: $msg")
      Future {
        Thread.sleep(1000)
        println(s"done! $msg")
      }
    case Shutdown =>
      context.stop(self)
  }
}

object ActorWithoutBlockingApp extends App {
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(Props[NonBlockingActor])
  // val actor = system.actorOf(Props[BlockingActor])
  for (i <- Range(0, 4)) {
    actor ! Message(s"Message: $i")
  }
  actor ! Shutdown
  println("Done sending messages!")

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
  system.terminate()
}
