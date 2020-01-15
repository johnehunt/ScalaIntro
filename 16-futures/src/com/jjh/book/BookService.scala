package com.jjh.book

/**
 * Sample service for use with Futures
 */
object BookService {

  val books: Map[String, Book] =
    Map("123" -> Book("Scala for All", "John Smith", 12.99),
        "345" -> Book("Scala Futures", "Adam Davies", 11.55),
        "456" -> Book("Scala Play", "Jasmine Jones", 15.66))

  def getBook(isbn: String): Book = {
    Thread.sleep(1000) // Simulated delay
    books(isbn)
  }

}
