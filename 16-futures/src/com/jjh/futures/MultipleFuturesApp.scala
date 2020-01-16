package com.jjh.futures

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object MultipleFuturesApp extends App {
  val f1 = Future{Thread.sleep(1000); 10}
  val f2 = Future{Thread.sleep(2000); 20}
  val all = Future.sequence(Seq(f1, f2))
  // Now get a List(10, 20) as a result
  all.foreach(x => println(s"All done: $x"))

  val f3 = Future{Thread.sleep(1000); 10}
  val f4 = Future{Thread.sleep(2000); 20}
  val all2 = Future.sequence(Seq(f1, f2))
  // Wait for the futures to complete before shutting down
  val r = Await.result(all2, 5.seconds)
  println(s"result; $r")
}
