package com.jjh.partiallyapplied

object PartiallyAppliedFunctions extends App {

  val sum = (a: Int, b: Int, c: Int) => a + b + c
  println(sum(1, 2, 3))

  val partialSum = sum(1, _: Int, 3)
  println(partialSum(2))

}
