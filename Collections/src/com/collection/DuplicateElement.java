package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateElement {
public static void main(String[] args) {
	
	int arr[]= {10,20,10,30};
	duplicate(arr);
}

static void duplicate(int arr[]) {
	
	TreeMap<Integer, Integer> tm = new TreeMap<>();
	
	for(int i=0; i<arr.length; i++) {
		
		Integer c = tm.get(arr[i]);
		 
		if(tm.get(arr[i])==null) {
			tm.put(arr[i], 1);
		}
		else {
			tm.put(arr[i], ++c);
		}
	}
	 for (Map.Entry m:tm.entrySet())
         System.out.println("Frequency of " + m.getKey() + 
                            " is " + m.getValue());

}
}
