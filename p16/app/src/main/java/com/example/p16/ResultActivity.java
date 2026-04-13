package com.example.p16;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ((TextView)findViewById(R.id.rName))
                .setText(getIntent().getStringExtra("name"));

        ((TextView)findViewById(R.id.rSurname))
                .setText(getIntent().getStringExtra("surname"));

        ((TextView)findViewById(R.id.rClass))
                .setText(getIntent().getStringExtra("class"));

        ((TextView)findViewById(R.id.rGender))
                .setText(getIntent().getStringExtra("gender"));

        ((TextView)findViewById(R.id.rHobbies))
                .setText(getIntent().getStringExtra("hobbies"));

        ((TextView)findViewById(R.id.rMarks))
                .setText(getIntent().getStringExtra("marks"));
    }
}