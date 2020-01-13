package com.jjh.email

case class EMail(address: String)

// Custom case class companion object
object EMail {
  def apply(addr: String): EMail = {
    println("in apply(addr)")
    new EMail(addr + "@bbc.com")
  }
  def apply(name: String, domain: String): EMail = {
    println("in apply(name, domain)")
    new EMail(name+"@"+domain)
  }
}

object SampleApp extends App {
  val email1 = EMail("jjh")
  println(email1)
  val email2 = EMail("jjh", "hunt.com")
  println(email2)
  email2 match {
    case EMail(addr) => println(s"Name $addr")
    case _ => println("Something else")
  }
}
