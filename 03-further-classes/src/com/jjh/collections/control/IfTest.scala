package com.jjh.collections.control

object IfTest extends App {

  val name = "John"
  if (name == "John")
    println("Dad")
  else
    println("No Data")

  println("--------------------")

  // But if statements return a value
  val role =
    if (name == "John")
      "Dad"
    else
      "No Data"
  println(role)

}

