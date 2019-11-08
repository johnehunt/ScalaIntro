package com.jjh.abstracttraits

trait Sample {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}
