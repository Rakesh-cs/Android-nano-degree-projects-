package com.example.android.miwok;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

public class    NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> words = new ArrayList<word>();


        words.add(new word("one","Lutti"));
        words.add(new word("Two","otiiko"));
        words.add(new word("Three","tolooskosu"));
        words.add(new word("Four","oyyisa"));
        words.add(new word("Five","massokka"));
        words.add(new word("six","temmokka"));
        words.add(new word("seven","Kenekaku"));
        words.add(new word("Eight","Kawinta"));
        words.add(new word("Nine","wo'e"));
        words.add(new word("Ten","na'accha"));




        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);



        }
    }



