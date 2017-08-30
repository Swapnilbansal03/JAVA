package com.collection;

import java.util.LinkedList;

public class LinkedListBook {
public static void main(String[] args) {
	
	
	LinkedList L = new LinkedList();
	L.add( null);
	L.add(1);
	L.remove();
	L.get(0);
	System.out.println(L.indexOf(1));
	
	System.out.println(L);
	
	LinkedList<BookBean> LB = new LinkedList<BookBean>();
	
	BookBean BB=new BookBean(1, "swap", "hello", "bshas");
	BookBean BB1=new BookBean(2, "swap1", "hello1", "bshas1");
	BookBean BB2=new BookBean(3, "swap2", "hello2", "bshas2");
	
	LB.add(BB);
	LB.addLast(BB1);
	LB.addFirst(BB2);
	
	System.out.println(LB.toString());
	
}
}
