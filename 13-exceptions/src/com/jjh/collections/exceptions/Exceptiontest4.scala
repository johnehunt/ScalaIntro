package com.jjh.collections.exceptions

object ExceptionTest4 {

  def main(args: Array[String]): Unit = {
    val x = func1()
    //val x = func2()
    // What value for X is printed
    println(x)
  }
  
  // Be careful of finally clauses e.g.
  def func1(): Int = try {return 1 } finally { return 2}
  def func2(): Int = try {1} finally {2}

}