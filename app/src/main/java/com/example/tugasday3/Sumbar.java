package com.example.tugasday3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sumbar extends AppCompatActivity {
    Button btn1;
    TextView textpembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumbar);
        btn1 = findViewById(R.id.btn1);
        textpembahasan = findViewById(R.id.textpembahasan);

        textpembahasan.setText("Suntiang berasal dari daerah Padang dan Pariaman. Pakaian ini biasanya berwarna merah menyala baik untuk mempelai pria atau perempuan wanita. Pakaian ini dilengkapi dengan hiasan serta penutup kepala agar pengantin memiliki aura yang megah, elegan, dan mewah. Tak heran, pakaian ini terinspirasi dari pakaian-pakaian Eropa dan Tiongkok di jamannya. Hiasan yang diletakkan di atas kepala pengantin wanita ini memiliki tingkatan lebih dari satu dan jumlahnya harus ganjil. Rata-rata masyarakat Minangkabau menggunakan suntiang 7 tingkat untuk hiasan kepala pengantin wanita, tapi ada pula yang lebih.");
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