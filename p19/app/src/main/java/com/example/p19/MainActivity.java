package com.example.p19;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView bulbImage;
    ToggleButton toggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bulbImage = findViewById(R.id.bulbImage);
        toggleBtn = findViewById(R.id.toggleBtn);

        toggleBtn.setOnCheckedChangeListener((buttonView, isChecked) -> {

            if (isChecked) {
                bulbImage.setImageResource(R.drawable.bulb_on);
            } else {
                bulbImage.setImageResource(R.drawable.bulb_off);
            }
        });
    }
}