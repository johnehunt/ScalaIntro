package com.jjh.function

class Demo {

  val x = 32

  val increment: Int => Int = (x: Int) => x + 3
  val add: Int => Int = (y: Int) => y + x

}

object FunctionTest2 extends App {

  val demo = new Demo()
  val func = demo.increment
  println(func(5))

  val func2 = demo.add
  println(func2(5))

}
