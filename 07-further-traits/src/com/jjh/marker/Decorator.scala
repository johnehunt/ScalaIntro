package com.jjh.marker

trait Decorator

// Note immutable is a built in marker trait

trait MyReader extends Immutable with Decorator {
  def read(): Int
}

class ProcessorReader extends MyReader {
  override def read(): Int = 42
}

object DecoratorTest extends App {
  val pr = new ProcessorReader()
  print(pr.read())
}
