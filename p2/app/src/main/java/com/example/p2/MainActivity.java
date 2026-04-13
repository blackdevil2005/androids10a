package com.example.p2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numberInput;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = numberInput.getText().toString();

                if (input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number = Integer.parseInt(input);

                if (number < 0) {
                    Toast.makeText(MainActivity.this, "Enter positive number", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Send data to second activity
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("number", number);
                startActivity(intent);
            }
        });
    }
}