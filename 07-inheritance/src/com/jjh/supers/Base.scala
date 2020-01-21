// Provides example of using super in a method
package com.jjh.supers

class Base {
  private val label = "Base"
  def print(): Unit = println(label)
}

class Derived extends Base {
  override def print(): Unit = {
    println("Derived before")
    super.print()
    println("Derived After")
  }
}

object SuperTestApp extends App {
  val derived = new Derived
  derived.print()
}