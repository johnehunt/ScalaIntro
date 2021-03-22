package com.jjh.quantity

case class Quantity(value: Int) {
  def +(q: Quantity) : Int = value + q.value
  def -(q: Quantity) : Int = value - q.value
  def +(q: Int) : Int = value + q
  def -(q: Int) : Int = value + q
}

object QuantityExampleApp extends App {
  val q1 = Quantity(5)
  val q2 = Quantity(4)
  println(q1 + q2)
}