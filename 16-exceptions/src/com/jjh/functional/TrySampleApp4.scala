package com.jjh.functional

object TrySampleApp4 extends App {

  import scala.util.Try

  val i = Try(
    "4".toInt
  ).map(n => n * n)
  println(i)

  val j = Try {
    "s".toInt
  }.recover{
    case _: NumberFormatException => 0
  }.map(n => n * n)
  println(j)

}
