package com.jjh.actors.typed

import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}
import akka.actor.typed.{ActorSystem, Behavior}

object HelloWorld {
  def apply(): Behavior[Any] = Behaviors.setup(context => new HelloWorld(context))
}

class HelloWorld(context: ActorContext[Any]) extends AbstractBehavior[Any](context) {

  override def onMessage(message: Any): Behavior[Any] = {
    message match {
      case "hello" => println("Hello World")
      case "Goodbye" => println("Goodbye World")
      case 42 => println("Its the answer to Everything")
      case _ => println("Hello Whoever")
    }
    this
  }
}

object HelloTypedAkkaWorld extends App {

  val actorSystem: ActorSystem[Any] = ActorSystem(HelloWorld(), "MyActorSystem")

  actorSystem ! "hello"
  actorSystem ! "Goodbye"
  actorSystem ! 42
  actorSystem ! true

}