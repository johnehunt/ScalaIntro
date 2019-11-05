package com.jjh.collections.sessions

/**
 * Application to illustrate the use of the Session Object 9and Companion Class.
 */
object SessionTestApp extends App {
  val s1 = Session.Create
  println(s1)
  val s2 = Session.Create
  println(s2)
  val s3 = new Session(42)
  println(s3)
}
