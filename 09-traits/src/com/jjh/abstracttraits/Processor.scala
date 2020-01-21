package com.jjh.abstracttraits

class Processor extends Sample {
  override type T = String

  override def transform(x: T): T = x + x

  override val initial: T = "Start"
  override var current: T = initial
}
