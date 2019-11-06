package com.jjh.futures

import com.jjh.book._

object BookServiceApp extends App {
  import scala.concurrent._
  import ExecutionContext.Implicits.global
  import scala.util.{Success, Failure}


  val future = Future {
    BookService.getBook("123")
    // BookService.getBook("999")
  }

  future onComplete {
    case Success(book) => println(s"Success : $book")
    case Failure(e) => println(s"An error occurred $e")
  }

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()

}
