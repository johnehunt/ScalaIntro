package com.jjh.persons

/**
 * Pattern Guards
 */
object PersonMatchTest2 {

  def main(args: Array[String]): Unit = {
    println(describe(Person("John", 55)))
    println(describe(Person("Denise", 53)))
    println(describe(Person("Adam", 12)))
    println(describe(Person("Phoebe", age = 22)))
  }

  def describe(x: Any): String = x match {
    case Person("John", 55) => "Dad"
    case Person("Denise", x) => s"Mum is $x"
    case Person(_, y) if y < 18 => "Child"
    case _ => "something else"
  }

}
