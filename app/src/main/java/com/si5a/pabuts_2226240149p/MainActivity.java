package com.si5a.pabuts_2226240149p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNamaL, etNoPen;
    private Button btnRegis;
    private Spinner spJalurP;
    private CheckBox cbKonfirmasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNamaL = findViewById(R.id.et_nama);
        etNoPen = findViewById(R.id.et_nopendaftaran);
        btnRegis = findViewById(R.id.btn_regis);
        spJalurP = findViewById(R.id.sp_jalur_p);
        cbKonfirmasi = findViewById(R.id.cb_konfir);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaL, noPen, jalur, konfir;

                namaL = etNamaL.getText().toString();
                noPen = etNoPen.getText().toString();
                jalur = spJalurP.getSelectedItem().toString();

                if(namaL.trim().equals("")){
                    etNamaL.setError("Harap masukkan nama!");
                }

                else if(noPen.trim().equals("")){
                    etNoPen.setError("Harap masukkan nomor pendaftaran!");
                }

                else if(cbKonfirmasi.isChecked() == false){
                    Toast.makeText(MainActivity.this, "Harap centang!", Toast.LENGTH_SHORT).show();
                }

                else if(jalur.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih jalur terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent change = new Intent(MainActivity.this, SecondActivity.class);
                    change.putExtra("varNama", namaL);
                    change.putExtra("varNomor", noPen);
                    change.putExtra("varJalur", jalur);
                    startActivity(change);

                }
            }
        });
    }
}