package com.example.p9;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnSubmit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnSubmit = findViewById(R.id.btnSubmit);
        result = findViewById(R.id.result);

        btnSubmit.setOnClickListener(v -> {

            String s1 = num1.getText().toString();
            String s2 = num2.getText().toString();

            // Check empty input
            if (s1.isEmpty() || s2.isEmpty()) {
                result.setText("Please enter both numbers");
                return;
            }

            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);


            if (n1 > 10 && n2 > 10) {
                result.setText("Both numbers are greater than 10. Enter new numbers!");

                // Clear input
                num1.setText("");
                num2.setText("");
            } else {
                result.setText("Accepted Numbers:\nNumber 1: " + n1 + "\nNumber 2: " + n2);
            }
        });
    }
}