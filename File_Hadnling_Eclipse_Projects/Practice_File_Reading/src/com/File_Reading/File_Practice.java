package com.File_Reading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Practice {
public static void main(String[] args) {
	File file = new File("NewFolder");
	if(!file.exists()) {
		file.mkdir();
		System.out.println("Folder Created Successfully");
	}else {
		System.out.println("Folder Already Created");
	}
	
	try {
		FileWriter fw = new FileWriter("NewFolder/newFile.txt");
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Churake");
		br.newLine();
		br.write("Dil Mera");
		br.newLine();
		br.write("Yo Boy");
		
		br.close();
		fw.close();
		
		
		
		//Reading the file content
		FileReader  fr = new FileReader("NewFolder/newFile.txt");
		BufferedReader read = new BufferedReader(fr);
		String s;
		/*
		 * int n;
		 * 
		 * while((n = fr.read())!=-1) {
		 * 
		 * System.out.print((char) n); }
		 */
		int totalLines = 0;
		int totalWords=0;
		int times = 0;
		while((s=read.readLine())!=null){
//			System.out.println(s);
			totalLines++;
			totalWords+= s.split(" ").length;
			int index = s.indexOf("Boy");
			if(index!=-1) {
				times++;
			}
		}
		System.out.println("Total Lines in file are : " + totalLines);
		System.out.println("Total Words in file are : " + totalWords);
		System.out.println(times);
		read.close();

		fr.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
