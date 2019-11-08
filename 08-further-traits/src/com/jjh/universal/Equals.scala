package com.jjh.universal

trait MyEquals[T] extends Any {
  def myequals(other: AnyVal): Boolean = other.equals(this)
}

trait Ordered[T] extends Any with MyEquals[T]

