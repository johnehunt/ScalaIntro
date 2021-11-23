package com.jjh.collections.vector

/**
 * Vectors often faster than lists as more like an array list
 * List is more like a linked list
 */
object SampleVectorApp extends App {

  val numbers = Vector(1, 2, 3)
  println(numbers)

  val numbers2 = Vector.range(1, 4)
  println(numbers2)

  val numbers3 = numbers.prepended(9)
  println(numbers3)

  // Append to the vector
  val numbers4 = numbers :+ 7
  println(numbers4)

  val numbers5 = numbers ++ Seq(8, 9)
  println(numbers5)
}
