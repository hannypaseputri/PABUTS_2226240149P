package com.si5a.pabuts_2226240149p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvNama, tvNoPen, tvJalur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvNoPen = findViewById(R.id.tv_nopendaftaran_second);
        tvJalur = findViewById(R.id.tv_jalur);

        Intent gotcha = getIntent();
        tvNama.setText(gotcha.getStringExtra("varNama"));
        tvNoPen.setText(gotcha.getStringExtra("varNomor"));
        tvJalur.setText(gotcha.getStringExtra("varJalur"));
    }
}