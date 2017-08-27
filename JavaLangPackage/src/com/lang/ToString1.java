package com.lang;

public class ToString1 {
	
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ToString1(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ToString1 [rollno=" + rollno + ", name=" + name + "]";
	}
	
	public int hashCode()    // Overlaod 
	{
		return rollno;
	}
	
	/*public boolean equals(Object obj) {
		try{
			ToString1 ts=(ToString1)obj;
		
		if(name.equals(ts.name)&& rollno==ts.rollno) {
			return true;
		}
		else {
			return false;
		}}
		catch(Exception e) {
			return false;
		}
	
	}  */
}
