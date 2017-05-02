package com.example.android.snookercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }
    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     *  Adds 1 to the score of Team 1 and displays it.
     */
    public void addOneForTeam1(View view){
        scoreTeam1 += 1;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 2 to the score of Team 1 and displays it.
     */
    public void addTwoForTeam1(View view){
        scoreTeam1 += 2;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 3 to the score of Team 1 and displays it.
     */
    public void addThreeForTeam1(View view){
        scoreTeam1 += 3;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 4 to the score of Team 1 and displays it.
     */
    public void addFourForTeam1(View view){
        scoreTeam1 += 4;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 5 to the score of Team 1 and displays it.
     */
    public void addFiveForTeam1(View view){
        scoreTeam1 += 5;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 6 to the score of Team 1 and displays it.
     */
    public void addSixForTeam1(View view){
        scoreTeam1 += 6;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 7 to the score of Team 1 and displays it.
     */
    public void addSevenForTeam1(View view){
        scoreTeam1 += 7;
        displayForTeam1(scoreTeam1);
    }
    /**
     *  Adds 1 to the score of Team 2 and displays it.
     */
    public void addOneForTeam2(View view){
        scoreTeam2 += 1;
        displayForTeam2(scoreTeam2);
    }
    /**
     *  Adds 2 to the score of Team 2 and displays it.
     */
    public void addTwoForTeam2(View view){
        scoreTeam2 += 2;
        displayForTeam2(scoreTeam2);
    }
    /**
     *  Adds 3 to the score of Team 2 and displays it.
     */
    public void addThreeForTeam2(View view){
        scoreTeam2 += 3;
        displayForTeam2(scoreTeam2);
    }
    /**
     *  Adds 4 to the score of Team 2 and displays it.
     */
    public void addFourForTeam2(View view){
        scoreTeam2 += 4;
        displayForTeam2(scoreTeam2);
    }
    /**
     *  Adds 5 to the score of Team 2 and displays it.
     */
    public void addFiveForTeam2(View view){
        scoreTeam2 += 5;
        displayForTeam2(scoreTeam2);
    }
    /**
     *  Adds 6 to the score of Team 2 and displays it.
     */
    public void addSixForTeam2(View view){
        scoreTeam2 += 6;
        displayForTeam2(scoreTeam2);
    }
    /**
     *  Adds 7 to the score of Team 2 and displays it.
     */
    public void addSevenForTeam2(View view){
        scoreTeam2 += 7;
        displayForTeam2(scoreTeam2);
    }

    /**
     *  Resets the score to 0 for both teams and displays it.
     */
    public void resetTheScore(View view){
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

}
