package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private ArrayList<Choice> computerChoice;
    Choice result;

    public Game(){
        this.computerChoice = new ArrayList<>();
        this.result = null;
    }

    public Choice randomComputerChoice(){
        computerChoice.add(Choice.ROCK);
        computerChoice.add(Choice.PAPER);
        computerChoice.add(Choice.SCISSORS);

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
            return "Computer wins";
        }
        else if(playerChoice == Choice.PAPER && computer == Choice.SCISSORS){
            return "Computer wins";
        }
        else if(playerChoice == Choice.SCISSORS && computer == Choice.ROCK){
            return "Computer wins";
        }
        else return "Player wins";
    }
}
