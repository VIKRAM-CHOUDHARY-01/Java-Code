package com.MultiThreading;

class MyThread6 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(isAlive());
			
		}
	}
}
public class DeamonThread {
	public static void main(String[] args) {
		MyThread6 t1 = new MyThread6();
		t1.setDaemon(true);
		t1.start();	
		
		for(int i =0;i<10;i++)
		System.out.println("Virkam");
	}

}
