package com.MultiThreading;

class ehm extends Thread{
	@Override
	//2) run()
	public void run() {
		System.out.println("Hello");
	}
}
public class ThreadMethods {
	public static void main(String[] args) {
		ehm obj = new ehm();
		
		//1) start();
			
			obj.start();
			

	}

}
