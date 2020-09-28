package com.jjh.trades

sealed abstract class Trade

case class EquityTrade(name: String) extends Trade
case class FxTrade(currency1: String, currency2: String) extends Trade
case class InterestRateSwap(fixedRate: Double, floatingRate: Double) extends Trade
case class Swaption(data: String) extends Trade

object SealedTypeDescripter {
  def describe(x: Trade): String = x match {
    case EquityTrade(name) => s"EquityTrade $name"
    case FxTrade(curr1, curr2) => s"FxTrade $curr1, $curr2"
    case InterestRateSwap(5.0, _) => "An InterestRateSwap for 5.0"
    case Swaption("Bermudan") => "A Bermudan Swaption"
  }
}

object SealedClassTradeApp extends App {
  import SealedTypeDescripter._

  println(describe(EquityTrade("IBM")))
  println(describe(FxTrade("GBP", "USD")))
  println(describe(InterestRateSwap(5.0, 3.4)))
  println(describe(Swaption("Bermudan")))
}

