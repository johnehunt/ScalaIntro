package com.jjh.futures

import com.jjh.book.{Book, BookService}

object BookServiceApp3 extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global

  Future {
    BookService.getBook("123")
  }.map(println)

  println("Press Enter to continue")
  scala.io.StdIn.readLine()

  Future {
    BookService.getBook("999")
  }.recoverWith { case e: Exception => Future {Book("not a book", "Anon", 0.0) }
  }.map(println)

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

}
