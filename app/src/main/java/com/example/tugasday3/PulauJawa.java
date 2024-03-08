package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PulauJawa extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulau_jawa);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        klik();
    }
    void klik(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJawaBarat = new Intent(PulauJawa.this, JawaBarat.class);
                startActivity(intentJawaBarat);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJawaTimur = new Intent(PulauJawa.this, JawaTimur.class);
                startActivity(intentJawaTimur);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJawaTengah = new Intent(PulauJawa.this, JawaTengah.class);
                startActivity(intentJawaTengah);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDKIJakarta = new Intent(PulauJawa.this, DKIJakarta.class);
                startActivity(intentDKIJakarta);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDIYogyakarta = new Intent(PulauJawa.this, DIYogyakarta.class);
                startActivity(intentDIYogyakarta);
            }
        });
    }
}