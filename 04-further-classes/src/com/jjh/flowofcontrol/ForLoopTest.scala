package com.jjh.flowofcontrol

object ForLoopTest extends App {

  // Long hand form of a for loop
  // note to is a method called on the integer
  for (i <- (0).to(10)) {
    print(s"$i, ")
  }
  println()

  println("-" * 25)

  // Shorter more common form
  for (i <- 0 to 10) print(s"$i, ")
  println()

  println("-" * 25)
  val result1 = for (i <- 1 to 5) yield 10 * i
  println(result1)

  println("-" * 25)
  val result2 = for (n <- List("one", "two", "three")) yield n.substring(0, 2)
  println (result2)

  println("-" * 25)
  // For loops can have a generator, definition and a filter
  for (i <- 0 until 10;
       n = i * i;
       if i % 2 == 0) {
    println(s"i $i, n $n")
  }

  println("-" * 25)
  // can omit definition or a filter
  for (i <- 0 until 10; if i % 2 == 0) {
    println(s"i $i")
  }

  println("-" * 25)
  // can omit definition or a filter
  val results = for (i <- 0 until 10; if i % 2 == 0)
    yield 10 * i

  println(results)

}
