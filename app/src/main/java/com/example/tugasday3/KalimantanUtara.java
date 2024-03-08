package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KalimantanUtara extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan_utara);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin adat Tidung Antakusuma, yang merupakan bagian dari budaya Kalimantan Utara, mencerminkan keindahan dan kekayaan tradisional suku Tidung. Untuk pengantin pria, busana terdiri dari pakaian tradisional yang disebut adat beras, terbuat dari kain tenun atau songket dengan motif-motif khas Tidung. Atasan biasanya disertai dengan blangkon atau peci yang terbuat dari bahan yang sama dengan pakaian. Sementara itu, busana pengantin perempuan terdiri dari tangguh, sebuah baju panjang yang dihiasi dengan hiasan sulaman, manik-manik, atau payet yang indah. Tangguh ini dipadukan dengan kain sarung atau kain songket yang melambangkan keanggunan dan keindahan tradisional.");
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

                if (intentShare.resolveActivity(getPackageManager()) != null);
                startActivity(intentShare);
            }
        });
    }
}