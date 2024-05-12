package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText email, pass;
Button button;

public void mapping(){
    email=findViewById(R.id.email);
    pass=findViewById(R.id.pass);
    button=findViewById(R.id.button);
}

public void emptyCheck(){
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(email.getText().toString().isEmpty()){
                email.setError("Check lại email của bạn ");
            }
            else if (pass.getText().toString().isEmpty()){
                pass.setError("Check lại pass của bạn");
            }
        }
    });
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mapping();
        emptyCheck();

    }
}