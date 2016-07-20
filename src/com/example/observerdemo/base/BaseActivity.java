package com.example.observerdemo.base;

import com.example.observerdemo.listener.Observer;
import com.example.observerdemo.listener.Subject;
import com.example.observerdemo.utils.PagerManager;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity implements Observer{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		PagerManager.getInstance().registerObserver(this);		
	}

	@Override
	public void update(Subject subject) {
		this.finish();
	}
	public void closeOnePager(Observer observer){
		PagerManager.getInstance().closeOnePager(observer);
	}
	public void closeAllPager(){
		PagerManager.getInstance().closeAllPager();
	}
	

	@Override
	protected void onDestroy() {
		super.onDestroy();
		PagerManager.getInstance().removeObserver(this);
	}
	
}
