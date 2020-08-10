package com.jjh.collections.arrays

case class Person(name: String = "")
case class Meter(amount: Double) extends AnyVal

object ArrayOfPersonApp extends App {

  val pa = Array.ofDim[Person](2, 3)
  println(pa)
  println(pa(0))

  println(s"pa[0][0]: ${pa(0)(0)}")

  println("-" * 25)

  val ma = Array.ofDim[Meter](2, 3)
  println(ma)
  println(ma(0))

  println(s"ma[0][0]: ${ma(0)(0)}")


}
