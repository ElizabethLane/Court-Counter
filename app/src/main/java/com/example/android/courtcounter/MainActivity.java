package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }

    int TeamAScore = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        score = TeamAScore;
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeTeamA(View v){
        displayForTeamA(TeamAScore);
    }
    public void addTwoTeamA(View v){
        displayForTeamA(TeamAScore);
    }
    public void addOneTeamA(View v){
        displayForTeamA(TeamAScore);
    }

}
