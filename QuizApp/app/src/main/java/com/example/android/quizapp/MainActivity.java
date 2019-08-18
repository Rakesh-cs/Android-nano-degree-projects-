package com.example.android.quizapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    int score = 0;

    /**
     * Question 1 answer
     * @param view check RadioButton when the team is selected
     */
    public void onRadioButtonClickedQuestion1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.miami_heat:
                if (checked)
                    getIntent().putExtra("score", 1);
                break;
            case R.id.new_york_knicks:
                if (checked)
                    break;
            case R.id.chicago_bulls:
                if (checked)
                    break;
        }
    }

}















