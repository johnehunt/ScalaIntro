package com.jjh.collections

/**
 * Lists and looping
 */
object ForEachExampleApp extends App  {

    val myList = List("Zero", "One", "Two")

    // Loop through each element in the list
    myList.foreach(println)

    println("------------------")

    // More Scala oriented equivalent
    myList.foreach(e => println(e))

    println("------------------")

    // Can use an anonymous param
    myList.foreach(println(_))

    println("------------------")

    // Short hand form of above
    myList.foreach(println)
}
