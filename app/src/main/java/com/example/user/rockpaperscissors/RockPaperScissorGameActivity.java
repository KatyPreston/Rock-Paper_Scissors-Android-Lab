package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorGameActivity extends AppCompatActivity {
    Button rock;
    Button paper;
    Button scissors;
    TextView playerChoice;
    TextView computerChoice;
    TextView winner;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissor_game);

        playerChoice = findViewById(R.id.player_choice);
        computerChoice = findViewById(R.id.computer_choice);
        winner = findViewById(R.id.winner);
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);
        game = new Game();
    }

    public void onRockButtonClicked(View view){
        playerChoice.setText("Player chooses ROCK");
        winner.setText(game.play(Choice.ROCK));
        computerChoice.setText("Computer chooses " + game.result.toString());
    }


    public void onPaperButtonClicked(View view){
        playerChoice.setText("Player chooses PAPER");
        winner.setText(game.play(Choice.PAPER));
        computerChoice.setText("Computer chooses " + game.result.toString());
    }

    public void onScissorsButtonClicked(View view){
        playerChoice.setText("Player chooses SCISSORS");
        winner.setText(game.play(Choice.SCISSORS));
        computerChoice.setText("Computer chooses " + game.result.toString());
    }

    public void onLizardButtonClicked(View view){
        playerChoice.setText("Player chooses LIZARD");
        winner.setText(game.play(Choice.LIZARD).toString());
        computerChoice.setText("Computer chooses " + game.result.toString());
    }

    public void onSpockButtonClicked(View view){
        playerChoice.setText("Player chooses SPOCK");
        winner.setText(game.play(Choice.SPOCK).toString());
        computerChoice.setText("Computer chooses " + game.result.toString());
    }


}
