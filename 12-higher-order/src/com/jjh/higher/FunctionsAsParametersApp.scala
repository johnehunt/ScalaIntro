package com.jjh.higher

object Tester {
  def runFunction(func: Int => Int, num: Int): Int = {
    func(num)
  }

  def test(number: Int, condition: Int => Boolean): Boolean = {
    condition(number)
  }
}

object FunctionsAsParametersApp extends App {
  import Tester._

  println(runFunction(x => x + 1, 5))
  println(test(5, n => n % 2 == 0))

}
