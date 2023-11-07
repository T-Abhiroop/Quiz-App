package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hooks
        //variables
        AppCompatButton topics = findViewById(R.id.topics);
        AppCompatButton howtoplay = findViewById(R.id.howtoplay);

        // Set click listener for the topics button
        topics.setOnClickListener(v -> {
            // Create an intent to navigate to the QuizTopics activity
            Intent intent = new Intent(MainActivity.this,QuizTopics.class);
            startActivity(intent);
            finish();

        });

        // Set click listener for the how to play button
        howtoplay.setOnClickListener(v -> {
            // Create an intent to navigate to the HowToPlay activity
            Intent intent = new Intent(MainActivity.this,HowToPlay.class);
            startActivity(intent);
            finish();

        });
    }
}