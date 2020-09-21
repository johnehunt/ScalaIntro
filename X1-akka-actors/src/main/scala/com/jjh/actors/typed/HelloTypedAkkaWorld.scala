package com.jjh.actors.typed

import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}
import akka.actor.typed.{ActorSystem, Behavior}

object HelloWorldActor {
  def apply(): Behavior[Any] =
    Behaviors.setup(context => new HelloWorldActor(context))
}

class HelloWorldActor(context: ActorContext[Any])
  extends AbstractBehavior[Any](context) {

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

  val actorSystem: ActorSystem[Any] = ActorSystem(HelloWorldActor(), "MyActorSystem")

  actorSystem ! "hello"
  actorSystem ! "Goodbye"
  actorSystem ! 42
  actorSystem ! true

  // Cleanly shutdown the actor system
  actorSystem.terminate()

}