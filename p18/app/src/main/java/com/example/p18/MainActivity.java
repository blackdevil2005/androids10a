package com.example.p18;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnDialog);

        btn.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Alert");
            builder.setMessage("Do you want to exit?");

            // YES button
            builder.setPositiveButton("Yes", (dialog, which) -> {
                Toast.makeText(this, "You clicked Yes", Toast.LENGTH_SHORT).show();
                finish(); // closes app
            });

            // NO button
            builder.setNegativeButton("No", (dialog, which) -> {
                Toast.makeText(this, "You clicked No", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            // Create and show dialog
            builder.create().show();
        });
    }
}