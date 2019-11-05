package com.jjh.collections.people

class Person3(val name: String, var age: Int) {

  // Auxiliary Constructor - provides default age
  def this(name: String) = this(name, 18)

  // Provides a defualt way to convert instance to a string
  override def toString: String = s"Person($name, $age)"
}

object PersonTestApp extends App {
  val p1 = new Person3("John", 55)
  println(p1)
}