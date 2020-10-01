package com.jjh.collections

object ShortFormFunctionLiteralTests extends App {
  // Can use as function literals with various Scala libraries
  val list = List(1, 2, 3, 4)
  var list2 = list.filter((x: Int) => x > 2)
  println(list2)
  // Short hand forms for function literals
  // e.g. 'target typing' this allows parameter type to be inferred
  // here because it is being applied to a list of integers
  list2 = list.filter((x) => x > 2)
  println(list2)
  // Can also write this without the parentheses
  list2 = list.filter(x => x > 2)
  println(list2)
  // Place holder syntax - allows for the variable
  // x itself to be implied
  list2 = list.filter(_ > 2)
  println(list2)
  // Place holder extreme!
  list.foreach(x => println(x))
  // Can replace whole parameter list and 
  // expression with underscore
  list.foreach(println _)
  // But Scala can imply the underscore so can 
  // just write
  list.foreach(println)
}