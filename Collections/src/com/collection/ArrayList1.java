package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.lang.model.element.Element;



public class ArrayList1 {
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		for(int i=0; i<10; i++) {
			al.add(i);
		}
		
		System.out.println(al);
		
	Iterator I= al.iterator();
	ListIterator LI=al.listIterator();
	while(LI.hasNext()) {
		
		int i=(Integer) LI.next();
		System.out.println(i+ " ");
		
		/*if(i%2!=0) {
			I.remove();
		}*/	
	}
while(LI.hasPrevious()) {
		
		int y=(Integer) LI.previous();
		System.out.println(y+ " ");	
	}
	//System.out.println(al);
System.out.println("for each java 8");
al.forEach (e -> System.out.println(e) ); //Java 8 for each

	
	}

}
