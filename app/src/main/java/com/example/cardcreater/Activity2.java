package com.example.cardcreater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv1=findViewById(R.id.tv2);
        tv2=findViewById(R.id.tv3);
        tv3=findViewById(R.id.tv4);
        tv4=findViewById(R.id.tv5);
        String str1=getIntent().getStringExtra("heading");
        String str2=getIntent().getStringExtra("to");
        String str3=getIntent().getStringExtra("message");
        String str4=getIntent().getStringExtra("from");
        tv1.setText(str1);
        tv2.setText("To  "+str2);
        tv3.setText(str3);
        tv4.setText("from  "+str4);
    }
}
