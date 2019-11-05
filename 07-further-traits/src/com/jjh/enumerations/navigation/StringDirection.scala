package com.jjh.enumerations.navigation

object StringDirection extends Enumeration {
   val North = Value("n")
   val East =  Value("e")
   val South = Value("s")
   val West =  Value("e")
}

object Test2 extends App {
  val d = Direction.North
  println(d)
  println(d.id)
  val d3 = Direction.withName("n")
  println(d3)
}