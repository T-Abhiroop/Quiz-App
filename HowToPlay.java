package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class HowToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        // Initialize the back button
        //variables
        AppCompatButton back = findViewById(R.id.back);

        // Set click listener for the back button
        back.setOnClickListener(v -> {
            // Create an intent to go back to the MainActivity
            Intent intent = new Intent(HowToPlay.this,MainActivity.class);
            startActivity(intent);

        });
    }
}