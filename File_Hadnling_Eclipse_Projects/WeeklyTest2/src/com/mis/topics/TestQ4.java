package com.mis.topics;
import java.lang.Object;

class Object{
	 public String toString() {
	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    }	
}
class Z{
	void show() {
		System.out.println("Hello");
	}
}

class X{
	@Override
	public String toString() {
		return "Hello Object";
	}
}
public class TestQ4 {
public static void main(String[] args) {
	Z obj = new Z();
	System.out.println(obj);
	X ob = new X();
	System.out.println(ob);
}
}
