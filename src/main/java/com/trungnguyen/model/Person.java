package com.trungnguyen.model;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;
	private ArrayList<String> tel;
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age, ArrayList<String> tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	public void init() {
		System.out.println("Khoi tao bean");
	}
	public void destroy() {
		System.out.println("Huy bean");
	}
}
