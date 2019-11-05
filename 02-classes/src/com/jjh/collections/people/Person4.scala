package com.jjh.collections.people

class Person4(val name: String, var age: Int) {

  // Auxiliary Constructor - provides default age
  def this(name: String) = this(name, 18)

  // Validates the data being received
  // If not met will throw a java.lang.IllegalArgumentException
  require(age > 0)

  // Runs when the object is first created
  // Can't use toString as not set yet
  println(s"Created: $name with age of $age")

  // Provides a defualt way to convert instance to a string
  override def toString: String = s"Person4($name, $age)"

}

object Person4App extends App {
  val p4 = new Person4("John", 18)
  // val p4 = new Person4("John", -1)
  println(p4)
}