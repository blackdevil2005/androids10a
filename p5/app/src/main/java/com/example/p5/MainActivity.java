package com.example.p5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(v -> {

            String s1 = num1.getText().toString();
            String s2 = num2.getText().toString();

            if (s1.isEmpty() || s2.isEmpty()) {
                Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show();
                return;
            }

            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);

            double power = Math.pow(a, b);
            double average = (a + b) / 2;

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("power", power);
            intent.putExtra("average", average);

            startActivity(intent);
        });
    }
}