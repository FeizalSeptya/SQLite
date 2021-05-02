package com.example.kelasasqlite;

import android.os.Bundle;

import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class LihatData extends AppCompatActivity {
    static TextView nama,telp;
    String nm;
    String id;
    String tlp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        nama = findViewById(R.id.tvNamaKontak);
        telp = findViewById(R.id.tvNomorTelepon);

        id = getIntent().getStringExtra("id");
        nm = getIntent().getStringExtra("nama");
        tlp = getIntent().getStringExtra("telp");

        setTitle("LihatData");
        nama.setText(nm);
        telp.setText(tlp);
    }
}

