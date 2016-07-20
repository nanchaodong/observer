package com.example.observerdemo;

import com.example.observerdemo.base.BaseActivity;
import com.example.observerdemo.utils.PagerManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ThirdMainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textview = (TextView) findViewById(R.id.text);
		textview.setText("3");
		textview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ThirdMainActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});
	}

	
}
