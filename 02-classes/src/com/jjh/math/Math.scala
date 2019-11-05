package com.jjh.math

/**
 * Class illustrating some method definitions.
 */
class Math {

  def print(): Unit = {
    println("math")
  }

  def asString: String =  {
    // returns last value
    "Math"
  }

  def negate(value: Int): Int = {
    -value
  }

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
  val math = new Math()

  // Methods with no parameters
  math.print() // parenthesis are optional
  math.print
  println(math.asString) // cannot use parenthases

  // Method with a parameter
  println(math.negate(5))

  println("math.max(3, 4): " + math.max(3, 4))
  println("math.max2(3, 4): " + math.max2(3, 4))
  println("math.max(3, y=4): " + math.max(3, y = 4))
  println("math.max(x=3, y=4): " + math.max(x = 3, y = 4))
  println("math.max(y=3, x=4): " + math.max(y = 3, x = 4))
  println("math.max(x=3, 4): " + math.max(x=3, 4))
  // println("math.max(x=3, 4): " + math.max(4, x=3)) // invalid as positional param is assumed to be x
}
