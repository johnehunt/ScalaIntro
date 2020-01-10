package com.jjh.collections.arrays

/**
 * Illustrates the creation of multi dimensional arrays.
 * Can create any number of dimensions e.g. ArrayofDim[Int](1, 2, 3).
 */
object TwoDArraysExamplesApp extends App {

  // Create a 2 D array of Ints (default 0)
  val twoDArray = Array.ofDim[Int](2, 3)
  println(s"twoDArray.length: ${twoDArray.length}")  // prints 2
  println(s"twoDArray(0).length: ${twoDArray(0).length}") // prints 3

  println(s"twoDArray: $twoDArray") // prints Array object hashcode
  println(s"twoDArray(0): ${twoDArray(0)}") // prints Array object hashcode
  println(s"twoDArray(0)(0): ${twoDArray(0)(0)}") // prints 0

  // Create an array of integers filled with a value
  val anotherArray = Array.fill(2, 3)(2.0)
  println(s"anotherArray: $anotherArray") // prints Array object hashcode
  println(s"anotherArray(0)(0): ${anotherArray(0)(0)}") // prints 2.0
}
