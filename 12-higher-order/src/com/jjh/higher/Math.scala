package com.jjh.higher

object Math1 {

  def processor(x: Double, y: Double, func: (Double, Double) => Double): Double = {
    func(x, y)
  }

  def processor(x: Int, func: Int => String): String = {
    func(x)
  }

}

object Math2 {

  type DoubleFunction = (Double, Double) => Double
  type IntToStringFunc = Int => String


  def processor(x: Double, y: Double, func: DoubleFunction): Double = {
    func(x, y)
  }

  def processor(x: Int, func: IntToStringFunc): String = {
    func(x)
  }
}

