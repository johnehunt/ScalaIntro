package com.jjh.collections

/*
 * Lists and the class Person.
 * We can use the same techniques as the last example
 * but on user defined classes.
 */
object FilterAndMapOnPersonApp extends App {
  val dad = Person()
  val mum = Person("Denise")
  val adam = Person("Adam", 12)
  val phoebe = Person("Phoebe", age = 14)

  val family = List(dad, mum, adam, phoebe)

  // foreach here takes a function literal that takes 1 parameter
  // named m. The body of the function is println
  family.foreach { m: Person => println("Employee: " + m) }
  println("------------------")
  // Note Scala can infer the type of m, for example:
  family.foreach { m => println("Employee: " + m) }

  // get everyone over the age of 21
  val over21 = family.filter { _.age > 21 }
  println(over21)

  // Extract the ages and find the average
  val ages = family.map(_.age)
  println(ages)
  val averageAge = ages.sum / ages.size
  println("Average age: " + averageAge)
}
