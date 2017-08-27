package com.collection;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public class Collection1 {
	public static void main(String[] args) {
		
		ArrayList al= new ArrayList<>();
		al.add(10);
		al.add("swapnil");
		al.add(null);
		System.out.println(al);
		al.add(2, 'a');
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		ArrayList al1= new ArrayList<>();
		al1.add("anshu");
		al1.add(1);
		al1.addAll(0, al);
		System.out.println(al1);
		
		}

}
