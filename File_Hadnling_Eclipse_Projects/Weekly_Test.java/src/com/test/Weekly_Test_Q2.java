package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Weekly_Test_Q2 {
public static void main(String[] args) {
	//Q2    Java Program to read file data using the bufferedReader class?
	
	try(BufferedReader br = new BufferedReader(new FileReader("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/Practice_File_Reading/NewFolder/newFile.txt")))
			{
				String s;
				while((s=br.readLine())!=null) {
					System.out.println(s);
				}
				
			}catch(IOException e) {
				System.out.println(e);
			}
}
}
