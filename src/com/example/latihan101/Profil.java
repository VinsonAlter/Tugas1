package com.example.latihan101;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Profil extends Activity{
	EditText lnama;
	EditText lnim;
	EditText lprodi;
	EditText lfakultas;
	Button jelas;
	TextView ketik;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_profil);
		
		lnama  = (EditText)findViewById(R.id.tvnamasiswa);
        lnim  = (EditText)findViewById(R.id.tvnomornim);
        lprodi = (EditText)findViewById(R.id.tvprodi);
        lfakultas = (EditText)findViewById(R.id.tvnamafakultas);
        jelas = (Button)findViewById(R.id.tvjelaskan);
        ketik = (TextView)findViewById(R.id.tvketik);
	
        jelas.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String nama = lnama.getText().toString();
				String nim = lnim.getText().toString();
				String prodi = lprodi.getText().toString();
				String fakultas = lfakultas.getText().toString();
				Toast.makeText(Profil.this, "Anda memasukkan : \n" + nama + "\n" + nim + "\n" + prodi + "\n" + fakultas,
						Toast.LENGTH_SHORT).show();
			}
        });
	}}
	