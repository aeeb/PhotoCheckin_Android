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
        Button call_register = (Button) findViewById(R.id.register_btn);
        call_register.setOnClickListener(this);
        
      //call btn login
        Button call_login = (Button) findViewById(R.id.login_btn);
        call_login.setOnClickListener(this);
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
			Intent call_registerbtn= new Intent(this, Register.class);
			startActivity(call_registerbtn);			
			break;
		case R.id.login_btn:
			Intent call_loginbtn = new Intent(this, LoginForm.class);
			startActivity(call_loginbtn);			
			break;	
			
		}
		
	}
    
}
