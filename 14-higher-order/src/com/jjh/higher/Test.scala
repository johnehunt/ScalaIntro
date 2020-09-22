package com.jjh.higher

object Processor {
  val apply: (Int, Int => Int) => Int = (n: Int, f: Int => Int) => f(n)
}

object Test extends App {

  val f1 = (x: Int) => x + 1
  val f2 = (y: Int) => y
  val f3 = (a: Int) => a * 2
  val f4 = (x: Int) => x * x
  
  println(Processor.apply(10, f1))
  println(Processor.apply(10, f2))
  println(Processor.apply(10, f3))
  println(Processor.apply(10, f4))
  
}
