package com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList object= new LinkedList();
		object.add("A");
        object.add(1);
        object.addLast("C");
        object.addFirst('D');
        object.add(2, "E");
        object.add("F");
        object.add("G");
        object.add(null);
        
        System.out.println(object);
        object.remove();
        System.out.println(object);
        System.out.println(object.contains("C"));
        System.out.println(object.size());
		
	}
}
