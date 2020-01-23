package com.jjh.classic

import akka.pattern.ask
import akka.actor._
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext
import scala.util.Try

object Processor {
  def props: Props = Props(new Processor())
}

class Processor extends Actor {
  def receive: Receive = {
    case x: Int =>
      println("Processor ->  received: " + x)
      var total = x
      Thread.sleep(500)
      for (i <- 1 to x) total = total * i
      println(s"Processor ->  processing completed, returning result $total")
      sender ! total
  }
}

object ActorFutureSampleApp extends App {
  import ExecutionContext.Implicits.global

  println("Starting")
  val system = ActorSystem("MyActorSystem")
  val actor = system.actorOf(Processor.props)

  // Using the ask function
  val future1: Future[Any] = ask(actor, message=4)(Timeout(5.seconds))
  future1 onComplete {
    result: Try[Any] => result.foreach(e => println(s"Result from future: $e"))
  }

  import scala.concurrent.Await

  // Using the ask '?' syntax
  implicit val timeout: Timeout = Timeout(5.seconds)
  val future2: Future[Any] = actor ? 5 // enabled by the “ask” import
  val result = Await.result(future2, timeout.duration)
  println(s"Result from awaiting future: $result")

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
  //shutdown the actor system
  system.terminate()
  System.exit(0)
}
