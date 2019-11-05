package com.jjh.polymorphism

abstract class Base {
  def print(): Unit = { println("Base print") }
}

class Derived extends Base {
  override def print(): Unit = {
    super.print()
    println("Derived print")
  }
}

object PolymorphismTest extends App {
    val base : Base = new Derived()
    base.print()
}
