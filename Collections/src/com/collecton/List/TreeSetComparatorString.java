package com.collecton.List;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorString implements Comparator{

		public static void main(String[] args) {
			TreeSet ts= new TreeSet(new TreeSetComparatorString());
			ts.add("anshu");
			ts.add("a");
			ts.add("Z");
			System.out.println(ts);
		}

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1= o1.toString();
			String s2= (String)o2;
			return s2.compareTo(s1);  // desacsneding order
		}
}
