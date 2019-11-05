package com.jjh.collections

import org.scalatest._

class Stack2Test extends FunSuite with BeforeAndAfter {

  before {
    println("Before behaviour")
  }

  after {
    println("After behaviour")
  }

  test("Create an empty Stack") {
    val stack = new Stack[Int]()
    assert(0 == stack.size)
  }

  test("Push a value onto the stack and check size is 1") {
    val stack = new Stack[Int]
    stack.push(42)
    assert(1 == stack.size)
  }

  test("Push value onto stack and pop it off again") {
    val stack = new Stack[Int]
    stack.push(32)
    val x = stack.pop()
    assert(32 == x)
  }

}

