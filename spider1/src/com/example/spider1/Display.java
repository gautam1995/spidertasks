package com.example.spider1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Display extends Activity {
	
	private TextView text11;
	

	
	protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        
        text11 = (TextView)findViewById(R.id.editText11);
       
        
        Bundle objbundle =  getIntent().getExtras();
        
        String tex = objbundle.getString("mov");
        text11.setText(tex);
       
};

}
