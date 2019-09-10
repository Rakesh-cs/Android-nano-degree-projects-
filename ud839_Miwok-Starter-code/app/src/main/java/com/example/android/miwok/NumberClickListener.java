package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public  class NumberClickListener  implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "open the list of number ", Toast.LENGTH_SHORT).show();
    }



}



