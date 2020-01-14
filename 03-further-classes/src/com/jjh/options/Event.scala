package com.jjh.options

import java.util.Date

/**
 * Illustrates the use of an Option - as a wrapper
 * for a type that can be None or 'Some' value.
 */
class Event(val name: String,
            val date: Option[Date] = None,
            val state: String = "New") {
  def printDate(): Unit = date match {
    case Some(d) => println(d)
    case None => println("No Date")
  }

  def printDate2: Unit = println(date getOrElse "No Date")

  override def toString: String = s"Event($name, $date, $state)"
}

object Event {

  def create(name: String): Event = new Event(name, None)
  def create(name: String, d: Date): Event = new Event(name, Option(d))

  def create(name: String, d: Date, state: String): Event =
    new Event(name, Option(d), state)
}

object EventTestApp extends App {
  val e1 = Event.create("Trigger")
  println(e1)
  e1.printDate()
  e1.printDate2

  val e2 = Event create("Open", new Date(), "Waiting")
  println(e2)
  e1.printDate()
}
