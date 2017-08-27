package com.string;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		String s="swapnil";
	//	s=s.concat("Bansal");
		System.out.println(s);
		System.out.println(s.charAt(2));
	//	System.out.println(s.charAt(10));
		System.out.println(s.equals("Swapnil")); // case sensitive
		System.out.println(s.equalsIgnoreCase("swaPnil"));
		System.out.println(s.length());
		System.out.println(s.replace('a', 'b'));
		
		
	}

}
