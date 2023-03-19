package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.btn);
        Button bt2 = findViewById(R.id.btn2);
        Button bt3 = findViewById(R.id.btn3);

        Button  crt1 = findViewById(R.id.cart);
        Button crt2 = findViewById(R.id.cart2);
        Button crt3 = findViewById(R.id.cart3);
     bt1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
              Intent myintent = new Intent(getApplicationContext(),cart.class);
              startActivity(myintent);
         }
     });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),cart.class);
                startActivity(myintent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),cart.class);
                startActivity(myintent);
            }
        });
        crt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),cart.class);
                startActivity(myintent);
            }
        });
        crt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),cart.class);
                startActivity(myintent);
            }
        });
        crt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),cart.class);
                startActivity(myintent);
            }
        });




    }
}