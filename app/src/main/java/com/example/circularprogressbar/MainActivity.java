package com.example.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btnStart);
        Button btnStop = findViewById(R.id.btnStop);
        ProgressBar progressBar = findViewById(R.id.progressBar);

        btnStart.setOnClickListener(view -> {
            progressBar.setVisibility(View.VISIBLE);
        });

        btnStop.setOnClickListener(view -> {
            progressBar.setVisibility(View.INVISIBLE);
        });

    }
}