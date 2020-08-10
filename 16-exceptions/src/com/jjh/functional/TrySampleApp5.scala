package com.jjh.functional

import scala.util.Try

object TrySampleApp5 extends App {
  val i = Try ( "5".toInt ).getOrElse(0)
  println(i)
  val j = Try ( "s".toInt ).getOrElse(0)
  println(j)
}
