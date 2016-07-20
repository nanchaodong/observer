package com.example.observerdemo.model;

import com.example.observerdemo.listener.BeanObserver;
import com.example.observerdemo.utils.BeanManager;

public class BaseBean implements  BeanObserver{
	
	


	public void registerObserver(BeanObserver observer) {
		BeanManager.getInstance().registerObserver(observer);
	}

	public void removeObserver(BeanObserver observer) {
		BeanManager.getInstance().removeObserver(observer);
	}
	public void notifyUpdata(){
		BeanManager.getInstance().notifyUpData();
	}

	@Override
	public void update() {
		
	}
	
	

}
