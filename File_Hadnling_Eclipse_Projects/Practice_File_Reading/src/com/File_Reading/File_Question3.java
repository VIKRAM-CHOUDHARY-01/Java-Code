package com.File_Reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Question3 {
public static void main(String[] args) {
	//Q.3	Write a java program to find names which are available in 2 files.
	
	try {
		BufferedReader br = new BufferedReader(new FileReader("Data/newFile.txt"));
		
		String line;
		int count=0;
		while((line=br.readLine())!=null) {
			String [] str = line.split(" ");
			for(int i =0;i<str.length;i++) {
				if(str[i].equals("Vikram")|| str[i].equals("vikram")) {
					System.out.println("Name : " + str[i]);
					count++;
				}
			}
		}
		System.out.println("Total Name came in first file : " + count);
		br.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader("NewFolder/newFile.txt"));
		String line2;
		while((line2=br2.readLine())!=null) {
			String [] str2 = line2.split(" ");
			for(int i =0;i<str2.length;i++) {
				if(str2[i].equals("Vikram" )|| str2[i].equals("vikram")) {
					System.out.println("Name : " + str2[i]);
					count++;
				}
			}
		}
		System.out.println("Total Name came " + count);
		br2.close();
		
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
