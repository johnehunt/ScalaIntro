package com.jjh.imp.function

import java.util.Date

case class Event(name: String, date: Option[Date] = None, state: String = "New") {
  def printDate(): Unit = date match {
    case Some(d) => println(d)
    case None => println("No date")
  }
  def printDate2(): Unit = println(date getOrElse "No date")
}

// Can use an implicit method to build events and hide the use of options
object Event {
  implicit def apply(d: Date): Option[Date] = Option(d)
}

object Test extends App {
  var e = Event("NewTrade")
  e.printDate2()

  e = Event("NewTrade", Option(new Date()))
  e.printDate2()

  import Event._
  e = Event("NewTrade", new Date())
  e.printDate2()
}