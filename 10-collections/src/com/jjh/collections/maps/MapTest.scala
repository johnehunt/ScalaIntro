package com.jjh.collections.maps

object MapTest extends App {

  // Set up a map of flight numbers to destinations
  var flights = Map[Int, String]()
  flights = flights + (121 -> "Miami")
  flights = flights.updated(231, "Dublin")
  flights += (456 -> "Paris")  // Short hand form for update and assign

  // Print the Map
  println(s"flights: $flights")

  // print the details for one particular flight
  println(s"flights(231): ${flights(231)}")

  // Alternative (short hand) definition
  val flights2 = Map(121 -> "Miami", 231 -> "Dublin", 456 -> "Paris")
  println(s"flights2: $flights2")

}
