package com.jjh.functional

import scala.util.Try

object TrySampleApp2 extends App {
  val i = Try { "4".toInt } map { n => n * n }
  println(i)
  val j = Try {"xxx".toInt } map { n => n + 4 }
  println(j)
}
