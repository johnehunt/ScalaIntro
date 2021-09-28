package com.jjh.trafficlights

trait TrafficLight

// Can use traits to create objects

case object Red extends TrafficLight
case object Yellow extends TrafficLight
case object Green extends TrafficLight

object Test extends App {
  
  val c1 = Red
  val c2 = Yellow
  val c3 = Red
  
  println(Red, Yellow)
  println(c1 equals c2)
  println(c1 equals c3)
  
}

