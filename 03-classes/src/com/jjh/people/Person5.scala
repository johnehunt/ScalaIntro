package com.jjh.people

class Person5(val name: String, private val address: String, private var age: Int)

object Person5App extends App {
  val p = new Person5("John", "The High Street", 55)
  println(s"p: $p")
  println(s"p.name: ${p.name}")
  // println(s"p.age: ${p.address}") // Compilation error
  // println(s"p.age: ${p.age}") // Compilation error
}
