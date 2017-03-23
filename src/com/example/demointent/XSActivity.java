package com.example.demointent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class XSActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button button = (Button)findViewById(R.id.btn2_1);
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri data = Uri.parse("XSActivity  RESULT_OK");
				Intent result = new Intent(null,data);
				setResult(RESULT_OK,result);
				finish();
			}
		});
    }   
}
