package com.jjh.enumerations.days

object DaysOfWeek extends Enumeration {
  val Monday = Value
  val Tuesday = Value
  val Wednesday = Value
  val Thursday = Value
  val Friday = Value
}

object Weekend extends Enumeration {
  val Saturday, Sunday = Value
}

object Test4 extends App {
  val d = Weekend(0)
  println(d)
}

//object Test3 extends App {
//  val today = DaysOfWeek.Thursday
//  println(today.id)
//}

//object Test2 extends App {
//  DaysOfWeek.values.foreach(println(_))
//}

//object Test extends App {
//  val today = DaysOfWeek.Monday
//  println(today)
//  println(today < DaysOfWeek.Friday)
//}

//object Test1 extends App {
//  import DaysOfWeek._
//  val today = Monday
//  println(today)
//  println(today < Friday)
//}
