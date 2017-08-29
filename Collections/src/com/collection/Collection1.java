package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
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
		Collections.reverse(al1);
		System.out.println(al1+":reverse");
		
		//removing duplicate element in arraylist
		al1.add(1);
		System.out.println(al1);
		Set s= new LinkedHashSet(al1);
		System.out.println(s);
		al1.clear();
		al1.addAll(s);
		System.out.println(al1);
		
		//Treeset
		
		Set ts=new TreeSet(al1);
		System.out.println(ts);
		}

}
