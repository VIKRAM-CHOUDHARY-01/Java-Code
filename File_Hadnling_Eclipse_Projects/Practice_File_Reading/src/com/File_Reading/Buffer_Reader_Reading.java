package com.File_Reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_Reader_Reading {
public static void main(String []args) {
	try {
		FileReader fr = new FileReader("NewFolder/newFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String s ="";
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		br.close();
		fr.close();
	
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
