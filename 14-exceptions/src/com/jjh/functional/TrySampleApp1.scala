package com.jjh.functional

import scala.util.Try

object TrySampleApp1 extends App {
  val i = Try ( "123".toInt )
  println(i)
  println(i.isSuccess)
  println(i.isFailure)
  println(i.get)
  val j = Try ("Foobar".toInt )
  println(j)
  println(j.getOrElse(-1))
}
