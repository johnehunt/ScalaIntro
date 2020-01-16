package com.jjh.functional

import scala.util.Try

object TrySampleApp3 extends App {
  val i = Try ( "4".toInt ).map (n => n * n )
  println(i)
  // Recover takes a PartialFunction that only handles
  // Exceptions
  val j = Try { "s".toInt } recover {
    case nfe: NumberFormatException =>
      println(nfe)
      0
  }
  println(j)
}
