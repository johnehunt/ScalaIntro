package com.jjh.collections

import org.scalatest.funspec.AnyFunSpec

class StackFunSpecTest extends AnyFunSpec {

  describe("A Stack") {
    describe("when empty") {
      it("should have size 0") {
        val stack = new Stack[Int]
        assert(stack.size == 0)
      }

      it("should throw an error (IllegalStateException) if you pop it") {
        val stack = new Stack[Int]
        assertThrows[IllegalStateException] {
          stack.pop()
        }
      }
    }
  }

}

