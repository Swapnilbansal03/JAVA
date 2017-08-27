package com.wrapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
 
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abc.txt");
		fw.write("swapnil");
		char[] ch={'a','b'};
		
		FileReader fr= new FileReader("abc.txt");
		int i= fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}
		/*System.out.println(i);*/
	}
}
