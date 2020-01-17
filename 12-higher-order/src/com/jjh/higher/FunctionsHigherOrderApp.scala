package com.jjh.higher

object FunctionsHigherOrderApp extends App {

  val processor = (func: Int => Int, x: Int) => {
    func(x)
  }

  println(processor(y => y * y, 5))

}
