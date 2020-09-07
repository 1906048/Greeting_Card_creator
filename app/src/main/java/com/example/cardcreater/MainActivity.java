package com.example.cardcreater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2,edt3,edt4;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        edt4=findViewById(R.id.edt4);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().toString().trim().isEmpty()||
                        edt2.getText().toString().trim().isEmpty()||
                        edt3.getText().toString().trim().isEmpty()||edt4.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please fill all fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(MainActivity.this,Activity2.class);
                    String str1=edt1.getText().toString().trim();
                    String str2=edt2.getText().toString().trim();
                    String str3=edt3.getText().toString().trim();
                    String str4=edt4.getText().toString().trim();
                    intent.putExtra("from",str1);
                    intent.putExtra("to",str2);
                    intent.putExtra("heading",str3);
                    intent.putExtra("message",str4);
                    startActivity(intent);
                }
            }
        });
    }
}
