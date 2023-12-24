package com.example.rockpaperscissors



fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, or Scissors. what is your choice ")
    playerChoice = readln()

    var randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
    }
    when (randomNumber) {
        2 -> {
            computerChoice = "Paper"
        }
    }
    when (randomNumber) {
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)


    val winner= when {
        playerChoice == computerChoice -> "tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "tie") {
        println("It's a tie")
    }else if(winner =="player"){
            println("The player is the winner here")
        }
    else{
        println("Sorry :( The computer Won")


    }
}



