package com.collecton.List;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList list = new LinkedList<>();
	list.addFirst("a");
	list.addLast("end");
	
	System.out.println(list.getFirst());
	
}
}
