package com.jjh.calc

class Processor(val label: String) {
  def printIt(i: Int): Unit = println(s"$label: $i")
}

object ProcesorApp extends App {
  val proc = new Processor(">")
  proc.printIt(5)
  println("-" * 20)
  val func: Int => Unit = proc.printIt
  func(5)
}
