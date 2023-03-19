package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Address extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);


        Button btncnt = findViewById(R.id.btncnt);
        btncnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myiny = new Intent(getApplicationContext(),Payment.class);
                startActivity(myiny);
            }
        });
    }
}