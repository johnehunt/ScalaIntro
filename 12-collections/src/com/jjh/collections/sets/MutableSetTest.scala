package com.jjh.collections.sets

//import scala.collection.immutable.{Set => ImmutableSet}

import scala.collection.mutable

/**
 * Creating a mutable Set - note the import!
 * This makes sure we use a mutable Set.
 */
object MutableSetTest extends App {
  // Note style of reference again
  // This makes things clear - which set you are using
  val songs = mutable.Set("Chasing Pavements",
    "Rumour Has it",
    "Turning Tables")

  println(songs)

  songs.add("Skyfall")
  println(songs)

  songs.add("Cold Shoulder")
  println(songs)
}
