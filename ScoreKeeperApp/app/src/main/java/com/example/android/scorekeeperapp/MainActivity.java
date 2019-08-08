package com.example.android.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    private TextView mScoreViewA;
    private TextView mScoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        mScoreViewA = (TextView) findViewById(R.id.ScoreA);
        mScoreViewA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        mScoreViewB = (TextView) findViewById(R.id.ScoreB);
        mScoreViewB.setText(String.valueOf(score));
    }

    /**
     * Add 6 points for Team A.
     */
    public void addSixPointsForTeamA(View v) {
        scoreA += 6;
        displayForTeamA(scoreA);
    }

    /**
     * Add 6 points for Team B.
     */
    public void addSixPointsForTeamB(View v) {
        scoreB += 6;
        displayForTeamB(scoreB);
    }

    /**
     * Add 1 point for Team A.
     */
    public void addOnePointForTeamA(View v) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Add 1 point for Team B.
     */
    public void addOnePointForTeamB(View v) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /**
     * Add 2 points for Team A.
     */
    public void addTwoPointsForTeamA(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * Add 2 points for Team B.
     */
    public void addTwoPointsForTeamB(View v) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     * Add 3 points for Team A.
     */
    public void addThreePointsForTeamA(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * Add 3 points for Team B.
     */
    public void addThreePointsForTeamB(View v) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * Reset button.
     */
    public void resetScores(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}