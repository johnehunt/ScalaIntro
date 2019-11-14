package com.jjh.collections

import org.scalatest._

class StackTest2 extends FunSuite with BeforeAndAfter with BeforeAndAfterAll {

  before {
    println("Before behaviour")
  }

  after {
    println("After behaviour")
  }

  override def beforeAll(): Unit = {
    println("Before All")
  }

  override def afterAll(): Unit = {
    println("After All")
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

