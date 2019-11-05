package com.jjh.collections.sessions

/**
 * The Companion class
 */
class Session(var id: Int) {
  override def toString: String = "Session[" + id + "]"
}

/**
 * Its Companion (singleton) object
 */
object Session {
  private var counter = 0
  private def next(): Unit = counter = counter + 1
  def Create: Session = { next(); new Session(counter) }
}


