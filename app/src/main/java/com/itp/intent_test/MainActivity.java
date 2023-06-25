package com.itp.intent_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    Button btn_welcome,btn_dial,btn_WhatApp,btn_Instagram,btn_Youtube;
    EditText et_name,et_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_welcome=findViewById(R.id.btn_welcome);
        btn_dial=findViewById(R.id.btn_dial);
        et_name=findViewById(R.id.et_name);
        et_number=findViewById(R.id.et_number);
        btn_WhatApp=findViewById(R.id.btn_WhatApp);
        btn_Instagram=findViewById(R.id.btn_Instagram);
        btn_Youtube=findViewById(R.id.btn_Youtube);

        btn_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Welcome.class);  //object creation
                intent.putExtra("name",et_name.getText().toString());
                startActivity(intent);
//            startActivity(new Intent(MainActivity.this,Welcome.class));
            }
        });

        btn_dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();   //object creation
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+et_number.getText().toString()));
                startActivity(intent);
            }
        });

        btn_WhatApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent =getPackageManager().getLaunchIntentForPackage("https://web.whatsapp.com/");
                if(intent!=null) {
                    startActivity(intent);
                }
                else {
                    Intent intent1=new Intent();
                    intent1.setAction(intent.ACTION_VIEW);
                    intent1.setData(Uri.parse("https://web.whatsapp.com/"));
                    startActivity(intent1);
                }
            }
        });

        btn_Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getPackageManager().getLaunchIntentForPackage("https://www.instagram.com/");
                if(intent!=null) {
                    startActivity(intent);
                }
                else {
                    Intent intent1=new Intent();
                    intent1.setAction(Intent.ACTION_VIEW);
                    intent1.setData(Uri.parse("https://www.instagram.com/"));
                    startActivity(intent1);
                }
            }
        });

        btn_Youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getPackageManager().getLaunchIntentForPackage("https://www.youtube.com/");
                if(intent!=null) {
                    startActivity(intent);
                }
                else {
                    Intent intent1=new Intent();
                    intent1.setAction(Intent.ACTION_VIEW);
                    intent1.setData(Uri.parse("https://www.youtube.com/"));
                    startActivity(intent1);
                }
            }
        });

    }
}