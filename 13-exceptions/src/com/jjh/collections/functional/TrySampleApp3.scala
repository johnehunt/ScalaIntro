package com.jjh.collections.functional

import scala.util.Try

object TrySampleApp3 extends App {
  val i = Try { "4".toInt } map { n => n * n }
  println(i)
  val j = Try ( "s".toInt ) recover {
    case nfe: NumberFormatException => 0
  }
  println(j)
}
