package com.collection;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

public static void main(String[] args) {
		
	ArrayList<String> al= new ArrayList<String>();
	//al.add(10);
	al.add("swapnil");
	al.add(null);
	al.add(2, "swasas");
	//al.addAll(L);
	System.out.println(al);
	
		ArrayList<BookBean> L = new ArrayList<BookBean>();
		
		BookBean b1= new BookBean(1, "Let us see", "sapn", "ABC publ");
		//L.add(null);
		L.add(b1);
	//	L.addAll(al);
	
		
		for(BookBean b: L) {
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
		}
	}
}
