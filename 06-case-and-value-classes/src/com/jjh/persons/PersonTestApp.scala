package com.jjh.persons

/**
 * Working with objects of the Class Person.
 * See Person.scala
 */
object PersonTestApp extends App {

  val dad = Person()
  val mum = Person("Denise")
  val adam = Person("Adam", 20)
  val phoebe = Person("Phoebe", age = 22)

  // Uses default generated toString
  println(dad)
  println(phoebe)

  val temp = Person()

  // Uses content comparison
  if (temp == dad)
    println("Temp and Dad are equivalent")

  // Uses provided copy method
  val granny = mum.copy(age = 87)
  println(granny)

}
