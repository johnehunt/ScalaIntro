package com.jjh.either

object EitherSampleApp extends App {
  val u1: Either[Int, String] = Left(1)
  val u2: Either[Int, String] = Right("foo")

  println(u1)
  println(u2)

  u1 match {
    case Left(n) => println(n)
    case Right(s) => println(s)
  }
}
