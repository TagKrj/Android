package com.example.ptb2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ptb2 extends AppCompatActivity {
    EditText a,b,c;
    Button Tinh, Xoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        Tinh=findViewById(R.id.Tinh);
        Xoa=findViewById(R.id.Xoa);

        Tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A=Integer.parseInt(a.getText().toString());
                int B=Integer.parseInt(b.getText().toString());
                int C=Integer.parseInt(c.getText().toString());

                float dt=B*B-4*A*C;

                if( dt<0){
                    Toast.makeText(ptb2.this, "Phương trình vô nghiệm", Toast.LENGTH_SHORT).show();
                } else if (dt>0) {
                    float x1=(-B+(float)Math.sqrt(dt)/(2*A));
                    float x2=(-B - (float)Math.sqrt(dt)/(2*A));
                    Toast.makeText(ptb2.this, "Nghiệm x2= "+x1+"Nghiệm x2= "+x2, Toast.LENGTH_SHORT).show();
                }
                else {
                    float x = - B/(2*A);
                    Toast.makeText(ptb2.this, "Phương trình có nghiệm kép x1=x2= "+x , Toast.LENGTH_SHORT).show();
                }

            }
        });

        Xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
                b.setText("");
                c.setText("");
            }
        });
    }
}
