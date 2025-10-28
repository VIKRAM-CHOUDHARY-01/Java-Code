package com.print;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterCl {
public static void main(String[] args) {
	try {
		PrintWriter pw = new PrintWriter("../Practice_File_Reading/Data/newFile.txt");
		pw.write("Hello Roland");
		pw.println("Nice Guys");
		pw.close();
		
		//To Write something on Console
		PrintWriter pw2= new PrintWriter(System.out, true);
		pw2.println("Nice");
		pw2.close();
		
		
	}catch(IOException e) {
		System.out.println(e);
	}
	
	
}
}
