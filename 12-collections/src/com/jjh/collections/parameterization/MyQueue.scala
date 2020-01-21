package com.jjh.collections.parameterization

import scala.collection.mutable.ListBuffer

/**
 * Parameterized version of a simple Queue collection
 * class.
 * @tparam T The type held by the Queue
 */
class MyQueue[T] {
  
  private val content: ListBuffer[T] = new ListBuffer[T]

  // Make these look more like properties
  def head: T = content.head
  def size: Int = content.size
  
  def enqueue(x: T): Unit = content.append(x)
  
  def dequeue(): T = content.remove(0)
  
  override def toString = s"Queue-[${content.mkString(" | ")}]"
  
}
