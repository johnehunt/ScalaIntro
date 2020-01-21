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
  // Store instance of Cat in a variable c of type Cat
  var c = new Cat()
  println(c)

  // Create an instance of Tiger and store into var c
  // var c holds things of type Cat (or subclasses of Cat)
  c = new Tiger("Tigger")
  println(c)
}
