package com.String_Basics;

public class String_Basics {
public static void main(String[] args) {
	//Imutibility
	
	String s  = "Hello";
	s.concat("How");
	System.out.println(s);
	
	
	//String buffer is not imutability
	
	StringBuffer st = new StringBuffer("Hello");
	st.append("Nice");
	System.out.println(st);
	
	//difference equals and "==" operator
	
	String s1 = new String("Vikram");
	String s2 = "Vikram";
	System.out.println("\nDiffference Betweeen == operator and equals() method : \n");
	System.out.println(s1==s2); //false
	System.out.println(s1.equals(s2)); //true
	
	
	//Scp case
	System.out.println("\nSCP Case : \n");
	String s3 = "Choudhary";
	String s4 = "Choudhary";
	System.out.println(s3==s4);//true
	System.out.println(s3==s4);//true
}
}
