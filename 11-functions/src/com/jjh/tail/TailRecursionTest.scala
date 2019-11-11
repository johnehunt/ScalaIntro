package com.jjh.tail

import scala.annotation.tailrec

object TailRecursionTest {

  def main(args: Array[String]): Unit = {
    // print(factorial(5))
    bang(4)
  }

  def factorial(n: Int): Int =
    // Termination condition
    if (n == 1)
      1 // Base case
    else
      n * factorial(n - 1) // Recursive call

  def bang(x: Int): Int = {
    if (x == 0) throw new Exception("Bang!")
    else bang(x - 1) +1
  }

}