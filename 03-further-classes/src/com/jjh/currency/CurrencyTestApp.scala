package com.jjh.currency

object CurrencyTestApp extends App {
  val c1 = new Currency(12)
  val c2 = new Currency(4, "EUR")
  // val c3 = new Currency(-1, "USD") // What happens here?
  c1.print()
  c1.printWithHeading(heading = "My Savings:")
  val c4 = c1 + c2
  println(c4)
  val c5 = c1 + 12
  println(c5)
}
