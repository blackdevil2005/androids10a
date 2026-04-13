package com.example.p20;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnChange;
    boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        btnChange = findViewById(R.id.btnChange);

        btnChange.setOnClickListener(v -> {

            if (isFirst) {
                imageView.setImageResource(R.drawable.image2);
            } else {
                imageView.setImageResource(R.drawable.image1);
            }

            isFirst = !isFirst; // toggle
        });
    }
}