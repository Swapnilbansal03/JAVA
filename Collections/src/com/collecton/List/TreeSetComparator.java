package com.collecton.List;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator implements Comparator {
	
	public static void main(String[] args) {
	
		TreeSet ts= new TreeSet(new TreeSetComparator());
		ts.add(0);
		ts.add(1);
		ts.add(3);
			System.out.println(ts);
}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i=(Integer) o1;
		Integer y=(Integer)o2;
		/*if(i<y) {
		return +1;	
		}
		else if(i>y) {
			return -1;
		}
		else
		return 0;*/
		
		//return -i.compareTo(y);
		return y.compareTo(i);
		//return +1; // Insertion order
		
	}
}
