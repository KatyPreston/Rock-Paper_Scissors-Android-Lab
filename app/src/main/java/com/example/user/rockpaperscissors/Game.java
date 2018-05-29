package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private ArrayList<Choice> computerChoice;
    Choice result;
    int playerWins;
    int computerWins;

    public Game(){
        this.computerChoice = new ArrayList<>();
        this.result = null;
        this.playerWins = 0;
        this.computerWins = 0;

    }

    public Choice randomComputerChoice(){
        computerChoice.add(Choice.ROCK);
        computerChoice.add(Choice.PAPER);
        computerChoice.add(Choice.SCISSORS);
        computerChoice.add(Choice.LIZARD);
        computerChoice.add(Choice.SPOCK);

        Collections.shuffle(computerChoice);
        Choice result = computerChoice.get(0);
        this.result = result;
        return result;
    }

    public String play(Choice playerChoice){
        Choice computer = this.randomComputerChoice();

        if(playerChoice == computer){
            return "The players draw";
        }
        else if(playerChoice == Choice.ROCK && computer == Choice.PAPER){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.ROCK && computer == Choice.SPOCK){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.PAPER && computer == Choice.SCISSORS){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.PAPER && computer == Choice.LIZARD){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.SCISSORS && computer == Choice.ROCK){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.SCISSORS && computer == Choice.SPOCK){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.LIZARD && computer == Choice.ROCK){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.LIZARD && computer == Choice.SCISSORS){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.SPOCK && computer == Choice.PAPER){
            this.computerWins += 1;
            return "Computer wins";
        }
        else if(playerChoice == Choice.SPOCK && computer == Choice.LIZARD){
            this.computerWins += 1;
            return "Computer wins";
        }
        else this.playerWins += 1;
            return "Player wins";
    }


}
