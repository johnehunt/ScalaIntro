package com.jjh.function

object ClosureTest2 {

  var increment: Int => Int = (x: Int) => x + 3

  def main(args: Array[String]): Unit = {
    println(increment(5))
    resetFunc()
    println(increment(5))
  }

  def resetFunc() {
    // Local variable is bound and stored on the heap
    // as it is used within the function body
    val addition = 50
    increment = (a: Int) => { a + addition }
  }
  
}
