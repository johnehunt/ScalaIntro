package com.jjh.futures

import com.jjh.book._

object BookServiceApp2 extends App {

  import scala.concurrent._
  import ExecutionContext.Implicits.global

  val future = Future {
    BookService.getBook("123")
    // BookService.getBook("999")
  } recoverWith { case e: Exception => Future {Book("not a book", "Anon", 0.0)} }

  import scala.concurrent.duration._

  val book = Await.result(future, 2 seconds)
  println(s"Book: $book")

}
