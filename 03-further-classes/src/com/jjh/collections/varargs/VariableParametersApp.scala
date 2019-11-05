package com.jjh.collections.varargs

object VariableParametersApp {

  def main(args: Array[String]): Unit = {

    echo()

    println("-" * 10)
    echo("John")

    println("-" * 10)
    echo("John", "was", "here")

  }

  /*
   * If last parameter has a trailing * then this can be a variable
   * parameter list - this allows variable length argument lists.
   * Inside the method or function the repeated parameter is an array
   */
  def echo(args: String*): Unit = for (arg <- args) println(arg)

}
