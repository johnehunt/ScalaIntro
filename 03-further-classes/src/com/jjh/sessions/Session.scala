package com.jjh.sessions

/**
 * The Companion class
 */
class Session(var id: Int) {
  override def toString: String = "Session[" + id + "]"
  def printInfo(): Unit = {
    println(Session.MAX)
  }
}

/**
 * Its Companion (singleton) object
 */
object Session {
  private val MAX = 100
  private var counter = 0
  private def next(): Unit = counter = counter + 1
  def create(): Session = { next(); new Session(counter) }
}


