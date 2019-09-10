package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {

    public  WordAdapter(Activity Context , ArrayList<word> word){
        super(Context   , 0 , word);
    }

        @Override
        public View getView(int position , View convertView , ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@link AndroidFlavor} object located at this position in the list
            word currentword = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView mivokTextView = (TextView) listItemView.findViewById(R.id.mivok_text_view);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            mivokTextView.setText(currentword.getMiwokTranslation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            numberTextView.setText(currentword.getDefaultTranslation());

            return listItemView;
        }

        }
    

