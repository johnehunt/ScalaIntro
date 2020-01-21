package com.jjh.function

object FunctionLiteralTests extends App {
  // Functional literals can be assigned to variables
  // Note last value assigned is returned as result of
  // function - return type inferred
  var increase = (x: Int) => x + 1
  var y = 1
  println("Initial value of y: " + y)
  y = increase(y)
  println("Increased y: " + y)
  // Can also assign to another identifier
  val increment = increase
  println("increase using increment: " + increment(2))
  // Because increase is a var you can re-assign it
  increase = (x: Int) => x + 99
  y = increase(y)
  println("2nd Increased y: " + y)
  // Can also fundamental change what it is
  // Note can't assign to the parameter X; a parameter is a val
  increase = (x: Int) => {
    println("\tIncreasing x")
    println("\tby a fixed amount")
    x + 1
  }
  y = increase(y)
  println("3rd Increased y: " + y)
}


