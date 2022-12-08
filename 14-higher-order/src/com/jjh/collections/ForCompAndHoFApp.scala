package com.jjh.collections

object ForCompAndHoFApp extends App {
  // equivalent version based on filter map and foreach

  val numbers = List(1, 2, 4, 6, 5, 7, 3)
  for (num <- numbers;
       n = num * num;
       if num % 2 == 0 ) {
    println(n)
  }

  println("-" * 25)

  numbers
    .filter(n => n % 2 == 0)
    .map(n => n * n)
    .foreach(println)

}
