package com.example.p2;

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

        int number = getIntent().getIntExtra("number", 0);

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        resultText.setText("Factorial of " + number + " is: " + factorial);
    }
}