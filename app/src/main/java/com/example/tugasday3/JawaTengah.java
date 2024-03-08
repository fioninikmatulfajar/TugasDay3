package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JawaTengah extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa_tengah);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Busana Basahan merupakan pakaian adat Jawa Tengah. Pakaian ini menjadi warisan budaya dari Kerajaan Mataram. Ciri khas busana Basahan adalah tidak adanya atasan yang menutup seluruh badan. Bagi mempelai pria, biasanya bertelanjang dada. Serta hanya mengenakan dodot yang menutupi pusar. Selain itu pengantin pria mengenakan kalung untuk menghiasi bagian dada. Tampilan mempelai pria akan dilengkapi dengan kuluk sebagai penutup kepala. Serta membawa keris sebagai lambang kekuatan. Mempelai wanita mengenakan kemben dengan bagian bahu dan dada atas terbuka. Sementara bagian bawahnya juga mengenakan dodot. Busana Basahan memiliki makna dan harapan. Yaitu agar mempelai dapat menjalani rumah tangga yang harmonis. Selain itu rumah tangga sejahtera, bahagia. Serta dapat berjalan selaras dengan alam");
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

                if (intentShare.resolveActivity(getPackageManager()) !=null);
                startActivity(intentShare);
            }
        });
    }
}