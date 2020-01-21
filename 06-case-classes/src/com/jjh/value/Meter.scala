package com.jjh.value

/**
 * Value class representing a Meter.
 * Provides more semantic meaning than just a Double
 * But with little overhead.
 * @param value The size of Meter
 */
case class Meter(value: Double) extends AnyVal {
  def +(m: Meter) : Meter = Meter(value + m.value)
}

object Main extends App {
  println("Creating Value instances")
  val x = Meter(3.4)
  val y = Meter(4.3)
  println("Adding Value instances together")
  val z = x + y
  println("Result: " + z + " has the value: " + z.value)
}
