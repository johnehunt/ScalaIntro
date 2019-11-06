package com.jjh.collections.patternmatching

/**
 * Alternatively can bind value to a
 * variable in the wild card.
 */
object MatchTestApp3 {

  def main(args: Array[String]): Unit = {
    println(describe(5))
    println(describe(true))
    println(describe("hello"))
    println(describe(Nil))
    println(describe(42.6))
  }

  def describe(x: Any): String = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "welcome message"
    case Nil => "It was Nil"
    case somethingElseVariable => s"something else: $somethingElseVariable"
  }

}
