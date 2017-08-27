package com.string;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("hekl");
		sb.append("swapnil");
		sb.append(41541);
		System.out.println(sb);
		
		sb.insert(1, "Hello"); 
		System.out.println(sb);
	}
	

}
