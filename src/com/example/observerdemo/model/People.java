package com.example.observerdemo.model;

public class People extends BaseBean {
	private int age;
	private String name;
	private int id;

	public People() {
		super.registerObserver(this);
	}

	public People(String name, int age, int id) {
		super.registerObserver(this);
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
