package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bengkulu extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengkulu);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana pengantin yang digunakan oleh pengantin laki-laki di Kabupaten Mukomuko terdiri dari baju betabur, kain songket dan celana. Busana pengantin yang digunakan oleh pengantin perempuan di Kabupaten Mukomuko terdiri dari baju betabur dan kain songket. Makna filosofi busana pengantin yang dipakai oleh pengantin laki-laki yaitu baju betabur melambangkan ketinggian peranan suami dalam rumah tangga, sedangkan celana melambangkan kegagahan dan keberanian suami dalam tanggung jawab. Songket benang emas melambangkan kesopanan dalam tingkah laku yang baik. Destar melambangkan batasan tingkah laku seorang bujang yang sudah beristri. Tusuk konde (bunga mata hari dan daun bambu) melambangkan untuk bersatu. Peding melambangkan kepandaian mengatur pengeluaran. Kilek-kilek burung melambangkan keselamatan.");
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