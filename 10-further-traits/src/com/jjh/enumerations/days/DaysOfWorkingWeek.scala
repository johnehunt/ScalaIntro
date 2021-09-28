package com.jjh.enumerations.days

object DaysOfWorkingWeek extends Enumeration {
  type DaysOfWorkingWeek = Value
  val Monday, Tuesday, Wednesday, Thursday, Friday = Value
}

object Test extends App {
  val today = DaysOfWeek.Monday
  println(today)
  
  import DaysOfWorkingWeek._
  def printDay(d: DaysOfWorkingWeek): Unit = { println(d) }
  
}
