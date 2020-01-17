package com.jjh.flowofcontrol

object DoWhileLoopApp extends App {
  var a = 0

  // do loop execution
  do {
    print( s"$a, " )
    a = a + 1
  } while( a < 10 )

  println()

}

