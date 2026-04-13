package com.example.p5;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.resultText);

        double power = getIntent().getDoubleExtra("power", 0);
        double average = getIntent().getDoubleExtra("average", 0);

        resultText.setText(
                "Power: " + power + "\nAverage: " + average
        );
    }
}