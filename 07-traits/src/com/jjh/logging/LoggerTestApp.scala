package com.jjh.logging

class Person(val name: String) {
  override def toString =  s"Person[ $name ]"
}

trait Logger {
  log()
  def log():Unit = { println("Created") }
}

object LoggerTestApp extends App {
  val p = new Person("John") with Logger
  println(p)
}
