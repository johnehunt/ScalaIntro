package com.jjh.flowofcontrol

object ForLoopTest extends App {

  // Long hand form of a for loop
  // note to is a method called on the integer
  for (i <- (0).to(10)) {
    print(s"$i, ")
  }
  println()

  println("----------------------")

  // Shorter more common form
  for (i <- 0 to 10) print(s"$i, ")
  println()

  println("----------------------")
  val result1 = for (i <- 1 to 5) yield 10 * i
  println(result1)

  println("----------------------")
  val result2 = for (n <- List("one", "two", "three")) yield n.substring(0, 2)
  print(result2)


}
