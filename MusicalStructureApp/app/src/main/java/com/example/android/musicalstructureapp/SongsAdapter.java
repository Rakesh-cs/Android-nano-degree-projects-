package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<SongsList>
{
    public SongsAdapter (Context context, ArrayList<SongsList> object)
    {
        super(context  , 0 , object);

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)

     */
    @Nullable
    @Override
    @NonNull
    public View getView(int position,  View convertView,  ViewGroup parent)
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View listitemview = convertView;
        if(listitemview == null)
        {
            listitemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        SongsList currentWord = (SongsList)  getItem(position);

        TextView songtextview = (TextView) listitemview.findViewById(R.id.Songname_text_view);

        songtextview.setText(currentWord.getSong());

        TextView composertextview = (TextView) listitemview.findViewById(R.id.composer_text_view);

        composertextview.setText(currentWord.getNameOfComposer());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listitemview;
    }
}


