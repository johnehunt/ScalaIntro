package com.jjh.people

/**
 * Person class with an auxilary constrcutor
 * @param name Name of Person
 * @param age Age of person
 */
class Person2(val name: String, var age: Int) {

  // Auxiliary Constructor - provides default age
  def this(name: String) = this(name, 18)

}

object Person2App extends App {
  val p1 = new Person2("John", 55)
  println(p1.name + " is " + p1.age)
  val p2 = new Person2("Denise")
  println(p2.name + " is " + p2.age)
}
