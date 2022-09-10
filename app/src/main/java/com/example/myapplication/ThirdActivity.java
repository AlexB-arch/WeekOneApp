package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Capture the layout's TextView and set the string as its text
        TextView about_Text = findViewById(R.id.textView_About);
        about_Text.setText(getResources().getString(R.string.about));

    }
}