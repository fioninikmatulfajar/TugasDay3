package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KalimantanTengah extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan_tengah);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin Kalimantan Tengah suku Dayak Kenyah memancarkan keanggunan dan kekayaan warisan budaya suku Dayak Kenyah. Untuk pengantin pria, busana terdiri dari baju setawang, yang merupakan pakaian tradisional terbuat dari kain tenun dengan motif khas suku Dayak Kenyah. Atasan busana ini sering dihiasi dengan sulaman atau hiasan dari bulu burung dan motif-motif alam atau binatang yang melambangkan keberanian atau kekuatan. Sementara itu, busana pengantin perempuan terdiri dari baju kurung dengan kain sarung atau kain tenun yang serasi. Baju kurung ini juga dihiasi dengan sulaman atau hiasan dari bulu burung dan motif-motif tradisional suku Dayak Kenyah.");
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