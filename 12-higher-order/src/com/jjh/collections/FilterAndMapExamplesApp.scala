package com.jjh.collections

/*
 * Lists and further list processing.
 */
object FilterAndMapExamplesApp extends App {
  // Create a list of numbers
  val numbers = List(1, 2, 3, 4, 5)
  println(numbers)
  // Apply a function used to filter the members
  // of the list and create a new list
  val f = numbers.filter(n => n < 3)
  println(s"Filtered: $f")
  // Apply a function to each of the members of the list
  // and create a new list of the same size
  val m = numbers.map(n => n + 10)
  println(s"Modified list: $m")
  // Short hand form of the above.
  // That is {n=>n+10} can be rewritten as (_+10) which means
  // you do not need to declare the input param
  val m2 = numbers.map(_ + 10)
  println(s"Modified List (alternative form): $m2")

  // foldLeft propagates state from one element to the next
  // i.e. to sum elements in a list you need to keep the running
  // total and add the next element
  val sum = numbers.foldLeft(0) { (total, element) => total + element }
  println(s"Sum of List using foldLeft: $sum")

  // As for fold left but starts with the right most value
  val sum2 = numbers.foldRight(0) { (total, element) => total + element }
  println(s"result of foldRight: $sum2")

  // Simpler version than either foldLeft or foldRight in this case
  val sum3 = numbers.sum
  println(s"numbers.sum: $sum3")

  val flattenedList = List(Array(1, 2, 3), Array(4, 5, 6)).flatten
  println(s"flattened list $flattenedList")

  // Apply map function to elements and list then flatten the result
  val contents = List(Array(1, 2, 3), Array(4, 5, 6))
  val result = contents.flatMap(x => x.toList.reverse)
  println(result)

}
