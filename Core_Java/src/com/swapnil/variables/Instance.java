package com.swapnil.variables;

public class Instance {
int rollno=100;
String name="swapnil";
static String clgName="sps";
int[][] x=new int[2][];
public void m() {
	/*System.out.println(i);
	 * }
	 */
	
}

public static void main(String[] args) {
	 final int m=10;
	System.out.println(m);
	Instance I=new Instance();
I.rollno=101;
I.name="swap";
I.clgName="acro";

Instance I2=new Instance();
System.out.println("new values:"+I2.rollno +I2.name +I2.clgName);
I2.m();
System.out.println(I.x + " "+I.x[0] +" "+I.x.length);

	
}
}
