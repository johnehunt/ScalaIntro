package com.jjh.collections.maps

import scala.collection.mutable

object MutableMapTest extends App {

  // Create a mutable map - note style of import and use
  val map = mutable.HashMap[String,String]()

  map.addOne("Ireland" -> "Dublin")
  map += ("UK" -> "London") // += alias for addOne
  map.addOne("FRANCE" -> "Paris")
  map.addOne("Spain" -> "Madrid")

  println(map)
  println(map.size)
  println(map.keys)
  println(map.values)
  println(map.isEmpty)
  println(map.get("UK")) // Return value for key or None
  println(map("UK")) // Return value for key or NoSuchElementException
  println(map.contains("UK"))
  println(map.getOrElse("Germany", "Not known"))
}
