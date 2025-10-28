package com.File_Reading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Question2 {
public static void main(String []args) {
	//Q.2 Write a java program to read 2 files and data and  write 2 files into 3rd File.
	
	try {
		FileReader fr = new FileReader("Data/newFile.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb =new StringBuilder("");
		String line;
		while((line=br.readLine())!=null) {
			sb.append(line);
		}
		System.out.println("First File Data being Readed");
		br.close();
		fr.close();
		
		
		BufferedReader br2 = new BufferedReader(new FileReader("NewFolder/newFile.txt"));
		String line2;
		while((line2=br2.readLine())!=null) {
			sb.append(line2);
		}
		System.out.println("Second File Data being Readed");
		br2.close();
		
		
		File f = new File("QuestionFolder");
		if(!f.exists()) {
			f.mkdir();
			System.out.println("3rd File Directory Created");
		}else {
			System.out.println("3rd File Drirectory is already Created");
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("QuestionFolder/new.txt"));
		String s = sb.toString();
		bw.write(s);
		bw.close();
		
		BufferedReader b = new BufferedReader(new FileReader("QuestionFolder/new.txt"));
		String l;
		while((l=b.readLine())!=null) {
			System.out.println(l);
		}
		
		
		b.close();
		
		
		
	}catch(IOException e) {
		System.out.println(e);
	}
	
}
}
