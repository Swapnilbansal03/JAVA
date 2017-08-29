package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	
	List L=new ArrayList(); 
	L.add("swap");
	L.add("bansal");
	  System.out.println(L);
	List L1=new LinkedList();
	L1.add("anahu");
	L1.add("Bansal");
       System.out.println(L1);
    L1.addAll(0, L);
       System.out.println(L1);
    L1.remove(1);
    System.out.println(L1);
    System.out.println(L1.get(2));
    L1.set(2, "swapi");
    System.out.println(L1);
    //subList from one listparent
    System.out.println(L1.subList(0, 2));
    //printing each element of list using foreach of java 8
    L1.forEach (e -> System.out.println(e) );
}
}
