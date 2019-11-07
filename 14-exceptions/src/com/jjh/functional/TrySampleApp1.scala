package com.jjh.functional

import scala.util.Try

object TrySampleApp1 extends App {
  val i = Try ( "123".toInt )
  println(i)
  val j = Try ("Foobar".toInt )
  println(j)
}
