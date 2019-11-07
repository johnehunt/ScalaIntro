package com.jjh

package object banking {
  def printAccount(acc: Account): Unit = {
    import acc._
    println(name + ": " + number)
  }
}

