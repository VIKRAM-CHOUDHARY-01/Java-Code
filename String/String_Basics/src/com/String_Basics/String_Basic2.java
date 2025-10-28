package com.String_Basics;

public class String_Basic2 {
public static void main(String []args) {
	String s = new String("Java");
	s = s.concat("Programming");
	System.out.println(s);
	
	//Q
	System.out.println("------------------------------");
	String s1 = new String("Java");
	String s2 = new String("Java");
	String s3 = new String("Java");
	String s4 = "Java";
	String s5 = "Java";
	String s6 = "Java";
	System.out.println(s1==s2); //false
	System.out.println(s1==s3); //false
	System.out.println(s1==s4); //false
	System.out.println(s1==s5); //false
	System.out.println(s1==s6); //false
	System.out.println(s2==s3); //false
	System.out.println(s2==s4); //false
	System.out.println(s2==s5); //false
	System.out.println(s2==s6); //false
	System.out.println("------------------");
	System.out.println(s1.equals(s2)); //true
	System.out.println(s1.equals(s3));  //true
	System.out.println(s1.equals(s4)); //true
	System.out.println(s1.equals(s5)); //true
	System.out.println(s1.equals(s6)); //true
	System.out.println(s2.equals(s3)); //true
	System.out.println(s4.equals(s5)); //true
	System.out.println(s5.equals(s6)); //true
	
	System.out.println("-------------------");
	StringBuffer s7 = new StringBuffer("Hello");
	StringBuffer s8 = new StringBuffer("Hello");
	System.out.println(s7==s8); //false -> equals method is of object class and its overridden in string class such that it checks content of string
	System.out.println(s7.equals(s8)); //false - > equals method is of object class, and its not overridden in StringBuffer. thus  it checks references here
	
	System.out.println("-----------------------------");
}
}
