package com.jjh.higher

object FuncBuilder {

  def build(x: Int): Int => Int = {
    val func =  (y: Int) => x + y
    func
  }

}

object FuncBuilderApp extends App {
  val func = FuncBuilder.build(5)
  val result = func(3)
  println(result)
}