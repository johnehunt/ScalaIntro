package com.jjh.tail

import scala.annotation.tailrec

object TailRecursionTest {
  
  def main(args: Array[String]): Unit = {
    bang(4)
  }

  @tailrec
  def bang(x: Int): Int = {
    if (x == 0) throw new Exception("Bang!")
    else bang(x - 1) // +1
  }

}