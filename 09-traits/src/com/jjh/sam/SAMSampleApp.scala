package com.jjh.sam

// Illustrates a Single Abstract Method Trait
trait Drivable {
  def drive(miles: Int): Unit
}

object SAMSampleApp extends App {
  // SHows do not need a class or object to implement SAM
  val d: Drivable = (m: Int) => println(s"Mustang driven $m miles")
  d.drive(100)
}
