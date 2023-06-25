package com.itp.intent_test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Dial extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        textView2 =findViewById(R.id.textView2);

        String passedNumber=getIntent().getStringExtra("number");
        textView2.setText("Dial: "+passedNumber);




    }
}