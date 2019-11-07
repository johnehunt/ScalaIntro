package com.jjh.currying

class CurryTest3 {

  def process[A](filter: A => Boolean)(list: List[A]): List[A] = {
    lazy val recurse = process(filter) _

    list match {
      case head :: tail => if (filter(head)) {
        head :: recurse(tail)
      } else {
        recurse(tail)
      }

      case Nil => Nil
    }
  }

}

object CurryTest3 extends App {
  val test = new CurryTest3
  val even = (a: Int) => a % 2 == 0

  val numbersAsc = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
  val numbersDesc = 5 :: 4 :: 3 :: 2 :: 1 :: Nil

  println(test.process(even)(numbersAsc)) // [2, 4]
  println(test.process(even)(numbersDesc)) // [4, 2]

  val checkForEven = test.process(even)_

  println(checkForEven(numbersAsc))
}