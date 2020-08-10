package com.jjh.futures

object FutureAppWithExecutionContext extends App {

  import java.util.concurrent.Executors
  import scala.concurrent.{ExecutionContext, Future}

  implicit val ec: ExecutionContext =
    ExecutionContext.fromExecutor(Executors.newFixedThreadPool(10))

  val f = Future {
    Thread.sleep(2000)
    1
  }(ec)

  f map println

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
}
