package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain  {

	public static void main(String[] args) {
		
		EmployeeCompare e1= new EmployeeCompare(1, "swap", 20, 2000);
		EmployeeCompare e2= new EmployeeCompare(2, "ansh", 21, 2000);
		
		ArrayList list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, EmployeeCompare.salarycomparator);
		System.out.println(list);
		
		Collections.sort(list, EmployeeCompare.namecomparator);
		System.out.println(list);
	
}}
