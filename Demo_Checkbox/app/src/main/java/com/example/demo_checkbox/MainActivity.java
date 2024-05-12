package com.example.demo_checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox nam,nu,khac;
    Button kiemTra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nam = findViewById(R.id.nam);
        nu = findViewById(R.id.nu);
        khac = findViewById(R.id.khac);
        kiemTra = findViewById(R.id.kiemTra);
        kiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nam.isChecked() && nu.isChecked() && khac.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check all!", Toast.LENGTH_SHORT).show();
                }
                else if (nam.isChecked() && nu.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check Nam và Nữ!", Toast.LENGTH_SHORT).show();
                }
                else if (nam.isChecked() && khac.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check Nam và Khác!", Toast.LENGTH_SHORT).show();
                }
                else if (nu.isChecked() && khac.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check Nữ và Khác!", Toast.LENGTH_SHORT).show();
                }
                else if (nam.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check Nam!", Toast.LENGTH_SHORT).show();
                }
                else if (nu.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check Nữ!", Toast.LENGTH_SHORT).show();
                }
                else if (khac.isChecked()) {
                    Toast.makeText(MainActivity.this, "Đã check Khác!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Không check gì cả", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}