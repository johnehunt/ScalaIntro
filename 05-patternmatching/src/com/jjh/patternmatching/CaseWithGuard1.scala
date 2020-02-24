package com.jjh.patternmatching

object CaseWithGuard1 extends App {

  val num = 1

  num match {
    case x if x == 1 => println("one")
    case x if x == 2 || x == 3 => println(x)
    case _ => println("some other value")
  }

  num match {
    case x if 0 to 9 contains x => println("0-9 range: " + x)
    case b if 10 to 19 contains b => println("10-19 range: " + b)
    case _ => println("Something else")
  }
}
