package com.jjh.qanda

object AnswerTest extends App {
   var answer: Answer = Yes
   println(answer)
   answer = No
   println(answer)
   answer match {
      case Yes => print("its a yes")
      case No => print("its a No")
   }
}