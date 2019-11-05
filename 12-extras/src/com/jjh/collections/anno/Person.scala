package com.jjh.collections.anno

import java.io.Serializable

@SerialVersionUID(1L)
class Person(val name: String, var age: Int) extends Serializable {
  @inline
  override def toString() = name + ": " + age;
}
