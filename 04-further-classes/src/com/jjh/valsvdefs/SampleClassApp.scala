package com.jjh.valsvdefs

import java.util.Date

class MyClass {
  val someTime = new Date()
  def anotherTime = new Date()
}

object SampleClassApp extends App {
  val inst = new MyClass()
  println(s"inst.someTime ${inst.someTime}")
  println(s"inst.anotherTime: ${inst.anotherTime}")
  Thread.sleep(5000)
  println("-" * 20)
  println(s"inst.someTime ${inst.someTime}")
  println(s"inst.anotherTime: ${inst.anotherTime}")
}
