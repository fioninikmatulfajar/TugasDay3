package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sumut extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumut);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin adat Batak Toba adalah cerminan dari kekayaan budaya tradisional suku Batak Toba. Bagi pengantin pria, busana terdiri dari Ulos Batak Toba yang meliliti tubuh, disertai dengan sorban yang biasanya berwarna merah atau hitam. Sementara bagi pengantin perempuan, busana terdiri dari Ulos Ragidup yang dikenakan sebagai selendang atau selimut dengan warna dan motif khas. Wanita juga mengenakan baju kebaya atau pakaian tradisional Batak Toba yang disebut 'Sarung' yang dikenakan di bagian atas rok, serta kain ulos di pinggang yang disebut 'Sipatu' yang dililitkan ke tubuh.");
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