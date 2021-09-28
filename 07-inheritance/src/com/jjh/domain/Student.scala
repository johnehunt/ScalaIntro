package com.jjh.domain

class Student(val name: String = "John Smith",
              val degree: String = "B.Sc.",
              val institution: String = "Oxford") {

  def printWelcomeMessage(): Unit = println(s"Hello $name")

  override def toString: String = s"Student($name, $degree, $institution)"

}

class PostGraduateStudent(val researchTopic: String) extends Student {

  def printDoResearch(): Unit = println(s"Doing research in $researchTopic")

}

object StudentTestApp extends App {
  val student = new PostGraduateStudent("A.I.")

  println(student)
  student.printWelcomeMessage()
  student.printDoResearch()

}