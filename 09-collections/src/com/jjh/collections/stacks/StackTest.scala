package com.jjh.collections.stacks

import scala.collection.mutable

object StackTest extends App {
  val stack = mutable.Stack[Int]()
  stack.push(1)
  stack.push(2)
  stack.push(3)
  println(stack)
  println("top: " + stack.top)
  println("pop: " + stack.pop)
  println("pop: " + stack.pop)
  println(stack)
}
