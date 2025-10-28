package com.MultiThreading;

//Q Java Program to create user defined thread using thread class?
class Demo extends Thread{
	@Override
	public void run() {
		System.out.println("Run Method Called.");
	}
}
public class UserDefinedThread1 {
	public static void main(String[] args) {
		Demo dm = new Demo();
		dm.start();
	}

}
