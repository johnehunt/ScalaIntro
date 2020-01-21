package com.jjh.functional

object TrySampleApp1 extends App {

  import scala.util.Try

  val integer = Try ( "123".toInt )
  println(integer)
  println(integer.isSuccess)
  println(integer.isFailure)
  println(integer.get)

  val j = Try ("Foobar".toInt )
  println(j)
  println(j.getOrElse(-1))

  import scala.util.{Failure, Success}

  Try { "123".toInt } match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }
}
