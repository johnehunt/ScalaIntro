package com.jjh.futures

import com.jjh.book.BookService

object BookServiceApp4 extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global
  import scala.util.Success

  // andThen takes a PartialFunction that may only
  // deal with some situations - intended for behaviour to trigger
  Future {
    BookService.getBook("123")
  } andThen {
    case Success(book) => println(book)
  } andThen {
    case Success(book) => println(book + " from the shop")
  } andThen {
    case _ => println("Done")
  }

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
}
