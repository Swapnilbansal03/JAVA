package com.lang;

public class ToString2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString1 ts= new ToString1(1,"swapnil");
		ToString1 ts1= new ToString1(2,"Anshu");
		ToString1 ts3= new ToString1(2,"Anshu");
		ToString1 ts4= ts;
		
		System.out.println(ts);
		System.out.println(ts1);
		
		System.out.println(ts.getClass());
		System.out.println(ts1.getClass());
		
		System.out.println(ts.equals(ts1)); // here .equals method compares Refernce not content
		System.out.println(ts1.equals(ts3));
		System.out.println(ts.equals(ts4));	
		System.out.println(ts==ts3);
		System.out.println(ts1==ts3);
		
		String s= new String("swap");
		String s1= new String("swap");
		System.out.println(s.equals(s1));
		// in String class .equals method is overwridden for content comparioson
		System.out.println(s==s1);
		Integer I= new Integer(20);
		System.out.println(I);
		
		
	}

}
