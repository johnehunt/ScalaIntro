package com.jjh.futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object MultipleFuturesOnCompleteApp extends App {

  // Create futures before for statement
  // note if you create them in the for they will run sequentially
  val f1 = Future { Thread.sleep(800); 1 }
  val f2 = Future { Thread.sleep(200); 2 }
  val f3 = Future { Thread.sleep(400); 3 }

  // run futures simultaneously in a for-comprehension
  val result = for {
    r1 <- f1
    r2 <- f2
    r3 <- f3
  } yield r1 + r2 + r3

  // do whatever you need to do with the result
  result.onComplete {
    case Success(x) => println(s"\nresult = $x")
    case Failure(e) => e.printStackTrace()
  }

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

}
