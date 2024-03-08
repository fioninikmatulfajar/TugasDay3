package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KalimantanSelatan extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan_selatan);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin Kalimantan Selatan adat Banjar mencerminkan kekayaan budaya tradisional suku Banjar yang khas dan elegan. Bagi pengantin pria, busana terdiri dari baju bodo atau baju coklat yang terbuat dari kain songket atau tenun tradisional, sering kali dihiasi dengan motif-motif khas Banjar. Baju ini dipadukan dengan celana panjang atau kain sarung serta sorban atau ikat kepala yang disebut tengkolok yang merupakan simbol kehormatan dan status. Sementara itu, busana pengantin perempuan terdiri dari kebaya dengan bawahan kain sarung atau kain songket yang disebut sasirangan. Kebaya biasanya dihiasi dengan bordir atau sulaman yang indah, dengan warna-warna cerah atau lembut yang serasi dengan motif sasirangan. Pengantin perempuan juga memakai hiasan kepala seperti sanggul atau mahkota yang indah.");
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