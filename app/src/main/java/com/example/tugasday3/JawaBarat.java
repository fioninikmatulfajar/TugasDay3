package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JawaBarat extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_barat);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin kebaya Sunda adalah pakaian tradisional yang mempesona dan elegan, mewakili kebudayaan Sunda yang kaya. Untuk pengantin perempuan, busana terdiri dari kebaya yang sering dihiasi dengan hiasan sulaman atau payet yang indah, sering kali dengan warna-warna cerah seperti merah, kuning, atau hijau. Kebaya dipadukan dengan kain sarung atau kain batik sebagai bawahan, dan selendang dari kain songket atau tenun Sunda yang melengkapi penampilan. Pengantin perempuan juga biasanya mengenakan hiasan kepala seperti sanggul atau mahkota yang indah. Sementara itu, untuk pengantin pria, busana terdiri dari baju beskap atau kemeja dengan kain sarung yang dipadukan dengan blangkon atau peci sebagai penutup kepala");
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