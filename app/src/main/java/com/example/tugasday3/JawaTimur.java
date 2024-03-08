package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JawaTimur extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_timur);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Model pakaian ini dulunya sering dipakai oleh para raja Jawa kuno. Baju Mantenan untuk pria terbuat dari kain beludru hitam dan berupa beskap (jas resmi dalam tradisi Jawa Mataraman) yang bagian depan dan belakangnya tidak sama panjangnya. Beskap tersebut didominasi oleh motif berwarna emas yang terbuat dari kawat. Pada wanita, kemben merupakan pakaian yang pertama kali digunakan. Kemben sendiri merupakan kain yang digunakan untuk melilit tubuh wanita bagian dada dan perut. Setelah kemben, baru pakaian manten dikenakan untuk menutupi bagian tubuh yang masih terbuka. Baju Manten berbahan sama dengan pakaian pria namun motif yang dipilih terkesan lebih feminim. Untuk bawahan Baju Manten, baik pria maupun wanita, menggunakan jarik bermotif batik.");
        klik();
    }
    void  klik(){
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