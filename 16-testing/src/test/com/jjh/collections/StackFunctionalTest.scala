package com.jjh.collections

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import scala.collection.mutable.Stack

@RunWith(classOf[JUnitRunner])
class StackFunctionTest extends FunSuite {

  test("Check Add-and-Pop a stack") {
    val stack = new Stack[Int]
    stack.push(1)
    assert(stack.pop() === 1)
  }

  test("Check an empty stack has no members") {
    val emptyStack = new Stack[Int]
    assert(emptyStack.length == 0)
  }

}

