package com.File_Reading;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class File_Writing {
public static void main(String []args) {
	//Directory Creation
	File f = new File("PracticeFolder");
	if(!f.exists()) {
		
		f.mkdir();
		System.out.println("Directory Created");
	}else {
		System.out.println("Directory already Exists");
	}
	
	
	try {
		FileWriter fw = new FileWriter("PracticeFolder/newData.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("Nice");
		bw.newLine();
		bw.append(" Ok");
		
	
		System.out.println("Data is Written");
		bw.close();
		fw.close();
		
		
	}catch(IOException e) {
		System.out.println(e);
	    e.printStackTrace();
		
	}
	
}
}
