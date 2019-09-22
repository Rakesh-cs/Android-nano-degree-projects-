package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class POP extends AppCompatActivity {
    private MediaPlayer mmediaplayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);


         final ArrayList<SongsList> Songs = new ArrayList<SongsList>();


        Songs.add(new SongsList("XXXTENTACION", "SAD!", R.raw.sad));
        Songs.add(new SongsList("Backstreet Boys", "EveryBody", R.raw.everybody));
        Songs.add(new SongsList("Dua Lipa", "New Rules", R.raw.new_rules));
        Songs.add(new SongsList("Lil Uzi Vert ", "XO Tour Llif3 ", R.raw.xo_tour_life_lil_uzi_vert));
        Songs.add(new SongsList("Travis Scott  ", "Stop Trying TO Be God", R.raw.travis));
        Songs.add(new SongsList("Kendrick Lamar   ", "HUMBLE", R.raw.be_humble));


        SongsAdapter adapter1 = new SongsAdapter(this, Songs);

        ListView listview = (ListView) findViewById(R.id.popsongslist);

        listview.setAdapter(adapter1);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int postion, long id) {
                SongsList song = Songs.get(postion);
                mmediaplayer = MediaPlayer.create(POP.this, song.getmaudioresourceid());
                mmediaplayer.start();


            }


        });


    }


    }



