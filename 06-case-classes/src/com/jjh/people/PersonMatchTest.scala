package com.jjh.people

/**
 * Constructor Patterns - performs a deep comparison
 */
object PersonMatchTest {
  def main(args: Array[String]): Unit = {
    println(describe(Person("John", 56)))
    println(describe(Person("Denise", 53)))
    println(describe(Person("Adam", 20)))
    println(describe(Person("Phoebe", age = 22)))
    println(describe(Person("Hunt", 81)))
    println(describe(List(1, 2, 3)))
  }

  def describe(x: Any): String = x match {
    case Person("John", _) => "Dad"
    case Person("Denise", age) => s"Mum is $age"
    case Person("Adam", 20) => "Son"
    case Person("Phoebe", 22) => "Daughter"
    // Use of wild card within pattern
    case Person("Hunt", _) => "Family Member"
    case _ => "something else"
  }
}
