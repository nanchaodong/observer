package com.example.observerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.observerdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {
	private TextView textview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textview = (TextView) findViewById(R.id.text);
		textview.setText("1");
		textview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this, SecondMainActivity.class);
				startActivity(intent);
			}
		});
	}
}
