package com.wrapper;

public class Wrapper {
	public static void main(String[] args) {
		String s= Integer.toString(10);
		Integer I = new Integer("10");
		Integer I1= Integer.valueOf(10);
		int i=Integer.parseInt("1000");
		
		System.out.println(I);
	}

}
