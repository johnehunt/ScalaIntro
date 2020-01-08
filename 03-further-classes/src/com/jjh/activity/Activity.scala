package com.jjh.activity

import java.util.Date

class Activity(val date: Date = new Date,
               var title: String = "title",
               var owner: String = "anybody",
               var status: String = "live") {
  override def toString: String = s"Activity($date, $title, $owner, $status)"
}

object TestApp extends App {
  // Traditional Syntax
  val activity1 = new Activity(title = "Shopping",
                               owner = "John",
                               status="ongoing")
  println(activity1)

  // Curly brackets syntax
  val activity2 = new Activity {
    title = "Cinema"
    owner = "John"
    status = "done"
  }

  println(activity2)

}

