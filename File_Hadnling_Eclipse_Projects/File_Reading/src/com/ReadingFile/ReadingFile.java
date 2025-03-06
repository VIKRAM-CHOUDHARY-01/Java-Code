package com.ReadingFile;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadingFile {
	public static void main(String[] args) {
//		File file = new File("Data");
//		if (!file.exists()) {
//			file.mkdir();
//			System.out.println("Folder Created Successfully");
//
//		} else {
//			System.out.println("Folder already Exists");
//		}

		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("Data/newFile.txt"));
			bf.write("Hello Everyone");
			bf.newLine();
			bf.write("How its going? Vikram");
			bf.newLine();
			bf.write("Now we are good Vikram");
			bf.newLine();
			bf.write("Here Vikram is Good.");
			bf.close();

//			FileReader reading = new FileReader("Data/newFile.txt");
			BufferedReader reading = new BufferedReader(new FileReader("Data/newFile.txt"));
			String line;
			int count=0;
			while ((line = reading.readLine()) != null) {
				System.out.print(line);
				System.out.println();
				String [] words = line.split(" ");
				for(String w : words) {
					if(w.equals("Vikram")) {
						count++;
					}
				}
				
			}
			System.out.println(count);
			reading.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
