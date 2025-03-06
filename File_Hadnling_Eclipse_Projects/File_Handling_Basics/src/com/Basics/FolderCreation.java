package com.Basics;
import java.io.File;
import java.io.IOException;

public class FolderCreation {
	
	public static void main(String[] args) {
		
		File file = new File("Data");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("Folder Created successfully ");
		}else {
			System.out.println("Folder already exists");
		}
		System.out.println("\n-----------------------------------------------\n");
		System.out.print(file.getPath());

		System.out.println("\n-----------------------------------------------\n");
		
		
		System.out.println(file.getAbsolutePath());
		
		System.out.println("\n-----------------------------------------------\n");
		
		
		System.out.println(file.getName());
		
		System.out.println("\n-----------------------------------------------\n");
		
		
		System.out.println(file.isFile());
		
		System.out.println("\n-----------------------------------------------\n");
		
		if(file.exists()) {
			try {
				File f = new File("Data/newFile.txt");
				if(f.createNewFile()) {
					System.out.println("File is Created : " + f.getName());
				}else {
					System.out.println("File is not created, it already Exists");
				}
				
				System.out.println("\n-----------------------------------------------\n");
				
				
				System.out.println(f.length());
				
				System.out.println("\n-----------------------------------------------\n");
				
				
				System.out.println(f.lastModified());
				
				System.out.println("\n-----------------------------------------------\n");
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			//List of all files in the "Data" Folder
			File[] files = file.listFiles();
			System.out.println("\n Contents of Directory : " + file.getName() + ": ");
			if(files!=null) {
				for(File entry : files) {
					System.out.println(" - " + entry.getName());
				}
			}else {
				System.out.println("Directory is empty or inaccessible.\"");
			}
					
		} else {
			System.out.println("Directory does not exist");
		}
	
	
		
	}

}
