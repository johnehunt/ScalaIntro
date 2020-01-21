package com.jjh.patternmatching

object TupleMatchTest {

  def main(args: Array[String]): Unit = {
    val t1 = Tuple2(1, 2)
    val t2 = Tuple3("London", "UK", "Europe")
    val t3 = (47, "John", "Hunt", 12.75)
    val t4 = (1, 2, 3, 4, 5)
    tupleMatch(t1)
    tupleMatch(t2)
    tupleMatch(t3)
    tupleMatch(t4)
  }

  def tupleMatch(x: Any): Unit = x match {
    case (a, b) => println("2 Tuple matched: " + a + ", " + b)
    case (a, b, c) => println("3 Tuple matched: " + a + ", " + b + ", " + c)
    case (a, b, c, d) => println("4 Tuple matched: " + a + ", " + b + ", " + c + ", " + d)
    case _ => // Do nothing
  }

}
