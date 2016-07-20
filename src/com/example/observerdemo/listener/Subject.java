package com.example.observerdemo.listener;

import java.util.HashMap;
import java.util.List;

public interface Subject {
	/**
	 * 注册观察者
	 * @param observer
	 */
	void registerObserver(Observer observer);
	/**
	 * 移除观察者
	 * @param observer
	 */
	
	void removeObserver(Observer observer);
	/**
	 * 得到所有的观察者
	 * @return
	 */
	HashMap<String, Observer> getAllObserver();
	/**
	 * 移除所有的观察者
	 */
	void removeAllObserver();

}
