package com.collecton.List;

import java.util.ArrayList;

public class ArrayListDemo {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al= new ArrayList();
		ArrayList al1= new ArrayList<>(20);
		ArrayList al2 = new ArrayList(al); 
	al.add(2);
	al1.add("saqp");
	al.addAll(al1);
	al.add(null);
	al.add(2, "bansal");
	al.remove(2);
	al.remove(2);
	al.removeAll(al1);
	
	System.out.println(al);
	for(Object o:al) {
		System.out.println(o);
	}
	}

}
