package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DKIJakarta extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dkijakarta);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin adat Betawi mencerminkan kekayaan budaya tradisional Jakarta dan sekitarnya. Bagi pengantin pria, busana terdiri dari baju jarit atau jarik yang merupakan pakaian tradisional Betawi berupa kain panjang yang dililitkan di tubuh, sering kali dengan motif batik atau songket. Atasan biasanya berupa kemeja dengan hiasan kain songket atau batik. Sementara itu, pengantin perempuan mengenakan kebaya dengan rok panjang yang disebut kutubaru, yang biasanya dihiasi dengan bordir atau sulaman yang indah. Kain sarung dengan motif tradisional Betawi juga sering dipakai sebagai pelengkap. Aksesoris seperti kalung, gelang, anting-anting, serta hiasan rambut tradisional Betawi seperti sanggul atau gandik juga turut melengkapi penampilan.");
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