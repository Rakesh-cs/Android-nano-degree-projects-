package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button numbers = (Button) findViewById(R.id.button1);





    numbers.setOnClickListener(new View.OnClickListener()
    {

        @Override
        public void onClick(View view)
        {

            Intent numbersIntent = new Intent(MainActivity.this, MainActivity2.class);

            startActivity(numbersIntent);
        }
    });

}
}
