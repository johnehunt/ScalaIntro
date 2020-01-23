package com.jjh.actors.classic.persistence

import akka.actor._

object ActorPersistenceExampleApp extends App {

  val system = ActorSystem("PersistenceActor")

  val persistentActor = system.actorOf(
    MessagePersistentActor.props(
      id = "my-persistence-actor"),
      name = "MessagePersistentActor")

  // Send messages to actor
  persistentActor ! Message("Hello World")
  persistentActor ! Message("A Grand Day out")
  persistentActor ! Message("May the force be with you")
  persistentActor ! Checkpoint

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

  // Cleanly shutdown the actor system
  system.terminate()

}
