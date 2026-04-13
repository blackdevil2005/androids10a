package com.example.p11;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btnSize, btnColor, btnFont;

    float currentSize = 20;
    int colorIndex = 0;
    int fontIndex = 0;

    int[] colors = {Color.RED, Color.BLUE, Color.GREEN};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btnSize = findViewById(R.id.btnSize);
        btnColor = findViewById(R.id.btnColor);
        btnFont = findViewById(R.id.btnFont);

        // Change Font Size
        btnSize.setOnClickListener(v -> {
            currentSize += 5;
            textView.setTextSize(currentSize);
        });

        // Change Color
        btnColor.setOnClickListener(v -> {
            textView.setTextColor(colors[colorIndex]);
            colorIndex = (colorIndex + 1) % colors.length;
        });

        // Change Font Family
        btnFont.setOnClickListener(v -> {
            switch (fontIndex) {
                case 0:
                    textView.setTypeface(Typeface.SERIF);
                    break;
                case 1:
                    textView.setTypeface(Typeface.SANS_SERIF);
                    break;
                case 2:
                    textView.setTypeface(Typeface.MONOSPACE);
                    break;
            }
            fontIndex = (fontIndex + 1) % 3;
        });
    }
}