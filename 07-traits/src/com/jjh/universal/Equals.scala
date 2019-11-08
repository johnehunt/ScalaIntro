package com.jjh.universal

trait Equals[T] extends Any {
  def equals(other: AnyVal): Boolean = other.equals(this)
}

trait Ordered[T] extends Any with Equals[T]

