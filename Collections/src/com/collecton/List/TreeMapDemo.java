package com.collecton.List;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> m= new TreeMap<>();
		m.put(1, "swapnilk");
		m.put(2, "dsabd");
		
		for(Map.Entry a:m.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
	}

}
