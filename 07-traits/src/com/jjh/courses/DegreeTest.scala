package com.jjh.courses

/**
 * See:
 * Model.scala - defines a trait called model
 * Course.scala - a Scala Object that "implements" a trait called Model
 * Degree.scala - a Scala class that "implements" a trait called Model
 * Can now treat as a Degree or a Model.
 */
object DegreeTest extends App {
   val d = new Degree()
   d.printValue()
   d.printer()
   val m1: Model = d
   m1.printer()

   println("-" * 20)

   Course.printValue()
   Course.printer()
   val m2: Model = Course
   println(m2.value)
}
