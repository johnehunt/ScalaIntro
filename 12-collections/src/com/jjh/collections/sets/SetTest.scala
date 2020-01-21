package com.jjh.collections.sets

/**
 * Creating an immutable set
 */
object SetTest extends App  {
    // Create an immutable Set
    val teams = Set("Liverpool", "West Ham", "Newcastle", "Everton")
    println(teams)
    println(teams.getClass)

    // Is  the same object?? Whats its type??
    val newTeams = teams + "Wolves"
    println(newTeams)
    println(newTeams.contains("West Ham"))
    println(newTeams.getClass)
}
