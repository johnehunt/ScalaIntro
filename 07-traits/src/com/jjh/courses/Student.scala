package com.jjh.courses

class Person(val name: String, val age: Int) {
  override def toString: String = s"$name, $age"
}

class Student(_name: String, _age: Int, val subject: String)
  extends Person(_name, _age) with Model with Serializable {

  override def toString: String = super.toString + s" $subject"

  val value: Any = "Student"

  def printer(): Unit = println(s"value: $value")
}

object StudentTestApp extends App {
  val student = new Student("Adam", 21, "Biology")
  student.printer()
  student.printValue()
  val model: Model = student
  model.printer()
  val person: Person = student
  println(s"person: $person")
  val serilizable: Serializable = student
  println(s"serializable: $serilizable")
}