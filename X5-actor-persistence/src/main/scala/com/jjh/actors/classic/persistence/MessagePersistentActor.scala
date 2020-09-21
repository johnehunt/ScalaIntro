package com.jjh.actors.classic.persistence

import akka.persistence.{PersistentActor, SnapshotOffer}

sealed trait Operation
case class Message(data: String) extends Operation
case object Checkpoint extends Operation

case class Event(operation: Operation)
case class State(data: String)

class MessagePersistentActor(override val persistenceId: String) extends PersistentActor {
  private var state = State("")

  private def updateState(event: Event) {
    println(s"Updating state: $event")
    event match {
      case Event(Message(data)) => state = State(data)
    }
  }

  override def receiveRecover: Receive = {
    case event: Event =>
      println(s"Actor is recovering its state $event")
      updateState(event)
    case SnapshotOffer(_, snapshot: State) =>
      println(s"Snapshot data: $snapshot")
      state = snapshot
  }

  override def receiveCommand: Receive = {
    case message: Message =>
      println(s"$message is being processed")
      persist(Event(message)) { event =>
        updateState(event)
        println("Done Processing")
      }
    case Checkpoint => println(s"Current State: ${state.data}")
  }

}

object MessagePersistentActor {
  import akka.actor.Props
  def props(id: String): Props = Props(new MessagePersistentActor(id))
}
