package com.jjh.tail

import scala.annotation.tailrec

object TailRecursionTest {

  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(factorialTailRec(n = 5))
    // bang(4)
//    bangFunc(4)
    println(func(5))
  }

  def factorial(n: Int): Int =
  // Termination condition
  if (n == 1)
    1 // Base case
  else
    n * factorial(n - 1) // Recursive call

  @tailrec
  def factorialTailRec(acc: Int = 1, n: Int): Int =
  // Termination condition
    if (n == 1)
      acc // Base case
    else
      factorialTailRec(acc * n, n - 1) // Tail Recursive call

  def bang(x: Int): Int = {
    if (x == 0) throw new Exception("Bang!")
    else bang(x - 1) +1
  }

  val func: Int => Int = (x: Int) => {
    if (x == 1) 1
    else x * func(x - 1)
  }

  val bangFunc: Int => Int = (x: Int) => {
    if (x == 0)
      throw new Exception("Bang!")
    else
      bangFunc(x - 1)
  }

}