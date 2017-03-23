package com.example.demointent;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentUris;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button btnXS;
	private Button btnCate;
	private Button btnMini;
	private Button btnUri;
	private Button btnAct;
	private TextView msg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnXS = (Button) findViewById(R.id.button1);
		btnMini = (Button) findViewById(R.id.button2);
		btnCate = (Button) findViewById(R.id.button4);
		btnUri = (Button) findViewById(R.id.button3);
		btnAct = (Button) findViewById(R.id.button5);
		msg = (TextView) findViewById(R.id.textView1);

		btnXS.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, XSActivity.class);
				startActivityForResult(intent, 1);
			}
		});

		btnMini.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setType("image/*");
				startActivity(intent);
			}
		});
		
		btnCate.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.addCategory("my_category");
				startActivity(intent);
			}
		});
		
		btnUri.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri.parse("content://com.example.demointent");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});
		
		
		btnAct.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("android.intent.action.DNG");
				startActivity(intent);
			}
		});
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

	    Uri uriData = data.getData();
		switch (requestCode) {
//		    case 1:
//		        msg.setText("显式启动返回数据:"+uriData.toString()+"/n 结果码:"+resultCode);
//		    	break;
//		    case 2:
//		        msg.setText("隐式启动返回数据:"+uriData.toString()+"/n结果码:"+resultCode);
//		        break;
		}
	}

}
