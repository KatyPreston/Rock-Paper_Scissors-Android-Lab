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
    }

    public void onRockButtonClicked(View button){
        Game game = new Game();
        playerChoice.setText("Player chooses Rock");
        winner.setText(game.play(Choice.ROCK));
        computerChoice.setText(game.result.toString());
    }


    public void onPaperButtonClicked(View button){
        Game game = new Game();
        playerChoice.setText("Player chooses Paper");
        winner.setText(game.play(Choice.PAPER));
        computerChoice.setText(game.result.toString());
    }

    public void onScissorsButtonClicked(View button){
        Game game = new Game();
        playerChoice.setText("Player chooses Scissors");
        winner.setText(game.play(Choice.SCISSORS));
        computerChoice.setText(game.result.toString());
    }


}
