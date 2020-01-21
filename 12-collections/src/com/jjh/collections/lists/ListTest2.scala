package com.jjh.collections.lists

object ListTest2 extends App {
  // Create a list of numbers
  val numbers = List(1, 2, 3, 4, 5)
  println(numbers)
  // Determine the length of the list
  println("length fo the list: " + numbers.length)
  // Reverse the list
  val rv = numbers.reverse
  println("Reversed: " + rv)
  // returns the list without its first 2 objects
  println("Drop first two objects: " + numbers.drop(2))
  // Returns the first element
  println("The first element: " + numbers.head)
  // Returns the last element
  println("The last Element: " + numbers.last)
  // Returns the list minus the first element
  println("The tailed list: " + numbers.tail)
  // Returns the list minus the last element
  println("The init part of the list: " + numbers.init)
  // Tests to see if the list is empty
  println("Is the list Empty: " + numbers.isEmpty)
  // Convert the list into a String
  val s = numbers.mkString(",")
  println("String format of list: " + s)
}