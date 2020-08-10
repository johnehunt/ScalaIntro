package com.jjh.function

case class Book(author:String, title: String)

object UtilFuncs {
  val printIt: String => Unit = (s: String) => println(s)
  val printABook = (b: Book) => println(b)
  val printAll = (i: Int, b: Boolean, s: String) => println(s"$i $b $s")

  val printMessage: String => Unit = (s: String) => println(s)
  val printStuff: (Int, Boolean, String) => Unit =
    (i: Int, b: Boolean, s: String) => println(s"$i $b $s")

  type StuffFunction = (Int, Boolean, String) => Unit
  val printStuff2: StuffFunction =
    (i: Int, b: Boolean, s: String) => println(s"$i $b $s")
}

object FuncExamples extends App {

  import UtilFuncs._

  printStuff2(1, true, "hello")

}
