package com.jjh.employees

class Person(_name: String = "John", var age: Int = 18) {
  // Override inherited toString
  override def toString: String = s"Person($name, $age)"

  def prettyPrint(): Unit = println("Person")

  // Concrete getter method
  def name: String = _name
}

class Graduate(_name: String,
               _age: Int,
               val degree: String,
               _uni: String) extends Person(_name, _age) {
  protected val institution: String = _uni

  def this(n: String, a: Int, degree: String) = this(n, a, degree, "Oxford")

  override def toString: String = "Graduate [" + super.toString() + ", " + degree + "]"

  override def prettyPrint(): Unit =
    println(s"Graduate($name, $age, $degree, $institution")
}

class Employee(n: String,
               a: Int,
               val company: String) extends Person(n, a) {

  override def prettyPrint(): Unit =
    println(s"Employee(Name: $name, Age: $age, Company: $company")

}

// Factory object for the Person hierarchy
object Person {
  def person(n: String, a: Int, company: String): Person = new Employee(n, a, company)

  def person(n: String, a: Int, degree: String, uni: String): Person = new Graduate(n, a, degree, uni)
}