package com.jjh.employees

abstract class Person(_name: String = "John", var age: Int = 18) {
  // Override inherited toString
  override def toString: String = s"Person($name, $age)"

  //Define an abstract method
  def prettyPrint(): Unit

  // Concrete getter method
  def name: String = _name
}

class Graduate(_name: String,
               age: Int,
               degree: String,
               uni: String) extends Person(_name, age) {
  protected val institution: String = uni

  def this(n: String, a: Int, degree: String) = this(n, a, degree, "Oxford")

  override def toString: String = "Graduate [" + super.toString() + ", " + degree + "]"

  def prettyPrint(): Unit ={
    println("Graduate")
    println("\tName: " + _name)
    println("\tAge: " + age)
    println("\tDegree: " + degree)
    println("\tUniversity: " + uni)
  }
}

class Employee(n: String,
               a: Int,
               company: String) extends Person(n, a) {

  final def prettyPrint(): Unit = {
    println("Employee")
    println("\tName: " + name)
    println("\tAge: " + age)
    println("\tCompany: " + company)
  }

}

// Factory object for the Person hierarchy
object Person {
  def person(n: String, a: Int, company: String): Person = new Employee(n, a, company)

  def person(n: String, a: Int, degree: String, uni: String): Person = new Graduate(n, a, degree, uni)
}