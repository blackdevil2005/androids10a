package com.example.p7;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button btnSubmit;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnSubmit = findViewById(R.id.btnSubmit);
        resultText = findViewById(R.id.resultText);

        btnSubmit.setOnClickListener(v -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                resultText.setText("Please select an option");
                return;
            }

            RadioButton selectedRadio = findViewById(selectedId);
            String value = selectedRadio.getText().toString();

            resultText.setText("Selected: " + value);
        });
    }
}