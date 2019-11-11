package com.jjh.print

import java.io.{File, PrintWriter}
import java.util.Date

object Printer2 {
  def write(file: File)(operation: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    operation(writer)
    writer.close()
  }
}

object Printer2TestApp extends App {
  import Printer2._
  val file = new File("data.txt")
  write(file) {
    writer => writer.println(new Date)
  }

  val fileWriter = write(file)_
  fileWriter {
    writer => writer.println(new Date)
  }

  fileWriter {
    _ println new Date
  }


}