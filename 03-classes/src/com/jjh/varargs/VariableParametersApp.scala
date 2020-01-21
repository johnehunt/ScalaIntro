package com.jjh.varargs

object VariableParametersApp extends App {

  val printer = new Printer
  printer.echo()

  println("-" * 10)
  printer.echo("John")

  println("-" * 10)
  printer.echo("John", "was", "here")
}

/**
 * Note order of definition of class and object
 * is not significant.
 */
class Printer {
  /*
   * If last parameter has a trailing * then this can be a variable
   * parameter list - this allows variable length argument lists.
   * Inside the method or function the repeated parameter is an array
   */
  def echo(args: String*): Unit = for (arg <- args) println(arg)

}
