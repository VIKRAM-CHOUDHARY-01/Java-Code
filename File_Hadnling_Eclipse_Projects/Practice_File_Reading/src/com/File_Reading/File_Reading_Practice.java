package com.File_Reading;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class File_Reading_Practice {
public static void main(String[] args) {
	File f = new File("Data");
	if(!f.exists()) {
		f.mkdir();
		System.out.println("Folder Created Successfully");
	}else {
		System.out.println("Folder already exists");
	}
	
	try {
		BufferedWriter bf = new BufferedWriter(new FileWriter("Data/newFile.txt"));
		
		bf.write("Hello my name is vikram");
		bf.newLine();
		bf.write("How are you vikram");
		bf.newLine();
		bf.write("Nice, what about you vikram jat.");
		bf.close();
		
		BufferedReader reading = new BufferedReader(new FileReader("Data/newFile.txt"));
		String s;
//		while((s = reading.readLine()) != null){
//			System.out.println(s);
//	
//		}
		int count=0;
		int totalLines=0;
		while((s=reading.readLine())!=null) {
			
			count += s.split(" ").length;
			System.out.println(s);
			totalLines++;
			
		}
		System.out.println(count);
		System.out.println(totalLines);
		reading.close();
	}catch(IOException e) {
		System.out.println(e);
	}
	
	
	
}
}
