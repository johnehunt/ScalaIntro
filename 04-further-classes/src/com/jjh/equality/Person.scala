package com.jjh.equality

class Person(val name: String, val age: Int) {

  override def equals(other: Any): Boolean = other match {
    case that: Person =>
        name == that.name &&
        age == that.age
    case _ => false
  }

  override def hashCode(): Int = name.hashCode() + age
}
