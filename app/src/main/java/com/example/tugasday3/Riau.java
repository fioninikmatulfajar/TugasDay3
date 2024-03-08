package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Riau extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riau);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Pada umumnya, busana pengantin pria terdiri dari baju melayu dengan kain sarung yang disebut sampin, sering kali berwarna cerah dan dihiasi dengan sulaman atau songket yang indah. Selain itu, pengantin pria juga biasanya mengenakan songkok sebagai penutup kepala. Sedangkan bagi pengantin perempuan, busana terdiri dari baju kurung atau baju kebaya yang dihiasi dengan sulaman, manik-manik, atau songket. Selendang dari kain songket sering kali juga digunakan untuk melengkapi penampilan pengantin perempuan. Aksesoris seperti kalung, gelang, anting-anting, dan mahkota tradisional juga sering dipakai untuk menambah keanggunan penampilan.");
        klik();
    }
    void klik(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShare = new Intent();
                intentShare.setAction(Intent.ACTION_SEND);
                intentShare.putExtra(Intent.EXTRA_TEXT, "Coba Kirim Kesini");
                intentShare.setType("text/plain");

                if (intentShare.resolveActivity(getPackageManager()) !=null);
                startActivity(intentShare);
            }
        });
    }
}