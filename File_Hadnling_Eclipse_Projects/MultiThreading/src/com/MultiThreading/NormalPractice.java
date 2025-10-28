package com.MultiThreading;

class Name1{
	
	public void run() {
//		for(int i =0;i<=100;i++) {
//			System.out.println("Vikram");
//		}
	
		System.out.println(Thread.currentThread());
	}
	
}
class Name2 extends Thread{
	
	public void run() {
		for(int i =0;i<=100;i++) {
			System.out.println("Noman");
		}
	}
}
public class NormalPractice {
	public static void main(String[] args) {
		Name1 obj = new Name1();
		Name2 obj2 = new Name2();
		obj2.setPriority(10);
//		obj.setName("Vikram kA THREADSSS");
		
		Thread th = new Thread();
//		System.out.println(obj.getName());
//		System.out.println(obj.getId());
//		System.out.println(obj.getPriority());
		System.out.println(obj2.getPriority());
		NormalPractice obj3 = new NormalPractice();
		System.out.println(th.currentThread());
	
		System.out.println("-----------------------------");
		
		obj.run();
		
		
		
	}

}
