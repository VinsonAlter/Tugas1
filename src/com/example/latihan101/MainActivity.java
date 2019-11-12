package com.example.latihan101;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView lprofil;
	String[] menu = {"Profil", "Quiz", "Keluar"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	lprofil = (ListView)findViewById(R.id.listview);
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,menu);
    lprofil.setAdapter(adapter);
    lprofil.setOnItemClickListener(Profil);
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	



private AdapterView.OnItemClickListener Profil = new AdapterView.OnItemClickListener(){

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
	 		if(arg2 == 0){
	 			Intent intent = new Intent(MainActivity.this,Profil.class);
		 		startActivity(intent);
	 		}else if(arg2 == 1){
	 			Intent intent = new Intent(MainActivity.this,Quiz.class);
		 		startActivity(intent);
	 		}else{
	 			finish();
	 		}

	}
	};
}