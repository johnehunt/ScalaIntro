package com.jjh.futures

object FutureAppWithForEach extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global

  val f: Future[List[String]] = Future {
    Thread.sleep(1000)
    List[String]("John", "Denise", "Paul", "Fiona")
  }

  f foreach (
    (names: List[String]) => names.foreach(println)
  )

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
}
