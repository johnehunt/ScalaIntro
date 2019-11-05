package com.jjh.courses

/**
 * This object implements the Trait Model.
 *
 * It therefore "inherits" the method printValue
 * But must implement the method value.
 */
object Course extends Model {
  val value: Any = "Hello World"
  def printer(): Unit = println("Hello")
}
