package com.jjh.collections.lazily

import java.util.Date

class Record {
  // Only calculated the first tme its called
  lazy val now: String = new Date().toString
}

object LazyValTest extends App {
  val r1 = new Record()
  println(r1)
  println(new Date().toString)
  println("Sleep for 2 seconds")
  Thread.sleep(2000)
  println(r1.now)
  println("Sleep for another 2 seconds")
  Thread.sleep(2000)
  println(new Date().toString)
  println(r1.now)
}