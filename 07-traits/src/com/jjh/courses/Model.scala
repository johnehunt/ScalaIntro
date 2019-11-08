package com.jjh.courses

/*
 * A Scala trait that defines:
 * 1. an (abstract) property value which will return Any type
 * 2. A (concrete) method printValue
 * 3. Abstract method printer
 *
 * Note this is NOT an abstract class! (Scala also has abstract classes)
 */
trait Model {
  val value: Any

  def printValue(): Unit = println(value)

  def printer(): Unit
}
