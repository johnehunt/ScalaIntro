package com.jjh.imp.params

object ImplicitParamTest {

  implicit val v: Int = 2

  def main(args: Array[String]): Unit = {
    printer("John")
    println()
    println("-" * 20)
    printer("John")(4)
  }

  def printer(content: String)(implicit i: Int): Unit = {
    for (i <- 0 until i) print(content)
  }

}
