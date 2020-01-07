package com.jjh.patternmatching

/*
 * Example illustrating the flexibility
 * in the constant patterns used with the case
 * statement
 */
object MatchTestApp2 {

  def main(args: Array[String]): Unit = {
    println(describe(5))
    println(describe(true))
    println(describe("hello"))
    println(describe(Nil))
    println(describe(List(1,2,3)))
  }

  def describe(x: Any): String = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "welcome message"
    case Nil => "The empty list"
    case _ => "something else"
  }

}
