package com.jjh.collections.immutable

/**
 * Example of an immutable class.
 * Once a distance is created you cannot modify that instance,
 * adding to a distance returns a new distance instance.
 */
class Distance(val dist: Int, val distType: String) {
  def +(other: Distance): Distance = {
    new Distance(dist + other.dist, distType)
  }
  def -(other: Distance): Distance = {
    new Distance(dist - other.dist, distType)
  }

  override def toString: String = s"Distance($dist, $distType)"
}

object DistanceApp extends App {
  val d1 = new Distance(6, "feet")
  val d2 = new Distance(5, "feet")
  val d3 = d1 + d2
  println(d3)
}
