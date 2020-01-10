package com.jjh.collections.arrays

/**
 * Illustrates an example of creating a ragged array structure.
 */
object RaggedArraysExampleApp extends App {

  // Illustrates creating a ragged array
  val family = Array (
    Array("John", "Denise", "Phoebe", "Adam"),
    Array("Paul", "Fi", "Andrew", "James", "Joselyn")
  )
  println(s"family: $family")
  println(s"family.length: ${family.length}")
  println(s"family(0).length: ${family(0).length}")
  println(s"family(1).length: ${family(1).length}")

}
