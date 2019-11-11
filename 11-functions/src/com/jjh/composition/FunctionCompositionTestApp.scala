package com.jjh.composition

object FunctionCompositionTestApp extends App {

  val increment = (x: Int) => x + 1
  val double = (x: Int) => x * x

  // Function composition using compose - runs 2nd function first
  val func1 = increment compose double
  println(s"func1(2): ${func1(2)}")

  // Function composition using andThen - runs 1st function then 2nd
  val func2 = increment andThen double
  println(s"func2(2): ${func2(2)}")
}
