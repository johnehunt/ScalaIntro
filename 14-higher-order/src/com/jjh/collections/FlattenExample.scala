package com.jjh.collections

object FlattenExample extends App {

  // Generate a list of lists
  val listOfLists = List(
    List(Person("John", 56), Person("Denise", 53)),
    List(Person("Phoebe", 23), Person("Adam", 21), Person("Joselyn", 18)),
    List(Person("Jasmine", 21), Person("Gryff", 24))
  )
  println(s"listOfLists: $listOfLists")

  // flatten the list
  val flattenedList = listOfLists.flatten
  println(s"flattened list: $flattenedList")

  // process the flattened list
  listOfLists.flatten.filter(p => p.age > 21).foreach(p => println(p))

}
