package com.jjh.collections.lists

object ListLoopExample extends App {
  val numList = List(2, 5, 8, 9, 3)

  // for loop execution with a collection
  for( a <- numList ){
    println( "Value of a: " + a )
  }
}
