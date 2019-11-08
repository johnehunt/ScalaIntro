package com.jjh.lights

case object Red
case object Yellow
case object Green

object LightsCaseObjectApp extends App {

  val c1 = Red
  val c2 = Yellow
  val c3 = Red

  println(Red, Yellow, Green)
  println(c1 equals c2)
  println(c1 equals c3)

}

