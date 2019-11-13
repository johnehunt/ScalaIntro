package com.jjh.exceptions

/*
 * Yielding a value in response to an exception
 */
object ExceptionTest3 extends App {
  val r1 =
    try {
      new Rational(5, 0)
    } catch {
      case e: RuntimeException => new Rational(5, 1)
    }
  println(r1)
}
