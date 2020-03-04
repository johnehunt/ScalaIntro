package com.jjh.collections.lists

/**
 * Lists are immutable sequences of objects that
 * share the same type.
 *
 * Note rule about methods which end with a : they
 * are applied to the right hand element not the
 * normal left hand element.
 */
object ListTest1 extends App {

  // List creation options
  val myList0: List[String] = List[String]("One", "Two", "Three")
  val myList1 = List[String]("One", "Two", "Three")
  val myList2 = List("One", "Two", "Three")
  val myIntList = List(1, 2, 3, 4, 5)

  // The list concatenation method that creates a new list
  // based on existing lists
  val longList = myList0 ++ myList1
  val longList2 = myList0 concat myList1  // Scala 2.13 onwards

  // The cons method that prepends a new element 
  // to the beginning of a list - takes constant time
  val newList = "Zero" :: myList2
  val newlist2 = myList2 prepended "Zero" // Scala 2.13 onwards

  // Allows for another way to create a new list
  // note Nil on end - creates an empty list
  val myList3 = "One" :: "Two" :: "Three" :: Nil

  // The (rarely used) append method -
  // note the time it takes to append to a list grows 
  // linearly with the size of the list
  val endList = myList2 :+ "End"
  val endList2 = myList2 appended "End" // Scala 2.13 onwards

  println(myList0)
  println(myList1)
  println(myList2)
  println(myList3)
  println(longList)
  println(newList)
  println(endList)
  println(longList2)
  println(newlist2)
  println(endList2)
}