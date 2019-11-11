package com.jjh.lazily

import java.util.Date

class Record {
  // Only calculated the first tme its called
  lazy val now: String = new Date().toString
}

object LazyValTest extends App {
  val r1 = new Record()
  println(s"record: $r1")
  println(s"new Date(): ${new Date}")
  println("Sleep for 2 seconds")
  Thread.sleep(2000)
  println(s"r1.now: ${r1.now}")
  println("Sleep for another 2 seconds")
  Thread.sleep(2000)
  println(s"2nd new Date(): ${new Date}")
  println(s"r1.now: ${r1.now}")
}