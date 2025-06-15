package com.vk.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice!")

    playerChoice = readln()

    val randomNumber = (1..3).random()

    val choices = arrayOf("Rock", "Paper", "Scissor")
    computerChoice = choices[randomNumber - 1]

    println("Computer Choice $computerChoice")
    println("Player Choice $playerChoice")

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a tie")
    } else {
        println("$winner win!")
    }
}