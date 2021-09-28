package com.jjh.people

import com.jjh.persons

/**
 *  A person who uses our application.
 *
 * @constructor create a new person with a name and age.
 * @param name the person's name (immutable)
 * @param age the person's age in years which is mutable (its a var)
 */
class Person(val name: String, var age: Int)

object TestPersonApp extends App {
  val p1 = new persons.Person(name ="John", age = 56)
  println(p1.name + " is " + p1.age)
  val p2 = new persons.Person("Denise", 53)
  println(p2.name + " is " + p2.age)
  val p3 = new persons.Person("Jasmine", 21)
  println(p3.name + " is " + p3.age)
}