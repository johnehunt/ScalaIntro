package com.jjh.transport {

  package personal {
    class Bike
  }

  case class Car(brand: String, model: String)

  package group {

    import com.jjh.transport.personal.Bike

    class TaxiFleet {
      val c = Car("Skoda", "Octavia")
      val b = new Bike
    }
  }

}

