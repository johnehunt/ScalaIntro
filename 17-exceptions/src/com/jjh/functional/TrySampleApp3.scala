package com.jjh.functional

import scala.util.{Failure, Success, Try}

object TrySampleApp3 extends App {

  val i = Try(
    "4".toInt
  ).map(n => n * n)
  println(i)

  // Recover takes a PartialFunction that only handles
  // Exceptions
  val j = Try {
    "s".toInt
  } recover {
    case nfe: NumberFormatException =>
      println(nfe)
      0
  }
  println(j)

  // Can swap the exception for something else
  Try {
    "s".toInt
  }.recoverWith {
    case nfe: NumberFormatException =>
      println(nfe)
      Failure(new IllegalArgumentException())
  } match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }
}
