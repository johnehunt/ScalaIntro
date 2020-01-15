package com.jjh.functional

import scala.util.Try

object TrySampleApp2 extends App {
  // Only applies map to sucess as that is a container
  // of a value; Failure onctains an exception which
  // does not get applied to map
  val i = Try { "4".toInt } map { n => n * n }
  println(i)
  val j = Try {"xxx".toInt } map { n => n + 4 }
  println(j)
}
