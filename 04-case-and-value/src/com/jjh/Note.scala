package com.jjh

class Note(val name: String, val note: String)

object Note {
  def unapply(n: Note): Option[(String, String)] = {
    Some(n.name, n.note)
  }
}

object NoteApp extends App {
  val note = new Note("John", "Scala")
  note match {
    case Note(name, n) => println(s"name: $name, note $n")
  }
}

