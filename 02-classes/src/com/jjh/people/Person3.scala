package com.jjh.people

class Person3(val name: String, var age: Int) {

  // Auxiliary Constructor - provides default age
  def this(name: String) = this(name, 18)

  // Validates the data being received
  // If not met will throw a java.lang.IllegalArgumentException
  require(age > 0)

  // Runs when the object is first created
  // Can't use toString as not set yet
  println(s"Created: $name with age of $age")

}

object Person3App extends App {
  val p4 = new Person3("John", 18)
  // val p4 = new Person4("John", -1)
  println(s"${p4.name} is ${p4.age}")
}