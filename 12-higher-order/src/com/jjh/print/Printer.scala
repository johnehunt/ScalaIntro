package com.jjh.print

import java.io._
import java.util.Date

object Printer {

  def write(file: File, operation: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    operation(writer)
    writer.close()
  }

}

object PrinterTestApp extends App {

  import Printer._

  write(
    new File("data.txt"),
    (writer: PrintWriter) => writer.println(new Date())
  )
}
