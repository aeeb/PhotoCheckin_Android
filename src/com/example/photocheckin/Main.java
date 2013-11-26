package com.example.photocheckin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); //strat page
        
        //call btn register
        Button register_btn = (Button) findViewById(R.id.register_btn);
        register_btn.setOnClickListener(this);
        
      //call btn login
        Button login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.register_btn:
			Intent call_register= new Intent(this, Register.class);
			startActivity(call_register);			
			break;
		case R.id.login_btn:
			Intent call_login = new Intent(this, LoginForm.class);
			startActivity(call_login);			
			break;	
			
		}
		
	}
    
}
