package com.jjh.enumerations.navigation

object Direction extends Enumeration {
   val North = Value(0)
   val East =  Value(90)
   val South = Value(180)
   val West =  Value(270)
}

object Test extends App {
  val d = Direction.East
  println(d)
  println(d.id)
  val d1 = Direction(90)
  println(d1)
}

