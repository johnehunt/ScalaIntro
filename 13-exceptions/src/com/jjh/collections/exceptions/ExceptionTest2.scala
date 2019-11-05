package com.jjh.collections.exceptions

object ExceptionTest2 extends App {
  try {
    val r1 = new Rational(5, 3)
    val r2 = r1 + -1
  } catch {
    case e: IllegalArgumentException => println("exception illegal argument caught: " + e)
    case e: RuntimeException => println("Runtime Exception" + e)
  } finally {
    println("Always in here")
  }
}
