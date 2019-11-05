package com.jjh.collections

import org.junit.runner.RunWith
import org.scalatest.Suite
import org.scalatest.junit.JUnitRunner
import org.junit.Assert._

@RunWith(classOf[JUnitRunner])
class StackTest extends Suite {

  def testStackCreation() = {
    val s = new Stack[Int]()
    assertEquals("Size incorrect", 0, s.size)
  }

}
