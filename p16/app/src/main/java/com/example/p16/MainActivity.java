package com.example.p16;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, surname, className, marks;
    RadioGroup genderGroup;
    CheckBox h1, h2, h3;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        className = findViewById(R.id.className);
        marks = findViewById(R.id.marks);

        genderGroup = findViewById(R.id.genderGroup);
        h1 = findViewById(R.id.hobby1);
        h2 = findViewById(R.id.hobby2);
        h3 = findViewById(R.id.hobby3);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            String n = name.getText().toString();
            String s = surname.getText().toString();
            String c = className.getText().toString();
            String m = marks.getText().toString();

            // Gender
            int selectedId = genderGroup.getCheckedRadioButtonId();
            RadioButton rb = findViewById(selectedId);
            String gender = rb.getText().toString();

            // Hobbies
            String hobbies = "";
            if (h1.isChecked()) hobbies += "Reading ";
            if (h2.isChecked()) hobbies += "Sports ";
            if (h3.isChecked()) hobbies += "Music ";

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);

            intent.putExtra("name", n);
            intent.putExtra("surname", s);
            intent.putExtra("class", c);
            intent.putExtra("gender", gender);
            intent.putExtra("hobbies", hobbies);
            intent.putExtra("marks", m);

            startActivity(intent);
        });
    }
}