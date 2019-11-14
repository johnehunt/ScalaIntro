package com.jjh.payroll

class Person(name: String, hours: Int, rate: Double) {
  def calculatePay(): Double = 0.0
}

object Payroll {
  def generatePayslip(person: Person): String = {
    s"You earned ${person.calculatePay()}"
  }
}
