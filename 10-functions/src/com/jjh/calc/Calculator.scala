package com.jjh.calc

class Calculator {
  // method defined as part of class
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }
  // Function defined within body of a class
  val increment: Int => Int = (x: Int) => x + 1
}

object CalculatorTestApp extends App {
  val calc = new Calculator
  val a = calc.max(2, 3)
  println(a)
  val b = calc.increment(3)
  println(b)
  val func = calc.increment
  val c = func(3)
  println(c)
}