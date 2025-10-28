package com.Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingPractice {
public static void main(String[] args) {
	File f = new File("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/File_Handling_Basics/data2");
	if(!f.exists()) {
		
		System.out.println("Folder Created : " + f.mkdir());
	}else {
		System.out.println("Folder Already Exists");
	}
	
	try {
		FileWriter fw = new FileWriter("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/File_Handling_Basics/data2/newTextFile.txt");
		String text = "Hello MotherFukcers";
//		fw.write(text);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(text);
		bw.newLine();
		bw.write(text);
		System.out.println("File has written");
		
		bw.close();
		
		System.out.println("\n-----------------------------\n");
		FileReader fr = new FileReader("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/File_Handling_Basics/data2/newTextFile.txt");
		BufferedReader br = new BufferedReader(fr);
	
//		int a;
//		int count=0;
//		while( (a = fr.read())!=-1) {
//			System.out.print((char) a);
//			count++;
//		}
//		System.out.println("Total charcters : " + count);
		
		
		String reading;
		int words=0;
		while((reading = br.readLine())!=null) {
			
			System.out.println(reading);
			words +=reading.split(" ").length;
			
			
		}
		System.out.println(words);
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
