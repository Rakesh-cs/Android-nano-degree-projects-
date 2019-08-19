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




    int Value = 0;


    public void firstQuestion(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.manutd:
                if (checked)
                    getIntent().putExtra("Value", 1);
                break;
            case R.id.chels:
                if (checked)
                    break;
            case R.id.gunners:
                if (checked)
                    break;
        }
    }


    public void secondQuestion(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.Juve:
                if (checked)
                    getIntent().putExtra("Value", 1);
                break;
            case R.id.Real:
                if (checked)
                    break;
            case R.id.Dutch:
                if (checked)
                    break;
        }
    }

    /**
     *correct answers
     * calculate score
     */
    public void Output (View view) {

        RadioButton Manutd = (RadioButton) findViewById(R.id.manutd);
        boolean Manchester = Manutd.isChecked();

        RadioButton RealRadioButton = (RadioButton) findViewById(R.id.Real);
        boolean Madrid = RealRadioButton.isChecked();

        RadioButton TheYellows = (RadioButton) findViewById(R.id.Ausies);
        boolean Australia = TheYellows.isChecked();

        CheckBox TheReds = (CheckBox) findViewById(R.id.BestPlayer);
        boolean barcelona = TheReds.isChecked();

        CheckBox Therunnersx = (CheckBox) findViewById(R.id.Speedster);
        boolean TheLeague = Therunnersx.isChecked();

        CheckBox Pacers = (CheckBox) findViewById(R.id.Skiller);
        boolean Laliga = Pacers.isChecked();

        CheckBox TheInvinsibles = (CheckBox) findViewById(R.id.Defender);
        boolean Ligue1 = TheInvinsibles.isChecked();

        RadioButton Ballondor = (RadioButton) findViewById(R.id.Luka);
        boolean Edernsive = Ballondor.isChecked();

        EditText answertoQuestion6 = (EditText) findViewById(R.id.answerto_6);
        boolean Tennis_6= answertoQuestion6.getText().toString().matches("Roger Federer");


        int Value = Outputintake(Manchester, Madrid, Australia, barcelona, TheLeague, Laliga, Ligue1, Edernsive,Tennis_6);

        Toast.makeText(this, getString(R.string.Enter_the_Score) + Value, Toast.LENGTH_LONG).show();

    }


    public void ThirdQuestion(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.Eng:
                if (checked)
                    break;
            case R.id.Ausies:
                if (checked)
                    getIntent().putExtra("Value", 1);
                break;
            case R.id.TheBlues:
                if (checked)
                {
                    checked = true;


                }
                else{
                    break;
                }


        }
    }
    
    public void fourthQuestion(View view)
    {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.ronaldo:
                if (checked)
                    break;
            case R.id.Luka:
                if (checked)
                    getIntent().putExtra("Value", 1);
                    break;
            case R.id.Messi:
                if (checked)
                    break;
        }
    }


    /**
     *
     * add points for correct answers
     * return real value of points
     */


    private int Outputintake(boolean Manchester, boolean Madrid, boolean Australia, boolean barcelona, boolean TheLeague, boolean Laliga, boolean Ligue1, boolean Edernsive, boolean Tennis_6) {
        int Points = 0;

        if (Manchester)
        {
            Points = Points + 1;
        }

        if (Madrid)
        {
            Points = Points + 1;
        }
        if (Australia)
        {
            Points = Points + 1;
        }
        if (barcelona && TheLeague &&! Laliga &&! Ligue1) {
            Points = Points + 1;
        }
        if (Edernsive)
        {
            Points = Points + 1;
        }


        if (Tennis_6)
        {
            Points = Points + 1;
        }

        return Value + Points;
    }

}
