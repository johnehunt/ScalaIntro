package com.jjh.collections.patternmatching

/**
 * Example of simple pattern matching using
 * the match-case statement
 */
object MatchTestApp1 extends App {

  val arg = "John"
  val relationship =
    arg match {
      case "John" => "Dad"
      case "Denise" => "Mum"
      case "Phoebe" => "Daughter"
      case "Adam" => "Son"
      // Default / wildcard
      case _ => "WhoAreYou?"
    }
  println(relationship)

}
