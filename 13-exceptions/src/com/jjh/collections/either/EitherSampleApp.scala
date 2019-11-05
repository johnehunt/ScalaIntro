package com.jjh.collections.either

object EitherSampleApp extends App {
  val u1: Either[Int, String] = Left(1)
  val u2: Either[Int, String] = Right("foo")
  val u3: Either[Int, String] = u1

  println(u1)
  println(u2)
  println(u3)

  u3 match {
    case Left(n) => println(n)
    case Right(s) => println(s)
  }

}
