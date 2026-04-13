package com.example.p3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView collegeName;
    Button btnChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collegeName = findViewById(R.id.collegeName);
        btnChangeColor = findViewById(R.id.btnChangeColor);

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Change text color
                collegeName.setTextColor(Color.RED);

                // You can try different colors:
                // Color.BLUE, Color.GREEN, etc.
            }
        });
    }
}