package com.jjh.marker

trait Decorator
trait Service

// Note immutable was s a built in marker trait prior to Scala 2.12
trait Immutable

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
