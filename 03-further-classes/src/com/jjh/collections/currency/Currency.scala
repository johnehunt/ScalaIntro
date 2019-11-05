package com.jjh.collections.currency

class Currency(a: Long, d: String) {

  // Validates the data being received
  // If not met will throw a java.lang.IllegalArgumentException
  require(a > 0)
  // Runs when the object is first created
  // Can't use toString as not set yet
  println("Created: " + d + " " + a)

  // Setup instance fields
  private val _amount: Long = a
  val designation: String = d

  def amount: Long = {
    if (_amount < 0) 1 else _amount
  }

  private val exchangeRate = Map(
    "USD" -> Map("USD" -> 1.0, "EUR" -> 0.759, "GBP" -> 1.5),
    "EUR" -> Map("USD" -> 1.32, "EUR" -> 1.0, "GBP" -> 0.85),
    "GBP" -> Map("USD" -> 0.6, "EUR" -> 1.19, "GBP" -> 1.0))

  // Auxiliary Constructor
  def this(a: Long) = this(a, "GBP")

  // Always provide return type with public methods.
  // They are part of the class API and help clients know
  // what they will be given back.

  def printWithHeading(heading: String): Unit = {
    println(heading)
    println(this)
  }

  def print(): Unit = println(this)

  // Defining the add method
  def +(that: Currency): Currency = {
    val temp: Currency =
      if (this.designation == that.designation)
        that
      else
        convert(that)
    new Currency(
      this.amount + temp.amount, designation)
  }

  // Overloading the + method
  def +(newAmount: Long): Currency = new Currency(amount + newAmount, designation)

  private def convert(currency: Currency): Currency = {
    val rate = exchangeRate(currency.designation)(designation)
    val amount = math.round(currency.amount * rate)
    new Currency(amount, designation)
  }

  override def toString: String = designation + " " + amount

}
