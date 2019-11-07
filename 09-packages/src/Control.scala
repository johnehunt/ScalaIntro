package com.jjh.auto

package engine {
  class Petrol1
}

package family {
  package economy {
    package engine {
      class Petrol2
    }
    class Control {
      val b1 = new engine.Petrol2
      val b2 = new economy.engine.Petrol2
      val b3 = new family.engine.Petrol3
      // val b4 = new engine.Petrol1
      val b5 = new _root_.engine.Petrol1
    }
  }
  package engine {
    class Petrol3
  }
}



