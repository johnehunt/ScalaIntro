package com.jjh.function

object Utils {
  var increment: Int => Int = (x: Int) => x + 3

  def resetFunc() {
    // Local variable is bound and stored on the heap
    // as it is used within the function body
    val addition = 50
    increment = (a: Int) => { a + addition }
  }
}

object ClosureTest2 extends App {
    import Utils._

    println(increment(5))
    resetFunc()
    println(increment(5))
}
