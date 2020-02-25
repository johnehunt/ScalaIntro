package com.jjh.classic

import akka.actor.ActorSystem
import akka.testkit.{ImplicitSender, TestActors, TestKit}
import org.scalatest.BeforeAndAfterAll
import org.scalatest.funspec.AnyFunSpecLike

/**
 * Set up the test class to use the TestKit for the Actor System.
 * Note you must mix in the trait associated with the testing style; in this
 * case that is the AnyFunSpecLike trait.
 */
class CalculatorActorTest
  extends TestKit(ActorSystem("MyTestActorSystem"))
  with ImplicitSender
  with AnyFunSpecLike
  with BeforeAndAfterAll {

  describe("A CalculatorActor") {
    describe("when sent a message") {
      it("should calculate the total up to the int 4") {
        val actor = system.actorOf(CalculatorActor.props)
        actor ! 4
        expectMsg(96)
      }
    }
  }

  override def afterAll: Unit = {
    TestKit.shutdownActorSystem(system)
  }

}
