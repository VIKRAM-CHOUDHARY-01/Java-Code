package com.wrapperClass;

public class Wrapper_Class_Basics {
public static void main(String[] args) {
	byte b = 20;
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	Byte b1 = new Byte(b);	//AutoBoxing
	System.out.println(b1);
	
	byte b2 = b1; //AutoUnboxing
	System.out.println(b2); 
}
}
