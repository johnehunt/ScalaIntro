package com.jjh.universal

/**
 * Universal Trait - does no allocation
 * and extends Any.
 */
trait Printable extends Any {
  def print(): Unit = println(this)
}

/**
 * Value class that wraps an Int.
 */
class Wrapper(val underlying: Int)
          extends AnyVal with Printable

/**
 * Test App
 *
 */
object Main extends App {
  val p: Printable = new Wrapper(32)
  p.print()
}
