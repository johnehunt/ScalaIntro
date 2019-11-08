package com.jjh.service

class Service {
   def printer(): Unit = { println("Service Hello") }
}

class Client(adapter: Adaptor) {
  def doWork(): Unit = { adapter.invoke() }
}

trait Adaptor {
  self: Service =>
  def invoke(): Unit = { printer() }
}

class AdaptedService extends Service with Adaptor

object Test2 extends App {
  val adapter = new AdaptedService()
  val client = new Client(adapter)
  client.doWork()
}
