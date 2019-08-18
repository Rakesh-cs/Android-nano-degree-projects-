package com.example.android.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Context;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    int score = 0;

    /**
     * Question 1 answer
     * @param view check RadioButton when the team is selected
     */
    public void onRadioButtonClickedQuestion1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.miami_heat:
                if (checked)
                    getIntent().putExtra("score", 1);
                break;
            case R.id.new_york_knicks:
                if (checked)
                    break;
            case R.id.chicago_bulls:
                if (checked)
                    break;
        }
    }

    /**
     * Question 2 answer
     * @param view check RadioButton when the player is selected
     */
    public void onRadioButtonClickedQuestion2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.lebron_james:
                if (checked)
                    getIntent().putExtra("score", 1);
                break;
            case R.id.kevin_durant:
                if (checked)
                    break;
            case R.id.stephen_curry:
                if (checked)
                    break;
        }
    }

    /**
     * Question 3 answer
     * @param view check RadioButton when the player is selected
     */
    public void onRadioButtonClickedQuestion3(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.zach_randolph:
                if (checked)
                    break;
            case R.id.kobe_bryant:
                if (checked)
                    getIntent().putExtra("score", 1);
                break;
            case R.id.dikembe_mutombo:
                if (checked)
                    break;
        }
    }

    /**
     * Question 5 answer
     * @param view check RadioButton when the player is selected
     */
    public void onRadioButtonClickedQuestion4(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.ray_walter:
                getIntent().putExtra("score", 1);
                if (checked)
                    break;
            case R.id.ray_dejean:
                if (checked)
                    break;
            case R.id.ray_joey:
                if (checked)
                    break;
        }
    }

    /**
     *
     * Check the correct answers
     * calculate score
     * create Toast message with score
     *
     */

    public void showQuizScore (View view) {

        RadioButton miamiHeatRadioButton = (RadioButton) findViewById(R.id.miami_heat);
        boolean isMiamiHeat = miamiHeatRadioButton.isChecked();

        RadioButton kevinDurantRadioButton = (RadioButton) findViewById(R.id.kevin_durant);
        boolean isKevinDurant = kevinDurantRadioButton.isChecked();

        RadioButton kobeBryantRadioButton = (RadioButton) findViewById(R.id.kobe_bryant);
        boolean isKobeBryant = kobeBryantRadioButton.isChecked();

        CheckBox marcinGortatCheckBox = (CheckBox) findViewById(R.id.marcin_gortat);
        boolean isMarcinGortat = marcinGortatCheckBox.isChecked();

        CheckBox andreaBargnaniCheckBox = (CheckBox) findViewById(R.id.andrea_bargnani);
        boolean isAndreaBargnani = andreaBargnaniCheckBox.isChecked();

        CheckBox marcoBelinelliCheckbox = (CheckBox) findViewById(R.id.marco_belinelli);
        boolean isMarcoBelinelli = marcoBelinelliCheckbox.isChecked();

        CheckBox zazaPachuliaCheckBox = (CheckBox) findViewById(R.id.zaza_pachulia);
        boolean isZazaPachulia = zazaPachuliaCheckBox.isChecked();

        RadioButton rayWalterRadioButton = (RadioButton) findViewById(R.id.ray_walter);
        boolean isRayWalter = rayWalterRadioButton.isChecked();

        EditText answerQuestion6 = (EditText) findViewById(R.id.edit_text_answer_6);
        boolean isWiltChamberlain = answerQuestion6.getText().toString().matches("Wilt Chamberlain");

        EditText answerQuestion7 = (EditText) findViewById(R.id.edit_text_answer_7);
        boolean isCavaliersWarriors = answerQuestion7.getText().toString().matches("Cavaliers - Warriors 4-3");

        int score = calculateScore(isMiamiHeat, isKevinDurant, isKobeBryant, isMarcinGortat, isAndreaBargnani, isMarcoBelinelli, isZazaPachulia, isRayWalter, isWiltChamberlain, isCavaliersWarriors);

        Toast.makeText(this, getString(R.string.show_quiz_score) + score, Toast.LENGTH_LONG).show();

    }

    /**
     *
     * add points for correct answers
     * return real value of points
     */

    private int calculateScore(boolean isMiamiHeat, boolean isKevinDurant, boolean isKobeBryant, boolean isMarcinGortat, boolean isAndreaBargnani,  boolean isMarcoBelinelli, boolean isZazaPachulia, boolean isRayWalter, boolean isWiltChamberlain, boolean isCavaliersWarriors) {
        int startingScore = 0;

        if (isMiamiHeat) {
            startingScore = startingScore + 1;
        }

        if (isKevinDurant) {
            startingScore = startingScore + 1;
        }
        if (isKobeBryant) {
            startingScore = startingScore + 1;
        }
        if (isMarcinGortat && isAndreaBargnani &&! isMarcoBelinelli &&! isZazaPachulia) {
            startingScore = startingScore + 1;
        }
        if (isRayWalter) {
            startingScore = startingScore + 1;
        }
        if (isWiltChamberlain) {
            startingScore = startingScore + 1;
        }
        if (isCavaliersWarriors) {
            startingScore = startingScore + 1;
        }

        return score + startingScore;
    }

}
