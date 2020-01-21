package com.jjh.basic

abstract class Printer {
  def printIt(s: String): Unit
}

case class LinePrinter(prefix: String) extends Printer {
  def printIt(message: String): Unit = println(prefix + message)
}


object BasicCaseClassExampleApp extends App {
   val l = LinePrinter("-->")
  l.printIt("Hi")
}
