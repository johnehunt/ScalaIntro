package com.jjh.lights
/*
 * Set up case objects to represent
 * the colours of a traffic light
 */
case object Red
case object Yellow
case object Green

object Amber

object LightsCaseObjectApp extends App {

  val c1 = Red
  val c2 = Yellow
  val c3 = Red

  println(Amber)

  println(Red, Yellow, Green)
  println(c1 equals c2)
  println(c1 equals c3)

}

