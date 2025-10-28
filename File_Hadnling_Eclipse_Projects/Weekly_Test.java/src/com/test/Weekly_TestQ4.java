package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Weekly_TestQ4 {
public static void main(String[] args) {
	//     How to create file and folder using file Handling?
	
		File f = new File("NewFolder");
		if(!f.exists()) {
			f.mkdir();
			System.out.println("Folder Created Successfully");
		}else {
			System.out.println("Folder Already exists");
		}
		
		try(
				FileWriter fw = new FileWriter("NewFolder/file.txt");
				){
			System.out.println("File Created in NewFolder");
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
}
}
