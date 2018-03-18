package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0;

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

    public void addThreeTeamA(View v){
        TeamAScore += 3;
        displayForTeamA(TeamAScore);
    }
    public void addTwoTeamA(View v){
        TeamAScore += 2;
        displayForTeamA(TeamAScore);
    }
    public void addOneTeamA(View v){
        TeamAScore += 1;
        displayForTeamA(TeamAScore);
    }

}
