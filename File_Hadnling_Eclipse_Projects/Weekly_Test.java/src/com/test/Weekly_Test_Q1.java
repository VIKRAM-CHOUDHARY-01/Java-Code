package com.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Weekly_Test_Q1 {
	public static void main(String[] args) {
		
		//Q.1 Java program to read file data using FileReader class?

		try (FileReader fr = new FileReader(
				"C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects/Practice_File_Reading/NewFolder/newFile.txt");) {

			int n;
			while ((n = fr.read()) != -1) {
				System.out.print((char) n);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
