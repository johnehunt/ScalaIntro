package com.jjh.courses

/**
 * Mixing a Trait into a Class
 *
 * It therefore "inherits" the method printValue
 * But must implement the method value.
 *
 * Note a Scala class can implement zero or more traits using the with keyword.
 * E.g. class Course extends Student with Model with Underpaid with Young
 */
class Degree extends Model {
  val value: Any = "B.Sc."
  def printer(): Unit = println(s"Degree Award: $value")
}