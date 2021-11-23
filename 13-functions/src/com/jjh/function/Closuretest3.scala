package com.jjh.function

object Builder {
  def buildFunction(x: Int): Int => Int = {
    val func = (y: Int) => x * y
    func
  }
}

object Closuretest3 extends App {
  val doubler = Builder.buildFunction(2)
  var tripler = Builder.buildFunction(3)

  println(doubler(4))
  println(tripler(4))
}
