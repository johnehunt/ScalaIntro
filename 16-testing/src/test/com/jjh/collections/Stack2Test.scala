package com.jjh.collections

import org.junit.runner.RunWith
import org.scalatest.Suite
import org.scalatest.junit.JUnitRunner
import org.junit.Assert._

@RunWith(classOf[JUnitRunner])
class SuiteTest extends Suite with BeforeAndAfter {

  before {
    println("Before behaviour")
  }

  after {
    println("After behaviour")
  }

  def testStackCreation() = {
    val stack = new Stack[Int]()
    assertEquals("Size incorrect", 0, stack.size)
  }

  def testStackPush() {
    val stack = new Stack[Int]
    stack.push(42)
    assertEquals(1, stack.size)
  }

  def testStackPop() {
    val stack = new Stack[Int]
    stack.push(32)
    val x = stack.pop()
    assertEquals(32, x)
  }

}

