package com.FileCreation;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;

public class FileCreation {
	public static void main(String[] args) {
		File file = new File("Data");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("Folder Created Successfully");
		}else {
			System.out.println("Folder is Already Created");
		}
		
		try {
			String text = "California Dreaming";
			String text2 = "New Song";
			FileWriter fileCreation = new FileWriter("Data/newFile.txt", true);
//			BufferedWriter bf = new BufferedWriter(new FileWriter("Data/newFile2.txt"));
			
			fileCreation.write(text);
			
			fileCreation.write(text2);
			fileCreation.append(" Hello");
			System.out.println("File Written Successfully");
			fileCreation.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
