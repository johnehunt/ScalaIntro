package com.jjh.futures

import com.jjh.book._
import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

object BookServiceApp2 extends App {

  Future {
    BookService.getBook("123")
    // BookService.getBook("999")
  } onComplete {
    case Success(book) => println(s"Success : $book")
    case Failure(e) => println(s"An error occurred $e")
  }

  println("Press Enter to terminate")
  scala.io.StdIn.readLine()
}
