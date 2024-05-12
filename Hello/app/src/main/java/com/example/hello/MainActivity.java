package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button thoat;
    Button xinChao;

    EditText nhapTen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        thoat= findViewById(R.id.thoat);
        xinChao=findViewById(R.id.xinChao);
        nhapTen=findViewById(R.id.nhapTen);

        xinChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten= nhapTen.getText().toString();
                Toast.makeText(MainActivity.this, "Xin chào "+ten, Toast.LENGTH_SHORT).show();
            }
        });

        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}