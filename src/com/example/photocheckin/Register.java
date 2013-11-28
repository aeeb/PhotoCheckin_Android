package com.example.photocheckin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity{
	
	EditText editTextEmail;
	String strEmailAddress;

	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);     
	        setContentView(R.layout.index_register);
	        
	        editTextEmail = (EditText) findViewById(R.id.editText2);
	  }
	  
	    String regEx =
	        	"[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

	        public void btnValidateEmailAddress(View v)
	        {
	        	strEmailAddress = editTextEmail.getText().toString().trim();

	            Matcher matcherObj = Pattern.compile(regEx).matcher(strEmailAddress);
	            System.out.println("matcherObj "+matcherObj);
	            System.out.println("matcherObj "+matcherObj.matches());
	            if (matcherObj.matches())
	            {
	            	Toast.makeText(v.getContext(), strEmailAddress+" is valid", Toast.LENGTH_SHORT).show();
	            }
	            else
	            {
	            	Toast.makeText(v.getContext(), strEmailAddress+" is InValid", Toast.LENGTH_SHORT).show();
	            }
	        }
	  
 
}
