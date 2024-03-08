package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DIYogyakarta extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyogyakarta);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Paes Ageng adalah gaya busana pengantin khas Jawa yang terdiri dari beberapa elemen penting. Untuk pengantin pria, busana Paes Ageng biasanya terdiri dari baju beskap, kain sarung, serta blangkon atau udeng sebagai penutup kepala. Baju beskap sering kali dihiasi dengan motif batik atau sulaman yang indah. Sedangkan untuk pengantin perempuan, busana Paes Ageng terdiri dari kebaya dengan kain sarung dan selendang. Kebaya ini sering dihiasi dengan hiasan bordir atau payet yang elegan. Kain sarung dan selendang juga sering mengikuti motif batik yang serasi dengan busana. Mempelai pria menggunakan kain dengan dada terbuka dan kepala yang dihiasi oleh Kuluk Kanigaran. Selain itu, wanita menggunakan kain seperti kemben dan kalung sungsun. ");
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