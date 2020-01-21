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
  }

  def getAsInt(x: Any): Int = x match {
    case s: String => s.toInt
    case i: Int => i
    case d: Double => d.toInt
    case _ => -1
  }

}
