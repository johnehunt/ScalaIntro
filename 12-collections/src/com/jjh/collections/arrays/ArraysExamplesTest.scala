package com.jjh.collections.arrays

/**
 * Arrays are mutable collections of a specified type
 * of object. E.g. Array[String] is a mutable array of
 * Strings
 */
object ArraysExamplesTest extends App {
  // val myArray: Array[String] = new Array[String](3)
  val myArray = new Array[String](3)
  println(s"myArray: $myArray") // Prints array instance format e.g. [Ljava.lang.String;@5a39699c
  println(s"myArray(0): ${myArray(0)}") // Prints null

  println("-" * 30)

  // long hand form
  // myArray.update(o) = "Hello";
  myArray(0) = "Hello "
  myArray(1) = "Scala "
  myArray(2) = "World"

  // myArray.apply(0) has the short hand form
  // myArray(0)

  // To includes number
  for (i <- 0 to myArray.length - 1)
    println(myArray(i))

  println("-" * 30)

  // Use until to go to value -1
  for (i <- 0 until myArray.length)
    println(myArray(i))

  println("-" * 30)

  for (i <- myArray.indices)
    println(myArray(i))

  println("-" * 30)

  // More concise format
  val numberArray = Array("Zero ", "One ", "Two")
  for (i <- 0 to 2)
    print(numberArray(i))

  for (i <- numberArray)
    print(i)

  println()
  numberArray.foreach(print)
  println()

  println("-" * 30)

  // This is equivalent to the following as Scala automatically
  // calls the factory method apply for you
  val numberArray2 = Array.apply("Zero ", "One ", "Two")
  for (i <- 0 to 2)
    print(numberArray2(i))
}
