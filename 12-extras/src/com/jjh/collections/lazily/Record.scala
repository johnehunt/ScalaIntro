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
  Thread.sleep(2000)
  println(r1.now)
  Thread.sleep(2000)
  println(new Date().toString)
  println(r1.now)
}