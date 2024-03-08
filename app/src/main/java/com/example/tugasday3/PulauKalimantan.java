package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PulauKalimantan extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulau_kalimantan);
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
                Intent intentKalimantanUtara = new Intent(PulauKalimantan.this, KalimantanUtara.class);
                startActivity(intentKalimantanUtara);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKalimantanTimur =new Intent(PulauKalimantan.this, KalimantanTimur.class);
                startActivity(intentKalimantanTimur);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKalimantanSelatan = new Intent(PulauKalimantan.this, KalimantanSelatan.class);
                startActivity(intentKalimantanSelatan);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKalimantanTengah = new Intent(PulauKalimantan.this, KalimantanTengah.class);
                startActivity(intentKalimantanTengah);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKalimantanBarat = new Intent(PulauKalimantan.this, KalimantanBarat.class);
                startActivity(intentKalimantanBarat);
            }
        });
    }
}