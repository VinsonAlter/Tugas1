package com.example.latihan101;
import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	Button bquiz1;
	Button bquiz2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		bquiz1 = (Button)findViewById(R.id.btnquiz1);
        bquiz1.setOnClickListener(new View.OnClickListener(){
        	
        @Override
        public void onClick(View arg0){
    		Intent intent = new Intent(MainActivity.this,Quiz1.class);
    		startActivity(intent);
    	}});
        
        bquiz2 = (Button)findViewById(R.id.btnquiz2);
        bquiz2.setOnClickListener(new View.OnClickListener(){
        	
        @Override
        public void onClick(View arg0){
    		Intent intent = new Intent(MainActivity.this,Quiz2.class);
    		startActivity(intent);
    	}});
	}
	
        	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}