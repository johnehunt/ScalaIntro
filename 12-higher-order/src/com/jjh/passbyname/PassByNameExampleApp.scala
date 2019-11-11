package com.jjh.passbyname

import java.util.Date

object PassByNameExampleApp extends App {

  def myFunc(param: => Date): Date = {
    println(new Date())
    Thread.sleep(1000)
    param
  }

  val result = myFunc(new Date())
  println(result)

}

