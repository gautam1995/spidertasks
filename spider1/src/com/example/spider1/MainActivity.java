package com.example.spider1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText text12;
	private Button b1;


	@Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b1 = (Button)findViewById(R.id.but);
       text12 = (EditText)findViewById(R.id.edit);
      
     
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent move = new Intent(MainActivity.this,Display.class);
				
				move.putExtra("mov",text12.getText().toString().trim());
				
				startActivity(move);
				
			}
		});
       
        
	}
	


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
