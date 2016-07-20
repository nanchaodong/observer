package com.example.observerdemo.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.observerdemo.listener.Observer;
import com.example.observerdemo.listener.Subject;

public class PagerManager implements Subject {
	private static PagerManager instance;
	private static HashMap<String, Observer> maps;

	public static PagerManager getInstance() {
		if (instance == null) {
			synchronized (PagerManager.class) {
				if (instance == null) {
					instance = new PagerManager();
					maps = new HashMap<String, Observer>();
				}
			}
		}
		return instance;
	}

	@Override
	public synchronized void registerObserver(Observer observer) {
		if (maps.containsKey(observer.getClass().getName())) {
			maps.get(observer.getClass().getName()).update(this);
		}
		maps.put(observer.getClass().getName(), observer);

	}

	@Override
	public synchronized void removeObserver(Observer observer) {
		maps.remove(observer.getClass().getName());
	}

	@Override
	public synchronized HashMap<String,Observer> getAllObserver() {
		return maps;
	}

	@Override
	public synchronized void removeAllObserver() {
		maps.clear();
	}
	/**
	 * 关闭一个页面
	 * @param observer
	 */
	public synchronized void closeOnePager(Observer observer){
		observer.update(this);
		maps.remove(observer.getClass().getName());
	}
	public synchronized void closeAllPager(){
		for (Map.Entry<String, Observer> entry : maps.entrySet()) {
			entry.getValue().update(this);
		}
		maps.clear();
	}

}
