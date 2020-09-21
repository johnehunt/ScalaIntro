package com.jjh.anno

import java.io.Serializable

// Illustrates the usable of a class and a method annotation

@SerialVersionUID(1L)
class Person(val name: String, var age: Int) extends Serializable {
  @inline
  override def toString = s"$name : $age"
}
