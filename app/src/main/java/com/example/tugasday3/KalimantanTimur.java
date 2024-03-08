package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KalimantanTimur extends AppCompatActivity {
    Button btn1;

    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan_timur);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin suku Dayak Kenyah dari Kalimantan Timur, khususnya dalam adat Takwo, merupakan pakaian tradisional yang kaya akan simbolisme dan keindahan budaya. Untuk pengantin pria, busana terdiri dari baju setawang yang terbuat dari kain tenun tradisional dengan motif khas suku Dayak Kenyah. Baju ini sering dihiasi dengan hiasan-hiasan seperti manik-manik, sulaman, atau bahkan hiasan dari bulu burung. Atasan ini juga biasanya disertai dengan blangkon atau peci sebagai penutup kepala. Sementara itu, busana pengantin perempuan terdiri dari baju kurung dengan kain sarung atau kain tenun yang disebut tikar Baju kurung ini sering kali dihiasi dengan hiasan sulaman yang indah dan motif-motif tradisional suku Dayak Kenyah.");
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