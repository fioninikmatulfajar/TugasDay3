package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KalimantanBarat extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan_barat);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin Kalimantan Barat King Baba adalah busana tradisional yang khas dan elegan, mewakili keberagaman budaya Kalimantan Barat, terutama suku Dayak. Bagi pengantin pria, busana terdiri dari baju setawang yang terbuat dari kain tenun dengan motif khas suku Dayak, sering kali dihiasi dengan hiasan perak atau emas. Atasan busana sering dilengkapi dengan motif binatang atau tumbuhan yang melambangkan kekuatan atau keberuntungan. Sementara itu, busana pengantin perempuan terdiri dari baju kurung dengan kain sarung atau kain tenun yang serasi. Baju kurung sering dihiasi dengan bordir atau sulaman yang indah, sementara kain sarung atau kain tenun dapat memiliki motif yang khas suku Dayak.");
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