package com.jjh.math

/**
 * Class illustrating some method definitions / styles.
 */
class Math {

  /**
   * Basic method definition.
   */
  def print(): Unit = {
    println("math")
  }

  /**
   * Method returning a value.
   * Note the method is defined with parentheses and thus
   * cannot be called using parentheses.
   * @return a string representing the class
   */
  def asString: String =  {
    // returns last value
    "Math"
  }

  /**
   * Method take a single parameter of type Int
   * and returning an Int.
   * @param value the value to negate
   * @return the negated value
   */
  def negate(value: Int): Int = {
    -value
  }

  /**
   * Method with two paramters both of type Int.
   * Returns an Int
   */
  def max(x: Int, y: Int): Int = {
    println(s"--> max($x, $y)")
    if (x > y)
      x
    else
      y
  }

  /**
   * Method illustrating short hand form of declaration.
   */
  def max2(x: Int, y: Int): Int = if (x>y) x else y

  /**
   * Method with default values
   */

  def add(x: Int, y: Int = 1): Int = x + y

}

object MathApp extends App {
  val math = new Math()

  // Methods with no parameters
  math.print() // parenthesis are optional
  math.print
  println(math.asString)
  // println(math.asString()) // Warning! cannot use parentheses on this method

  // Method with a parameter
  println(math.negate(5))

  println("math.max(3, 4): " + math.max(3, 4))
  println("math.max2(3, 4): " + math.max2(3, 4))
  println("math.max(3, y=4): " + math.max(3, y = 4))
  println("math.max(x=3, y=4): " + math.max(x = 3, y = 4))
  println("math.max(y=3, x=4): " + math.max(y = 3, x = 4))
  println("math.max(x=3, 4): " + math.max(x=3, 4))

  // invalid as positional param is assumed to be x
  // println("math.max(4, x=3): " + math.max(4, x=3))

  println("math.add(5, 3): " + math.add(5, 3))
  println("math.add(5): " + math.add(5))
}
