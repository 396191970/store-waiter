package com.tuobuxie.service;

public class TestObject {

	String name;
	String age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name="+name+"\tage="+age;
	}
}
