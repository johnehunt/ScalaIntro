package com.jjh.cars

class Car(val model: String, val specification: String)

object Printer {
  def printCar(car: Car): Unit = {
    import car._
    print(model + " - " + specification)
  }
}

object CarImportTestApp extends App {
  val car = new Car("Ford", specification = "Fiesta")
  Printer.printCar(car)
}
