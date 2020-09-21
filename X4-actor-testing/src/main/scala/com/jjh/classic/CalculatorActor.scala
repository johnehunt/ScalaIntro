package com.jjh.classic

import akka.actor.{Actor, Props}

object CalculatorActor {
  def props: Props = Props(new CalculatorActor())
}

class CalculatorActor extends Actor {
  def receive: Receive = {
    case x: Int =>
      var total = x
      for (i <- 1 to x) total = total * i
      sender ! total
  }
}

