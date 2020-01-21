package com.jjh.imp.classes

object ExampleImplicitClassApp extends App {

  implicit class IntOps(i: Int) {
    def squared: Int = i * i

    def cubed: Int = i * i * i
  }

  println(s"2.cubed: ${2.cubed}")
  println(s"5.square: ${5.squared}")
}
