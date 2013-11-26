package com.example.photocheckin;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class Register extends Activity{
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);     
	        setContentView(R.layout.index_register);
	        
	    }

}
