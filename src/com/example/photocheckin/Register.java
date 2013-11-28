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
	        
	        //�Ѻ��ҷ�� User ��͡�������Ъ�ͧ�������㹵����
	        editTextName = (EditText) findViewById(R.id.editTextName);
	        gender = (RadioGroup) findViewById(R.id.radiosex);
	        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
	        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
	        editTextPass = (EditText) findViewById(R.id.editTextPass);
	        editTextConfirmPass = (EditText) findViewById(R.id.editTextConfirmPass);
	  }
	  	//Set syntax �ͧ E-mail 
	    String regEx =
	        	"[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
	    
		public void btnregis(View v){
			btnValidateName(v);
//			btnValidateGender(v);
			btnValidateEmailAddress(v);
			btnValidateUsername(v);
			btnValidatePassword(v);

		}
		
		//�� Validate �ͧ Name
	    public void btnValidateName(View v){
	    	//�Ѻ������ŧ����� String
	    	strName = editTextName.getText().toString().trim();
	        
	        //������繤����ҧ��������?
	        if(strName.isEmpty()){
	        	Toast.makeText(v.getContext(), "Your name must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{

	        }
	    }
	    
	
		//�� Validate �ͧ E-mail
	    public void btnValidateEmailAddress(View v){
	    	//�Ѻ������ŧ����� String
	    	strEmailAddress = editTextEmail.getText().toString().trim();
	
	    	//����� syntax �ͧ E-mail �Ѻ  E-mail ��� User ��͡�� ��鹵ç�ѹ������� �纤������ matcherObj>>>True or False
	        Matcher matcherObj = Pattern.compile(regEx).matcher(strEmailAddress);
	        
	        //������繤����ҧ��������?
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
	  
		//�� Validate �ͧ UserName
	    public void btnValidateUsername(View v){
	    	//�Ѻ������ŧ����� String
	    	strUsername = editTextUsername.getText().toString().trim();
	        
	        //������繤����ҧ��������?
	        if(strUsername.isEmpty()){
	        	Toast.makeText(v.getContext(), "Your Username must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{

	        }
	    }
	    
	    //�� Validate �ͧ Password
	    public void btnValidatePassword(View v){
	    	//�Ѻ������ŧ����� String
	    	strPass = editTextPass.getText().toString().trim();
	    	strConfirmPass = editTextConfirmPass.getText().toString().trim();
	
	    	//����� Pass �Ѻ  ConfirmPass ��鹵ç�ѹ������� �纤������ matcherObj>>>True or False
	        Matcher matcherObj = Pattern.compile(strPass).matcher(strConfirmPass);
	        
	        //������繤����ҧ��������?
	        if(strPass.isEmpty()){
	        	Toast.makeText(v.getContext(), "Password must not empty", Toast.LENGTH_SHORT).show();
	
	        }else if(strConfirmPass.isEmpty()){
	        	Toast.makeText(v.getContext(), "ConfirmPassword must not empty", Toast.LENGTH_SHORT).show();
	
	        }else{
	        	//�����pass������ �ç�ѹ��������?
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
