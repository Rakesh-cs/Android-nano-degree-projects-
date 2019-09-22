package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Romantic extends AppCompatActivity {
    private MediaPlayer mmediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic);
        final ArrayList<SongsList> Songs2 = new ArrayList<SongsList>();

        Songs2.add(new SongsList("Selena Gomez  ", "Same Old Love", R.raw.sad));
        Songs2.add(new SongsList("Blue", "OneLove", R.raw.one_love));
        Songs2.add(new SongsList("Taylor Swift ", "Love Story", R.raw.taylor_swift_love_story));
        Songs2.add(new SongsList("Marron 5  ", "Sugar", R.raw.sugar));
        Songs2.add(new SongsList("One Direction  ", "Perfect", R.raw.one_direction_perfect));
        Songs2.add(new SongsList("Bryan Adams ", "Heaven ", R.raw.heaven));

        SongsAdapter adapter1 = new SongsAdapter(this, Songs2);

        ListView listView = (ListView) findViewById(R.id.romanticsongs);

        listView.setAdapter(adapter1);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int postion, long id) {
                SongsList song = Songs2.get(postion);
                mmediaplayer = MediaPlayer.create(Romantic.this, song.getmaudioresourceid());
                mmediaplayer.start();


            }


        });

    }


    }

