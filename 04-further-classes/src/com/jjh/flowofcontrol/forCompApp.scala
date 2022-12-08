package com.jjh.flowofcontrol

object forCompApp extends App{
  object ForCompApp extends App {

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

    // can collect results using yield
    val results = for (i <- 0 until 10; if i % 2 == 0)
      yield 10 * i

    println(results)
  }

}
