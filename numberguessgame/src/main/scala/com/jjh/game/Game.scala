package com.jjh.game

import scala.io.StdIn.readLine

object Game {
  val MIN_VALUE = 0
  val MAX_VALUE = 10
  val MAX_NUMBER_OF_GUESSES = 4
  val GUESS_PROMPT = s"Please guess a number between $MIN_VALUE and $MAX_VALUE: "
}

class Game {

  private val random = scala.util.Random

  def welcomeMessage(): Unit = {
    println("Welcome to the number guess game")
  }

  def gameOverMessage(): Unit = println("Game Over")

  def getUesOrNoInput(prompt: String): String = {
    var invalidInput = true
    var userInput = ""
    while (invalidInput) {
      print(prompt)
      userInput = readLine().toLowerCase()
      if (userInput == "y" || userInput == "n") {
        invalidInput = false
      } else {
        println("Input Error - Input must be 'y' or 'n'")
      }
    }
    userInput
  }

  def printInstructions(): Unit = {
    val response = getUesOrNoInput("Do you want to see the instructions?: ")
    if (response == "y") {
      println(s"You have to guess a number between ${Game.MIN_VALUE} and ${Game.MAX_VALUE}")
      println("You can play as many times as you like")
    }
  }

  def getPlayer(): Player = {
    val computerPlays = getUesOrNoInput("Do you want the computer to play? ")
    if (computerPlays == "y") {
      new ComputerPlayer()
    } else {
      print("Please input your name: ")
      val name = readLine()
      new Player(name)
    }
  }

  def playGame(): Unit = {
    val player = getPlayer()
    var keepPlaying = true
    while (keepPlaying) {
      player.initialiseHistory()
      player.initialiseGuessCount()
      val numberToGuess = random.nextInt(Game.MAX_VALUE)

      var guess = player.makeAGuess()
      while (numberToGuess != guess.value && player.guessCount != Game.MAX_NUMBER_OF_GUESSES) {
        println("Sorry wrong number!")
        if (guess.value < numberToGuess) {
          println(s"${player.name} your guess was lower than the number")
        } else {
          println(s"${player.name} your guess was higher than the number")
        }
        guess = player.makeAGuess()
      }

      if (numberToGuess == guess.value) {
        println(s"Well done ${player.name} you won!")
        println(s"You took ${player.guessCount} goes to complete the game")
      } else {
        println(s"Sorry - ${player.name}  you loose")
      }

      println(s"The number you needed to guess was $numberToGuess")

      println(s"${player.name} your guesses were:")
      player.printHistory()

      val playAgain = getUesOrNoInput("Do you want to play again (y/n)?: ")
      if (playAgain == "n") {
        keepPlaying = false
      }
    }
  }

  def run(): Unit = {
    welcomeMessage()
    printInstructions()
    playGame()
    gameOverMessage()
  }

}
