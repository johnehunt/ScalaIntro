package com.jjh.collections.iteration

object ForLoopTest extends App {

  // Long hand form of a for loop
  // note to is a method called on the integer
  for (i <- (0).to(10)) {
    print(i)
  }

  println("\n----------------------")

  // Shorter more common form
  for (i <- 0 to 10) print(i)

}