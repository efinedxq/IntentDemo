package com.example.demointent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class YSActivity extends Activity {
	private   TextView text ;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_three);
	        Button button = (Button)findViewById(R.id.btn3_1);
	        text = (TextView)findViewById(R.id.textView3);
	        
	        
	        button.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Uri data = Uri.parse("YSActivity  RESULT_OK");
					Intent result = new Intent(null,data);
					setResult(RESULT_OK,result);
					finish();
				}
			});
	    }  
	 
}
