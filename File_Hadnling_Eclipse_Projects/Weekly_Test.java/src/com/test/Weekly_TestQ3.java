package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Weekly_TestQ3 {
public static void main(String[] args) {
	//Q    Write a java program to how many character, how many words, how many lines in a file.	
	
	try(
			FileReader fr = new FileReader("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/Practice_File_Reading/NewFolder/newFile.txt");
			BufferedReader br = new BufferedReader(new FileReader("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/Practice_File_Reading/NewFolder/newFile.txt"));
			){
		
		//Character
		int n;
		int count=0;
		while((n=fr.read())!=-1) {
			count++;
			
		}
		System.out.println("Total characters in file are : " + count);
		
		//Words and Line
		
		String s;
		int wordsCount=0;
		int lineCount = 0;
		while((s=br.readLine())!=null) {
			String [] words = s.split(" ");
			wordsCount+=words.length;
			lineCount++;
		}
		System.out.println("Total Words are : " + wordsCount);
		System.out.println("Total Lines are : " + lineCount);
		
	}catch(IOException e) {
		System.out.println(e);
	}
	
}
}
