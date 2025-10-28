package com.File_Reading;

import java.io.FileReader;
import java.io.IOException;

public class File_Reading {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("PracticeFolder/newData.txt");
		int n;
		while((n = fr.read())!=-1) {
			
			System.out.print((char) n);
		}
		
		fr.close();
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
