package com.spring.pojo;

public class SpringPojo2 {
	
	public String name; 
	public String lastName;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
public SpringPojo2(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

public void print() {
		
		System.out.println("your name: " +name +" "+lastName);
	}
}
