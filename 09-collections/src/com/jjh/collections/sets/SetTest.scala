package com.jjh.collections.sets

/**
 * Creating an immutable set
 */
object SetTest extends App  {
    // Create an immutable Set
    var teams = Set("Liverpool", "West Ham", "Newcastle", "Everton")
    println(teams)

    // Is this the same object?? Whats its type??
    teams += "Wolves"
    println(teams)
    println(teams.contains("West Ham"))
}
