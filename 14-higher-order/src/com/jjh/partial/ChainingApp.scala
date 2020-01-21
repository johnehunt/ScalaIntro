package com.jjh.partial

object ChainingApp extends App {
  type Handler = PartialFunction[Int, Unit]

  val handleEvens: Handler = {
    case x if x % 2 == 0 => println("Handling even value " + x)
  }

  val handleOdds: Handler = {
    case x if x % 2 == 1 => println("Handling odd value " + x)
  }

  val handlePalindrome: Handler = {
    case x
      if x.toString.reverse == x.toString
    => println("Handling palindrome " + x)
  }
  // Create the chain
  val handlerChain = handlePalindrome orElse handleEvens orElse handleOdds
  handlerChain(51)
  handlerChain(42)
  handlerChain(121)
}
