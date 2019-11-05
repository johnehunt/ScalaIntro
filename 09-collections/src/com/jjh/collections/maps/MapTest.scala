package com.jjh.collections.maps

object MapTest extends App {

  // Set iup a map of flight numbers to destinations
  var flights = Map[Int, String]()
  flights += (121 -> "Miami")
  flights += (231 -> "Dublin")
  flights += (456 -> "Paris")

  // Print the Map
  println(s"flights: $flights")

  // print the details for one particular flight
  println(s"flights(231): ${flights(231)}")

  // Alternative (short hand) definition
  val flights2 = Map(121 -> "Miami", 231 -> "Dublin", 456 -> "Paris")
  println(s"flights2: $flights2")

}
