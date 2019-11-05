package com.jjh.currying

/**
 * Now change the second params to take a function
 *
 * We now have a new control structure
 */
class CurryTest2 {
  def sum(x: Int)(op: Int => Int): Int = op(x)
}

object CurryTest2 extends App {
  val test = new CurryTest2
  val r1 = test.sum(5)(x => x + 3)
  println(r1)
  val r2 = test.sum(5) { x: Int => x + 3 }
  println(r2)
  val r3 = test.sum(5) { _ + 3 }
  println(r3)

  val fiver = test.sum(5)_
  val r4 = fiver { x => x + 3 }
  println(r4)

  val r5 = fiver { _ + 3 }
  println(r5)
}