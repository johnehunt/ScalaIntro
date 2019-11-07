package com.jjh.function

object ClosuresTest extends App {
  var more = 100
  val increase = (x: Int) => x + more
  println(increase(10))
  more = 50
  println(increase(10))
}

