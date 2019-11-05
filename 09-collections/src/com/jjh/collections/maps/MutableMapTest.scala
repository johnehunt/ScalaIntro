package com.jjh.collections.maps

import scala.collection.mutable

object MutableMapTest extends App {

  // Create a mutable map - note style of import and use
  val map = mutable.HashMap[String,String]()

  map += ("UK" -> "London")
  map += ("FRANCE" -> "Paris")
  map += ("Spain" -> "Madrid")
  map += ("USA" -> "Washington. DC")

  println(map)
  println(map.size)
  println(map.keys)
  println(map.values)
  println(map.isEmpty)
  println(map.get("UK"))
  println(map("UK"))
  println(map.contains("UK"))
  println(map.getOrElse("Ireland", "Not known"))
}
