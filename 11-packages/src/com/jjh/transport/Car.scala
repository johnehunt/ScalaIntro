package com.jjh.transport {

  // Nested package personal
  package personal {
    class Bike
  }

  case class Car(brand: String, model: String)

  // Another nexted package group
  package group {

    import com.jjh.transport.personal.Bike

    // nesting within a nested package
    package nested {
      class WaterTaxi
    }

    class TaxiFleet {
      val c: Car = Car("Skoda", "Octavia")
      val b: Bike = new Bike
    }
  }

}

