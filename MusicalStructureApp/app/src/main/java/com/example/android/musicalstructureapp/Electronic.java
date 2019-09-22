package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Electronic extends AppCompatActivity {
    private MediaPlayer mmediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);
        final ArrayList<SongsList> Songs = new ArrayList<SongsList>();


        Songs.add(new SongsList("Alan walker", "Faded", R.raw.faded));
        Songs.add(new SongsList("Alan walker", "Darkside", R.raw.darkside));
        Songs.add(new SongsList("verroa", "Run", R.raw.veorra_run));
        Songs.add(new SongsList("Nevoaii", "Shouldve'Started", R.raw.neovaii_should_ve_started));
        Songs.add(new SongsList("Unknown Brain", "Why do i", R.raw.why_do_i_unknown_brain));
        Songs.add(new SongsList("Post Malone   ", "Rockstar", R.raw.rockstar));

        SongsAdapter adapter = new SongsAdapter(this, Songs);

        ListView listview = (ListView) findViewById(R.id.edmsongslist);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int postion, long id) {
                SongsList song = Songs.get(postion);
                mmediaplayer = MediaPlayer.create(Electronic.this, song.getmaudioresourceid());
                mmediaplayer.start();


            }


        });
    }


}