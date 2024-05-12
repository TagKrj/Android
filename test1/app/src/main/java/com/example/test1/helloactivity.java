package com.example.test1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class helloactivity extends AppCompatActivity {
    Button btnThoat;
    Button btnXinChao;
    EditText edtHoten;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noactivity);
        btnThoat= findViewById(R.id.btnThoat);
        btnXinChao= findViewById(R.id.btnXinChao);
        edtHoten= findViewById(R.id.editHoten);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnXinChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtHoten.getText().toString();
                Toast.makeText(helloactivity.this, "Xin Chao" + edtHoten, Toast.LENGTH_SHORT);;
            }
        });
    }
}
