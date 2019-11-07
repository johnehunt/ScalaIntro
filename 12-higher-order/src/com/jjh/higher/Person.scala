package com.jjh.higher

class Person(val salary: Double) {
   var taxToPay = 0.0
   def calculateTax(calculator: Double => Double): Unit = {
     taxToPay = calculator(salary)
   }
}

object TestPerson extends App {
  val taxCalculator = (x: Double) => Math.ceil(x * 0.3)
  val p = new Person(45000.0)
  p.calculateTax(taxCalculator)
  println(p.taxToPay)
}
