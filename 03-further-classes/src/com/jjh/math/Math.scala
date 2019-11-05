package com.jjh.math

object Math {

  def max(x: Int, y: Int): Int = {
    println(s"--> max($x, $y)")
    if (x > y)
      x
    else
      y
  }

  def max2(x: Int, y: Int): Int = if (x>y) x else y

}

object MathApp extends App {
  // Now uses singleton object to access methods
  println("Math.max(3, 4): " + Math.max(3, 4))
  println("Math.max2(3, 4): " + Math.max2(3, 4))
  println("Math.max(3, y=4): " + Math.max(3, y = 4))
}