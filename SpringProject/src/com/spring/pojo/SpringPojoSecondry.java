package com.spring.pojo;

public class SpringPojoSecondry {

	public String city;
	public SpringPojoPrimary primary;
	public String[] name;

	public void setName(String[] name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPrimary(SpringPojoPrimary primary) {
		this.primary = primary;
	}

	public void print() {

		System.out.println("the city adress: " + city + " " + primary.getAddress());
		for (int i = 0; i < name.length; i++) {
			System.out.println("names: " + name[i]);
		}
	}
}
