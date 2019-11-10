package com.example.latihan101;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Quiz2 extends Activity{
	

	TextView ehasilbanding2;
	EditText bangka3;
	EditText bangka4;
	EditText bangka5;
	Button ebanding2;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz2);
        
        bangka3  = (EditText)findViewById(R.id.angka3);
        bangka4  = (EditText)findViewById(R.id.angka4);
        bangka5  = (EditText)findViewById(R.id.angka5);
        ebanding2 = (Button)findViewById(R.id.btnbanding2);
        ehasilbanding2 = (TextView)findViewById(R.id.tvhasilbanding2);

        ebanding2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(bangka3.getText().toString());
				int b = Integer.parseInt(bangka4.getText().toString());
				int c = Integer.parseInt(bangka5.getText().toString());
			if ((a>b) && (a>c) && (b<c))
			{ehasilbanding2.setText("Angka " + a + " adalah nilai yang paling besar dan angka " + b + "adalah angka yang paling kecil" );}
			else 
			if ((a>b) && (a>c) && (c<b))
			{ehasilbanding2.setText("Angka " + a + " adalah nilai yang paling besar dan angka " + c + "adalah angka yang paling kecil" );}
			else
			if ((b>a) && (b>c) && (c<a))
			{ehasilbanding2.setText("Angka " + b + " adalah nilai yang paling besar dan angka " + c + "adalah angka yang paling kecil" );}
			else 
			if ((b>a) && (b>c) && (a<c))
			{ehasilbanding2.setText("Angka " + b + " adalah nilai yang paling besar dan angka " + a + "adalah angka yang paling kecil" );}
			if ((c>a) && (c>b) && (a<b))
			{ehasilbanding2.setText("Angka " + c + " adalah nilai yang paling besar dan angka " + a + "adalah angka yang paling kecil" );}
			else 
			if ((c>a) && (c>b) && (b<a))
			{ehasilbanding2.setText("Angka " + c + " adalah nilai yang paling besar dan angka " + b + "adalah angka yang paling kecil" );}
			else 
			{ehasilbanding2.setText("Angka " + a + b + c + " memiliki nilai yang sama");}	
			}
        	
        });
	}}
