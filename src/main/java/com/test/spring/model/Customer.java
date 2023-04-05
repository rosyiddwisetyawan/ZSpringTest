package com.test.spring.model;

public class Customer {

	public int id;
	public String name;
	public String mobilenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Customer(int id, String name, String mobilenumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
	}
	
	public Customer(String name, String mobilenumber) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
	}
	
	
	
	
}
