 package com.example.listview;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 public class MainActivity extends AppCompatActivity {
     ListView LvMonhoc;
     ArrayAdapter adapter;
     List<String> list;
     TextView Tieude;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         mapping();
         initListView();
         doiMau();
     }

     private void doiMau() {
         Tieude.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 List<Integer> Dmau = new ArrayList<>();
                 Dmau.add(Color.BLUE);
                 Dmau.add(Color.RED);
                 Dmau.add(Color.GRAY);
                 Random rd = new Random();
                 int r = rd.nextInt(Dmau.size());
                 Tieude.setTextColor(Dmau.get(r));
             }
         });
     }

     private void mapping() {
         LvMonhoc = findViewById(R.id.list);
         Tieude = findViewById(R.id.Tieude);
     }

     private void initListView() {
         list = new ArrayList<>();
         list.add("C#");
         list.add("C");
         list.add("C++");
         list.add("JAVA");
         list.add("PHP");
         adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
         LvMonhoc.setAdapter(adapter);
     }
 }