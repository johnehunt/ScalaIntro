package com.jjh.collections.anno

import java.io.Serializable

// Illustrates the useable of a class and a method annotation

@SerialVersionUID(1L)
class Person(val name: String, var age: Int) extends Serializable {
  @inline
  override def toString(): String = s"$name : $age"
}
