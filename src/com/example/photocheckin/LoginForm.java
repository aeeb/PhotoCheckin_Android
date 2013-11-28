package com.example.photocheckin;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LoginForm extends Activity implements View.OnClickListener{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        setContentView(R.layout.index_loginform);
	       
	     // call btn login
			Button call_login = (Button) findViewById(R.id.login_btn);
			call_login.setOnClickListener(this);
			
		//  go to register
			ImageButton goto_register = (ImageButton) findViewById(R.id.imgbtn_register);
			goto_register.setOnClickListener(this);
		}
	  
	 
	  

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {

		case R.id.login_btn:
			Intent call_index_wallpage = new Intent(this, WallPage.class);
			startActivity(call_index_wallpage);
			break;
		case R.id.imgbtn_register:
			Intent call_registerbtn = new Intent(this, Register.class);
			startActivity(call_registerbtn);
			break;

		}
	}  
	  
	  
}
