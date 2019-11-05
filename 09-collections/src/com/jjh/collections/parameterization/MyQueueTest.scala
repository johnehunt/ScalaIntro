package com.jjh.collections.parameterization

object MyQueueTest extends App {
  println("Setup")
  val queue = new MyQueue[String]()
  queue.enqueue("John")
  queue.enqueue("Denise")
  queue.enqueue("Phoebe")
  queue.enqueue("Adam")

  println("-" * 20)
  println(s"queue.head ${queue.head}")
  val name = queue.dequeue()
  println(s"name $name")
  println(s"queue.head ${queue.head}")
  println("enqueue('Paul')")
  queue.enqueue("Paul")
  println(s"queue.head ${queue.head}")
  println(s"queue $queue")
}