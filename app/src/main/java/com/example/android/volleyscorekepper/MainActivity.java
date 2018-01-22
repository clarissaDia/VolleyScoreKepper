package com.example.android.volleyscorekepper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int setTeam1= 0;
    int scoreTeam2 = 0;
    int setTeam2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void resetScore (View view) {
        scoreTeam1= 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    public void resetSet (View view) {
        setTeam1= 0;
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

