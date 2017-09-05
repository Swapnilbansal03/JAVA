package com.swapnil.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap();
		m.put(5, "swapnil");
		m.put(2, "anshu");
		m.put(8, "prayik");
		m.put(1, "akasna");
		System.out.println(m);
		Set s=m.keySet();
		System.out.println(s);
		Collection c= m.values();
		System.out.println(c);
		Set s1= m.entrySet();
		for(Map.Entry map:m.entrySet()) {
			System.out.println(map.getKey()+ " "+ map.getValue());
		}
		Iterator itr= s1.iterator();
		while(itr.hasNext()) {
			Map.Entry map= (Map.Entry) itr.next();
			System.out.println(map.getKey()+" "+ map.getValue());
		}
		
		
		
	}
}
