package com.jjh.patterns

case class Command(operation: String, value: Int)

object PatternBindersExampleApp extends App {

  def testIt(cmd: Command): Unit =
    cmd match {
      case c@Command("add", v) => println(s"c: $c and v: $v")
      case c@Command("subtract", 1) => println(s"c: $c")
      case c@Command("increment", _) => println(s"increment $c")
      case c@Command(_, _) => println(s"resetting $c")
    }

  println("Starting")
  val cmd1 = Command("add", 3)
  testIt(cmd1)
  val cmd2 = Command("subtract", 1)
  testIt(cmd2)
  val cmd3 = Command("increment", 1)
  testIt(cmd3)
  val cmd4 = Command("reset", 0)
  testIt(cmd4)

  println("Done")

}
