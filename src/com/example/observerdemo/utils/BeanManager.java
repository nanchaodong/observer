package com.example.observerdemo.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.observerdemo.listener.BeanObserver;
import com.example.observerdemo.listener.BeanSubject;

public class BeanManager implements BeanSubject {
	private static BeanManager instance;
	private static HashMap<String, BeanObserver> maps;

	public static BeanManager getInstance() {
		if (instance == null) {
			synchronized (PagerManager.class) {
				if (instance == null) {
					instance = new BeanManager();
					maps = new HashMap<String, BeanObserver>();
				}
			}
		}
		return instance;
	}

	@Override
	public void registerObserver(BeanObserver observer) {
		if (maps.containsKey(observer.getClass().getName())) {
			maps.get(observer.getClass().getName()).update();
		}
		maps.put(observer.getClass().getName(), observer);
		
	}

	@Override
	public void removeObserver(BeanObserver observer) {
		maps.remove(observer.getClass().getName());
		
	}

	@Override
	public void notifyUpData() {
		for(Map.Entry<String, BeanObserver> entry: maps.entrySet()){
			entry.getValue().update();
		}
		
	}


	




}
