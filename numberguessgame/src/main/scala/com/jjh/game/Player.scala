package com.jjh.game

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

class Player(val name: String,
             var guessCount: Int = 0,
             private var history: ListBuffer[Guess] = ListBuffer()) {

  def initialiseHistory(): Unit = {
    history = ListBuffer()
  }

  def initialiseGuessCount(): Unit = {
    guessCount = 0
  }

  def incrementCount(): Unit = {
    guessCount = guessCount + 1
  }

  def addGuess(guess: Guess): Unit = {
    history.addOne(guess)
  }

  def printHistory(): Unit = {
    history.foreach(println)
  }

  def makeAGuess(): Guess = {
    val guess = Guess(getUserInput(Game.GUESS_PROMPT))
    addGuess(guess)
    incrementCount()
    guess
  }

  private def getUserInput(prompt: String): Int = {
    var result = -1
    var inputAccepted = false
    while (! inputAccepted) {
      print(prompt)
      val inputString = readLine()
      if (inputString != "") {
        if (isOnlyDigits(inputString)) {
          result = inputString.toInt
          inputAccepted = true
        } else {
          println("You can only input whole, positive, integer numbers")
        }
      }
    }
    result
  }

  private def isOnlyDigits(s: String) = s.forall(_.isDigit)

  override def toString: String = s"Player($name, $guessCount, $history)"
}


class ComputerPlayer() extends Player("Computer") {

  private val random = scala.util.Random

  override def makeAGuess(): Guess = {
    val guess = Guess(random.nextInt(Game.MAX_VALUE))
    addGuess(guess)
    incrementCount()
    guess
  }

  override def toString: String = s"Computer${super.toString}"
}

case class Guess(value: Int)
