package com.jjh.currying

object Temp {
  def basicSum(x: Int, y: Int): Int = x * y
  println(basicSum(2, 3))

  def sum(x: Int)(y: Int): Int = x * y
  println(sum(2)(3))
}

class CurryTest {

  def printer(): Unit = { println("Hi") }

  def sum(x: Int)(y: Int): Int = x + y
  // plusTwo(y: Int): Int = 2 + y
  def plusTwoLL(y: Int): Int = sum(2)(y: Int)
  def plusTwoL(y: Int): Int = sum(2)(y: Int)
  def plusTwo(y: Int): Int = sum(2)(y)
  def plusTwoS(y: Int): Int => Int = sum(2)_
  def plusTwoRS: Int => Int = sum(2)
}

object CurryTest extends App {
  val test = new CurryTest
  println(test.sum(2)(4))

  // println(test.plusTwo(5))

  val plusOne = test.sum(1)_
  println(plusOne(10))
}