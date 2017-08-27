package com.lang;

import java.lang.reflect.Method;

public class PrintingObjectMethods {

	public static void main(String[] args)throws Exception {
	int count=0;	
Class c = Class.forName("java.lang.Object");
Method[] m=c.getDeclaredMethods();
for(Method a :m) {
	count++;
	System.out.println(a.getName());
}
System.out.println(count);
	}
}
