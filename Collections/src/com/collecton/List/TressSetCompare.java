package com.collecton.List;

import java.util.Set;
import java.util.TreeSet;

public class TressSetCompare implements Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set ts= new TreeSet();
		ts.add("Z");
		ts.add("A");
		ts.add("a");
		System.out.println(ts);
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}

}
