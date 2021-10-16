package com.example.lab5_milestone1_huillet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        TextView welcomeText = findViewById(R.id.welcomeText);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        welcomeText.setText("Welcome " + str + "!");
    }
}