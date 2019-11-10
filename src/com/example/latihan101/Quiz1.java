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

public class Quiz1 extends Activity{
	

	TextView ehasilbanding1;
	EditText bangka1;
	EditText bangka2;
	Button ebanding1;
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz1);
        
        bangka1  = (EditText)findViewById(R.id.angka1);
        bangka2  = (EditText)findViewById(R.id.angka2);
        ebanding1 = (Button)findViewById(R.id.btnbanding1);
        ehasilbanding1 = (TextView)findViewById(R.id.tvhasilbanding1);

        ebanding1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(bangka1.getText().toString());
				int b = Integer.parseInt(bangka2.getText().toString());
				
			if (a>b)
				{ehasilbanding1.setText("Angka " + a + " lebih besar dari angka " + b);}
			else if (a<b)
				{ehasilbanding1.setText("Angka " + b + " lebih besar dari angka " + a);}
			else
				{ehasilbanding1.setText("Angka " + a + " memiliki nilai yang sama dengan angka" + b);}
			
			}
        	
        });
	}}

        
