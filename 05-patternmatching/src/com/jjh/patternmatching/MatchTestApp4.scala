package com.jjh.patternmatching

/**
 * Typed patterns - match by type
 */
object MatchTestApp4 {

  def main(args: Array[String]): Unit = {
    val s1 = "42"
    val i1 = 23
    val d1 = 55.6
    println(getAsInt(s1))
    println(getAsInt(i1))
    println(getAsInt(d1))

    getType("John")
  }

  def getAsInt(x: Any): Int = x match {
    case s: String => s.toInt
    case i: Int => i
    case d: Double => d.toInt
    case _ => -1
  }

  // If only interested in the type
  def getType(x: Any): Unit = x match {
    case _: String => println("Its a String")
    case _: Int => println("Its an Int")
    case _ => println("its something else")
  }

}
