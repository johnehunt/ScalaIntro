package com.jjh.sessions

/**
 * Application to illustrate the use of the Session Object 9and Companion Class.
 */
object SessionTestApp extends App {
  val s1 = Session.create()
  println(s1)
  val s2 = Session.create()
  println(s2)
  val s3 = new Session(42)
  println(s3)
}
