package com.File_Reading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Content_Count {
public static void main(String[] args) {
	File f = new File("Data/newD");
	if(!f.exists()) {
		f.mkdir();
		System.out.println("Directory Created");
	}else {
		System.out.println("Directory already Exists");
	}
	
	try{
		FileWriter fw = new FileWriter("Data/newD/text.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	
		bw.write("Hello Mother Fucker");
		bw.newLine();
		bw.write("How are you Hot Vikram ?");
		bw.close();
		fw.close();
		BufferedReader br = new BufferedReader(new FileReader("Data/newD/text.txt"));
	
		String line;
		int words=0;
		int li=0;
		int count = 0;
		while((line=br.readLine())!=null) {
			String word[] = line.split("\\s");
			for(int i =0;i<word.length;i++) {
				
				if(word[i].equals("Vikram")) {
					count++;
				}
			
			}
			words+=word.length;
			System.out.println(line);
			li++;
			
		}
		System.out.println("Total Words are : " + words);
		System.out.println("Total Lines are : " + li);
		System.out.println("Total times the word Vikram came : " + count);
		
		
		
		br.close();
		
		File f2 = new File("Data");
		
		File [] fil = f2.listFiles();
		for(int i = 0;i<fil.length;i++) {
			System.out.println(fil[i].getName());
		}
		
	
		
	}catch(IOException e)  {
		System.out.println(e);
	}
}
}
