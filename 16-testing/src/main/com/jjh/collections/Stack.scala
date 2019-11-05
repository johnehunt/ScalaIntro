package com.jjh.collections

class Stack[T] {

  import scala.collection.mutable.ListBuffer

  val MAX = 10
  private var contents = new ListBuffer[T]

  def push(o: T) {
    if (!full)
      o +: contents
    else
      throw new IllegalStateException("Stack Full")
  }

  def pop(): T = {
    if (!empty)
      contents.remove(0)
    else
      throw new IllegalStateException("Stack Empty")
  }

  def peek: T = {
    if (!empty)
      contents(0)
    else
      throw new IllegalStateException("Stack Empty")
  }

  def full: Boolean = contents.size == MAX
  def empty: Boolean = contents.size == 0
  def size: Int = contents.size

  override def toString = s"Stack(${contents})"
}