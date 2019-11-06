package com.jjh.people

class Person4(val name: String, var age: Int) {

  // Auxiliary Constructor - provides default age
  def this(name: String) = this(name, 18)

  // Provides a defualt way to convert instance to a string
  override def toString: String = s"Person($name, $age)"
}

object Person4TestApp extends App {
  val p1 = new Person4("John", 55)
  println(p1)
}