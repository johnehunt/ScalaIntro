package com.jjh.collections.people

class Person2(val name: String, var age: Int) {

  // Auxiliary Constructor - provides default age
  def this(name: String) = this(name, 18)

}

object Person2App extends App {
  val p1 = new Person2(name = "John", age = 55)
  println(p1.name + " is " + p1.age)
  val p2 = new Person2(name = "Denise")
  println(p2.name + " is " + p2.age)
}
