package com.spring.pojo;

public class StudentCity {
	
	public String[] sname;
	public City[] city;
	public String[] getSname() {
		return sname;
	}
	public void setSname(String[] sname) {
		this.sname = sname;
	}
	public City[] getCity() {
		return city;
	}
	public void setCity(City[] city) {
		this.city = city;
	}

	public void print() {
		for(int i=0;i<sname.length;i++) {
			System.out.println(sname[i]);
		}
		for(int y=0;y<city.length;y++) {
			System.out.println(city[y].toString());
		}
	}

}
