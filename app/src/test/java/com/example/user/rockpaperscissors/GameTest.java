package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    ArrayList<Choice> computer;


    @Before
    public void before(){
        computer = new ArrayList<>();
        game = new Game();
    }

   @Test
    public void canPlayGame(){
        computer.add(Choice.ROCK);
        assertEquals("Computer wins", game.play(Choice.SCISSORS));
   }

}
