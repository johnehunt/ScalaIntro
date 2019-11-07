package com.jjh.function

/**
 * Classes and objects can have methods and
 * functions.
 * 
 * Note functions are top level entities but methods are 
 * part of a class/object
 */
object FunctionTest {

  def main(args: Array[String])  {
    // Can invoke methods
    println(max(2, 3))
    // Can invoke functions
    println(increment(3))
    // Can use named parameters
    println(max(x=2, y=3))
    println(max(y=3, x=2))
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  val increment = (x: Int) => x + 3

}
