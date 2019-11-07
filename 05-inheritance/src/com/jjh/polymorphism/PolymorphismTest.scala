package com.jjh.polymorphism

class Base {
  val label: String = "Base"
  def print(): Unit = println("Base print")
}

class Derived extends Base {
  override val label: String = "Derived"
  override def print(): Unit = {
    super.print()
    println("Derived print")
  }
}

object PolymorphismTest extends App {
  val base = new Base
  println(base.label)
  base.print()

  println("-" * 20)

  val derived = new Derived
  println(derived.label)
  derived.print()

  println("-" * 20)

  // polymorphism in action
  val base1 : Base = new Derived()
  base1.print()
}
