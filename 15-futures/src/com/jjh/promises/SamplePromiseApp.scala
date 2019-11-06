package com.jjh.promises

object SamplePromiseApp extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global
  import scala.util._

  println("Starting")

  // Create the promise - which will return an Int
  val promise = Promise[Int]

  // Set up two futures that will receive the
  // promised value when it is made available
  val future1 = promise.future
  val future2 = promise.future

  // Set up a handler for future1
  future1 onComplete {
    case Success(v) => println(s"future1 received $v")
    case Failure(exp) => println(s"future1 failed with $exp")
  }

  // Also set up a second handler for future2
  future2 onComplete {
    case Success(v) => println(s"future2 received $v")
    case Failure(exp) => println(s"future2 failed with $exp")
  }

  // Sleep for 1 second to simulate processing
  print("Processing ...")
  Thread.sleep(1000)

  // Supply a result to the promise
  promise.success(5)
  // promise.failure(new IllegalStateException("It was all wrong"))

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
}
