package com.jjh.overridding

class Cat {
  val dangerous = false
  val name: String = "Sammy"

  override def toString: String = s"$name is " +
                  (if (dangerous) "dangerous" else " timid")
}

class Tiger(override val name: String) extends Cat {
  override val dangerous = true
}

object CatTest extends App {
  var c = new Cat()
  println(c)
  c = new Tiger("Tigger")
  println(c)
}
