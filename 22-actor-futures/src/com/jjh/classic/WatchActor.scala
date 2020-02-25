package com.jjh.classic

import akka.actor._

class WatchActor extends Actor {
  // Create a child to monitor
  private val child: ActorRef = context.actorOf(Props.empty, "child")
  context.watch(child) // registers for watch for notification

  def receive: Receive = {
    case "kill" =>
      println("Terminating child")
      context.stop(child)
    case Terminated(x) =>
      println(s"in here $x")
  }
}

object WatchForDeathApp extends App {
  val system = ActorSystem("MyActorSystem")
  val watcher = system.actorOf(Props(classOf[WatchActor]))
  watcher ! "kill"
}
