package com.example.android.volleyscorekepper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int setTeam1 = 0;
    int scoreTeam2 = 0;
    int setTeam2 = 0;
    static final String STATE_SCORETEAM1 = "Team1Score";
    static final String STATE_SCORETEAM2 = "Team2Score";
    static final String STATE_SETTEAM1 = "Team1Set";
    static final String STATE_SETTEAM2 = "Team2Set";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCORETEAM1, scoreTeam1);
        savedInstanceState.putInt(STATE_SCORETEAM2, scoreTeam2);
        savedInstanceState.putInt(STATE_SETTEAM1, setTeam1);
        savedInstanceState.putInt(STATE_SETTEAM2, setTeam2);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scoreTeam1 = savedInstanceState.getInt(STATE_SCORETEAM1);
        scoreTeam2 = savedInstanceState.getInt(STATE_SCORETEAM2);
        setTeam1 = savedInstanceState.getInt(STATE_SETTEAM1);
        setTeam2 = savedInstanceState.getInt(STATE_SETTEAM2);
    }


    public void addOneForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    public void addSetForTeam1(View view) {
        setTeam1 = setTeam1 + 1;
        displaySetTeam1(setTeam1);
    }

    public void addOneForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

    public void addSetForTeam2(View view) {
        setTeam2 = setTeam2 + 1;
        displaySetTeam2(setTeam2);
    }

    public void resetScore(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    public void resetSet(View view) {
        setTeam1 = 0;
        setTeam2 = 0;
        displaySetTeam1(setTeam1);
        displaySetTeam2(setTeam2);
    }


    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_set);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_set);
        scoreView.setText(String.valueOf(score));
    }

}

