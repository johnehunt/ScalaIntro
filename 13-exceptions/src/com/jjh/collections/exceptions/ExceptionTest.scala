package com.jjh.collections.exceptions

object ExceptionTest {

  def main(args: Array[String]): Unit = {
    try {
    	val r1 = new Rational(5, 0)
    } catch {
      case e: Exception => println("exception caught: " + e);
    }
  }

}
