package com.example.observerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.observerdemo.base.BaseActivity;

public class SecondMainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textview = (TextView) findViewById(R.id.text);
		textview.setText("2");
		textview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(SecondMainActivity.this, ThirdMainActivity.class);
				startActivity(intent);
			}
		});
	}

	
}
