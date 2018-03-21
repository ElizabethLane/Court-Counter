package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0;
    int TeamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(TeamAScore));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(TeamBScore));
    }

    /*Increases score Team A*/

    public void addThreeTeamA(View v){
        TeamAScore += 3;
        displayForTeamA();
    }
    public void addTwoTeamA(View v){
        TeamAScore += 2;
        displayForTeamA();
    }
    public void addOneTeamA(View v){
        TeamAScore += 1;
        displayForTeamA();
    }

    /*Increases score Team B*/

    public void addThreeTeamB(View v){
        TeamBScore += 3;
        displayForTeamB();
    }
    public void addTwoTeamB(View v){
        TeamBScore += 2;
        displayForTeamB();
    }
    public void addOneTeamB(View v){
        TeamBScore += 1;
        displayForTeamB();
    }

   /* Resets TeamA, TeamB scores to 0*/

    public void resetScore(View v){
        TeamAScore = 0;
        TeamBScore = 0;
        displayForTeamA();
        displayForTeamB();
    }

}
