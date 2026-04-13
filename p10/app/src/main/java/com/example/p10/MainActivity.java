package com.example.p10;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Switch mySwitch;
    ToggleButton myToggle;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySwitch = findViewById(R.id.mySwitch);
        myToggle = findViewById(R.id.myToggle);
        resultText = findViewById(R.id.resultText);

        // Switch Listener
        mySwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                resultText.setText("Switch is ON");
            } else {
                resultText.setText("Switch is OFF");
            }
        });

        // Toggle Button Listener
        myToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                resultText.setText("Toggle Button is ON");
            } else {
                resultText.setText("Toggle Button is OFF");
            }
        });
    }
}