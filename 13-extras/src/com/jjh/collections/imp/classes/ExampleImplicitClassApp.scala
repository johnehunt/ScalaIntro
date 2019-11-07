package com.jjh.collections.imp.classes

object ExampleImplicitClassApp extends App {

  implicit class IntOps(i: Int) {
    def squared: Int = i * i

    def cubed: Int = i * i * i
  }

  println(2.cubed)
  println(5.squared)
}
