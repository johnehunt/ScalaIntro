package com.jjh.actors.functional

import akka.actor.typed.{ActorSystem, Behavior}
import akka.actor.typed.scaladsl.Behaviors

case class Message(info: String)

object ActorFunctionalStyleApp extends App {

  val actor: Behavior[Message] = Behaviors.receive(
    (context, message) => {
      println(s"Recieved the message: $message")
      Behaviors.same // indicates that this behaviour is to be reused
    }
  )

  val actorSystem: ActorSystem[Message] = ActorSystem(actor, "MyActorSystem")

  actorSystem ! Message("Hello World")
  actorSystem ! Message("Goodbye World")

}
