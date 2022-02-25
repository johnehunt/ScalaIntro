package com.jjh.exceptions

object ExceptionTest4 {

  // Be careful of finally clauses e.g. although they
  // run the result is from the try block or catch block
  def func1(): Int = try {
    1
  } finally {
    2
  }

  def func2(): Int = try {
    throw new RuntimeException("oops")
  } catch {
    case _: RuntimeException => 3
    case _ => 0  // equivalent of case_: Throwable => 0 which is considered better pratice
  } finally {
    println("In finally")
  }

  def main(args: Array[String]): Unit = {
    val x1 = func1()
    val x2 = func2()
    // What value for x and x2 is printed is printed
    println(x1)
    println(x2)
  }

}