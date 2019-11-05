package com.jjh.collections.functional

object TrySampleApp4 extends App {

  import scala.util.Try

  val i = Try { "4".toInt } map { n => n * n }
  println(i.get)
  val j = Try ( "s".toInt ) recover {
    case nfe: NumberFormatException => 0
  } map { n => n * n }
  println(j.get)

}
