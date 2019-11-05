package com.jjh.people

/**
 *  A person who uses our application.
 *
 * @constructor create a new person with a name and age.
 * @param name the person's name (immutable)
 * @param age the person's age in years which is mutable (its a var)
 */
class Person(val name: String, var age: Int) { }

object TestPersonApp extends App {
  val p1 = new Person(name ="John", age = 55)
  println(p1.name + " is " + p1.age)
  val p2 = new Person("Denise", 53)
  println(p2.name + " is " + p2.age)
  val p3 = new Person("Jasmine", 20)
  println(p3.name + " is " + p3.age)
}