package com.test.spring;

public class HelloWorld {

	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("hello "+name);
	}
}
