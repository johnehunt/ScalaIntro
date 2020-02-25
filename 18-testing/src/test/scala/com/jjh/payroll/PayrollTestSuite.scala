package com.jjh.payroll

import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSpec

/**
 * An example of using ScalaMock with ScalaTest
 */
class PayrollTestSuite extends FunSpec with MockFactory {

  describe("A Payroll System") {
    describe("when presented with a person") {
      it("should generate a string indicating the amount to pay") {
        // Create a mock object for the Person class
        val mockPerson = mock[Person]
        // Indicates that the calculatePay method should be called once (the default)
        // and that when it is called it will return 55.0
        (mockPerson.calculatePay _).expects().once().returning(55.0)
        val response = Payroll.generatePayslip(mockPerson)
        assert(response == "You earned 55.0")
      }
    }
  }

}
