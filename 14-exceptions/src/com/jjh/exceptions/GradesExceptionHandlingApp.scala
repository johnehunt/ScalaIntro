package com.jjh.exceptions

/**
 * Example of using exception handlign with
 * Scala source to read data
 * from a file.
 */
object Grades {
  import scala.collection.mutable.ListBuffer
  import scala.io.Source
  import java.io.FileNotFoundException
  import java.nio.file.Paths

  private var marks = ListBuffer[String]()

  def printGrades(): Unit = {
    println("Loading data")
    loadData("input.data")
    if (marks.nonEmpty) {
      println("Marks:")
      for (i <- marks.indices) {
        println("\t " + marks(i))
      }
    }
  }

  private def loadData(filename: String): Unit = {
    println(s"Starting loadData for $filename")
    var source: Option[Source] = None
    try {
      val path = Paths.get("14-exceptions/" + filename)
      println(s"loading data from ${path.toAbsolutePath}")
      source = Some(Source.fromFile(path.toFile))
      source.get.getLines.foreach {
        e => marks += e
      }
    } catch {
      case ex: FileNotFoundException =>
        println("Whoops we have a problem")
        ex.printStackTrace()
    } finally {
      source match {
        case Some(x) =>
          source.get.close()
          println("Finished Reading Data")
        case None => println("Problem with source")
      }
    }
  }
}

// Runs the sample application
object GradesExceptionHandlingApp extends App {
  println("Starting GradesExceptionHandlingApp")
  Grades.printGrades()
  println("Done")
}
