package com.jjh.collections.patterns

object HeadTailExampleApp extends App {

  def calcLength(l: List[String]): Int = l match {
    case Nil => 0 // Empty List
    case head :: tail => 1 + calcLength(tail)
  }

  val myList = List("1", "2", "3")
  val length = calcLength(myList)

  println(s"length $length")
}
