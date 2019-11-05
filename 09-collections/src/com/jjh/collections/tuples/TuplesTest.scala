package com.jjh.collections.tuples

/**
 * Tuples are immutable sequences of objects but can
 * contain objects of different types.
 *
 * Note they are not collections as they don't support the
 * normal collection style methods
 */
object TuplesTest extends App {
  // Long hand form of a tuple
  val t1 = Tuple2(1, 2)
  // Longest hand form of a tuple
  val t2 = new Tuple2[Int, String](1, "John")

  // Tuple creation typically use parentheses and a comma
  val pair = (47, "John")
  println(pair)

  // But can be as simple as
  val pair2 = 47 -> "John"
  println(pair2)

  println("-----------------------------------")

  // Access elements of tuple using ._<index>
  // Note that this is 1 based!
  println(pair._1)
  println(pair._2)

  println("-----------------------------------")
  // Can have any number of tuples up to 22
  // The class here is Tuple4
  val tuple = (47, "John", "Hunt", 12.75)
  println(tuple)
  println(tuple._1)
  println(tuple._2)
  println(tuple._3)
  println(tuple._4)

  println("-----------------------------------")
  // Tuple iteration
  tuple.productIterator.foreach { println _ }

  println("-----------------------------------")
  // Tuple Extraction
  val (x, y) = t1
  println("Tuple extraction result: " + x + " , " + y)

  println("------------------------------------")
  // Length of a tuple
  println(tuple.productArity)

  println("---------------------------------------")
  // Copy a tuple and change a value
  println(tuple.copy(_2 = "Bob"))
}
