package com.example.observerdemo.listener;

public interface BeanSubject {
	void registerObserver(BeanObserver observer);
	
	void removeObserver(BeanObserver observer);
	
	void notifyUpData();

}
