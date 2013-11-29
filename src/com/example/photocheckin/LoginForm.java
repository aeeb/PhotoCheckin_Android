package com.example.photocheckin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginForm extends Activity implements View.OnClickListener {
	String strUsername = "";
	String strPassword = "";
	EditText input_username;
	EditText input_password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.index_loginform);

		// call btn login
		Button call_login = (Button) findViewById(R.id.login_btn);
		call_login.setOnClickListener(this);

		// input value form textflid
		input_username = (EditText) findViewById(R.id.UserName_btn);
		input_password = (EditText) findViewById(R.id.Password_btn);

		// go to register
		ImageButton goto_register = (ImageButton) findViewById(R.id.imgbtn_register);
		goto_register.setOnClickListener(this);
	}

	
	// check login
		public void checkvalue(View v){
			btnValidateUsername(v);
		}

		public void btnValidateUsername(View v){
			try{
			//รับค่ามาแปลงให้เป็น String
			strUsername = input_username.getText().toString().trim();
		        if(strUsername.isEmpty()){
		        	Toast.makeText(v.getContext(),"Your Username must not empty", Toast.LENGTH_SHORT).show();
		        }
	        }
		
	     	catch (NullPointerException ex) {
	     		ex.printStackTrace();	
	        }
		
		}
	
	
	
	
	// check link to page
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
