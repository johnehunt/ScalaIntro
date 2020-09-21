package com.jjh.actors.classic

import akka.actor.{ActorSystem, Props, PoisonPill}

object ActorPoisonPillApp extends App {
  val props = Props[LifecycleGreeter]
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(props)
  actor ! "hello"
  actor ! PoisonPill
  actor ! "hello" // Wont be processed

  //shutdown the actor system
  system.terminate()
}
