package com.example.photocheckin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Register extends Activity{
	
	EditText editTextName;
	RadioGroup gender;
	EditText editTextEmail;	
	EditText editTextUsername;
	EditText editTextPass;
	EditText editTextConfirmPass;
	String strName;
	String strGender;
	String strEmailAddress;
	String strUsername;
	String strPass;
	String strConfirmPass;

	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);     
	        setContentView(R.layout.index_register);
	        
	        //รับค่าที่ User กรอกไว้ในแต่ละช่องมาเก็บไว้ในตัวแปร
	        editTextName = (EditText) findViewById(R.id.editTextName);
	        gender = (RadioGroup) findViewById(R.id.radiosex);
	        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
	        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
	        editTextPass = (EditText) findViewById(R.id.editTextPass);
	        editTextConfirmPass = (EditText) findViewById(R.id.editTextConfirmPass);
	  }
	  	//Set syntax ของ E-mail 
	    String regEx =
	        	"[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
	    
		public void btnregis(View v){
			btnValidateName(v);
//			btnValidateGender(v);
			btnValidateEmailAddress(v);
			btnValidateUsername(v);
			btnValidatePassword(v);

		}
		
		//เช็ค Validate ของ Name
	    public void btnValidateName(View v){
	    	//รับค่ามาแปลงให้เป็น String
	    	strName = editTextName.getText().toString().trim();
	        
	        //เช็คว่าเป็นค่าว่างหรือเปล่า?
	        if(strName.isEmpty()){
	        	Toast.makeText(v.getContext(), "Your name must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{

	        }
	    }
	    
	
		//เช็ค Validate ของ E-mail
	    public void btnValidateEmailAddress(View v){
	    	//รับค่ามาแปลงให้เป็น String
	    	strEmailAddress = editTextEmail.getText().toString().trim();
	
	    	//เช็คว่า syntax ของ E-mail กับ  E-mail ที่ User กรอกมา นั้นตรงกันหรือไม่ เก็บค่าไว้ใน matcherObj>>>True or False
	        Matcher matcherObj = Pattern.compile(regEx).matcher(strEmailAddress);
	        
	        //เช็คว่าเป็นค่าว่างหรือเปล่า?
	        if(strEmailAddress.isEmpty()){
	        	Toast.makeText(v.getContext(), "Email must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{
	        	 if (matcherObj.matches())
	 	        {
	 	        	
	 	        }
	 	        else
	 	        {
	 	        	Toast.makeText(v.getContext(), "E-mail "+strEmailAddress+" is InValid", Toast.LENGTH_SHORT).show();
	 	        }
	        }
	    }
	  
		//เช็ค Validate ของ UserName
	    public void btnValidateUsername(View v){
	    	//รับค่ามาแปลงให้เป็น String
	    	strUsername = editTextUsername.getText().toString().trim();
	        
	        //เช็คว่าเป็นค่าว่างหรือเปล่า?
	        if(strUsername.isEmpty()){
	        	Toast.makeText(v.getContext(), "Your Username must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{

	        }
	    }
	    
	    //เช็ค Validate ของ Password
	    public void btnValidatePassword(View v){
	    	//รับค่ามาแปลงให้เป็น String
	    	strPass = editTextPass.getText().toString().trim();
	    	strConfirmPass = editTextConfirmPass.getText().toString().trim();
	
	    	//เช็คว่า Pass กับ  ConfirmPass นั้นตรงกันหรือไม่ เก็บค่าไว้ใน matcherObj>>>True or False
	        Matcher matcherObj = Pattern.compile(strPass).matcher(strConfirmPass);
	        
	        //เช็คว่าเป็นค่าว่างหรือเปล่า?
	        if(strPass.isEmpty()){
	        	Toast.makeText(v.getContext(), "Password must not empty", Toast.LENGTH_SHORT).show();
	
	        }else if(strConfirmPass.isEmpty()){
	        	Toast.makeText(v.getContext(), "ConfirmPassword must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{
	        	//เช็คว่าpassที่ใส่ ตรงกันหรือเปล่า?
	        	if (matcherObj.matches())
	            {
	            	
	            }
	            else
	            {
	            	Toast.makeText(v.getContext(), "Password is InValid", Toast.LENGTH_SHORT).show();
	            }
	        }
	        
	    }
 
}
