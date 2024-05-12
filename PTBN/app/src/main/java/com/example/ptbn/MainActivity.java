package com.example.ptbn;

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
EditText nhapA, nhapB;
Button bT1, bT2;

    public void mapping(){
        nhapA=findViewById(R.id.nhapA);
        nhapB=findViewById(R.id.nhapB);
        bT1=findViewById(R.id.bT1);
        bT2=findViewById(R.id.bT2);
    }
    public void giaiBPTNN(){
        bT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(nhapA.getText().toString());
                int b = Integer.parseInt(nhapA.getText().toString());
                if (a == 0){
                    if(b==0){
                        Toast.makeText(MainActivity.this, "Phương trình có vô số nghiệm", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Phương trình vô nghiệm", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Phương trình có nghiệm là" + -b/a, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void xoaDuLieu() {
        bT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhapA.setText("");
                nhapB.setText("");
                Toast.makeText(MainActivity.this, "Đã xóa dữ liệu", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mapping();
        giaiBPTNN();
        xoaDuLieu();
    }


}