package com.jjh.collections.arrays

/**
 * Arrays are mutable collections of a specified type
 * of object. E.g. Array[String] is a mutable array of
 * Strings
 */
object ArraysExamplesTest extends App {
  // val myArray: Array[String] = new Array[String](3)
  val myArray = new Array[String](3)

  // long hand form
  // myArray.update(o) = "Hello";
  myArray(0) = "Hello "
  myArray(1) = "Scala "
  myArray(2) = "World"

  // myArray.apply(0) has the short hand form
  // myArray(0)
  for (i <- 0 to myArray.length - 1)
    print(myArray(i))

  println("\n---------------------------")

  // More concise format
  val numberArray = Array("Zero ", "One ", "Two")
  for (i <- 0 to 2)
    print(numberArray(i))

  println("\n---------------------------")

  // This is equivalent to the following as Scala automatically
  // calls the factory method apply for you
  val numberArray2 = Array.apply("Zero ", "One ", "Two")
  for (i <- 0 to 2)
    print(numberArray2(i))
}
