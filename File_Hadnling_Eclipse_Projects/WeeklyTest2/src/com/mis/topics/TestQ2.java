package com.mis.topics;

class A{
	void show() {
		System.out.println("Class A method");
	}
}

class B{
	//tight coupling
	private A obj = new A();
	void showing() {
		obj.show();
	}
}

interface C{
	void sound();
}
class D implements C{
	//loose coupling
	public void sound() {
		System.out.println("Nice Boy");
	}
}
public class TestQ2 {
	public static void main(String[] args) {
		B ob = new B();
		ob.showing();
		
		D ob2 = new D();
		ob2.sound();
	}

}
