package com.jjh.collections

import org.scalatest._

class StackTest extends FunSuite {

  test("Create an empty Stack") {
    val stack = new Stack[Int]()
    assert(stack.size == 0)
  }

}
