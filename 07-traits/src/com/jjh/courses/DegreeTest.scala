package com.jjh.courses

/**
 * See:
 * Model.scala - defines a trait called model
 * Course.scala - a Scala Object that "implements" a trait called Model
 * Degree.scala - a Scala class that "implements" a trait called Model
 * Can now treat as a Degree or a Model.
 */
object DegreeTest extends App {
   // Create a Degree instance
   val d = new Degree()
   d.printValue()
   d.printer()

   // Assign the degree instance to a bval of type Model
   val m1: Model = d
   m1.printer()

   println("-" * 20)

   // Access the Course object methods
   Course.printValue()
   Course.printer()

   // Assign Course object to val of type Model
   val m2: Model = Course
   println(m2.value)
}
