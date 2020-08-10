package com.jjh.collections

import org.scalatest.funsuite.AnyFunSuite

//class StackTest extends FunSuite { // pre scalatest 3.2.0
class StackTest extends AnyFunSuite { // post Scalatest 3.2.0
  test("Create an empty Stack") {
    val stack = new Stack[Int]()
    assert(stack.size == 0)
  }

}
