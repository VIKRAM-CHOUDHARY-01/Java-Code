package com.File_Reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Question {
    public static void main(String[] args) {
        // Q.1 Write a java program to find how many characters, how many words, and how many lines available in the file.
        try {
            FileReader fr = new FileReader("Data/newFile.txt");
            int count = 0;
            int n;
            while((n=fr.read()) != -1) {
                count++;
            }
            System.out.println("Total characters in file are : " + count);
            
            BufferedReader br = new BufferedReader(new FileReader("Data/newFile.txt"));
            String s;
            int words = 0;
            int lines = 0;
            
            while((s = br.readLine()) != null) {
                lines++;  // Increment lines count for each line read
                String[] wordArray = s.split("\\s+");  // Split line by spaces to get words
                words += wordArray.length;  // Add the number of words in the current line
            }
            
            System.out.println("Total Words in file are : " + words);
            System.out.println("Total Lines are : " + lines);
            
            fr.close();
            br.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
