package com.example.shijo.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    LinearLayout l1;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     b1=(Button)findViewById(R.id.bt1);
     l1=(LinearLayout)findViewById(R.id.linearlayout);

     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             int color = rnd.nextInt();
             l1.setBackgroundColor(color);

            // l1.setBackgroundColor(Color.BLUE);
         }
     });


    }



}

