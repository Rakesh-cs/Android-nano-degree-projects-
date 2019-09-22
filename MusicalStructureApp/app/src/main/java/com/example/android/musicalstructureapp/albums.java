package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView romance = (TextView) findViewById(R.id.romance);

        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(albums.this, Romantic.class);
                startActivity(intent1);
            }
        });

        TextView electric = (TextView) findViewById(R.id.edm);
        electric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(albums.this, Electronic.class);
                startActivity(intent2);
            }
        });

        TextView hippop = (TextView) findViewById(R.id.newpop);

        hippop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(albums.this, POP.class);
                startActivity(intent3);
            }
        });
    }


    }
