package com.jjh.exceptions

object ExceptionTest extends App {
  try {
    val r1 = new Rational(5, 0)
    println(r1)
  } catch {
    case e: Exception => println("exception caught: " + e);
  }
}
