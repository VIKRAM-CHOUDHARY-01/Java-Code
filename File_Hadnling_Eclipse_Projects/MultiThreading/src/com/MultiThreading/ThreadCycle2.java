package com.MultiThreading;

public class ThreadCycle2 extends Thread {
	@Override
	public void run() {
		System.out.println("Run method executes");
		System.out.println("Current Thread : - > " + Thread.currentThread());
	}
	
	public static void main(String[] args) {
		ThreadCycle2 ts = new ThreadCycle2();
		ThreadCycle2 ts2 = new ThreadCycle2();
		ThreadCycle2 ts3 = new ThreadCycle2();
		
		ts.setName("MyThread");
		ts2.setName("MyThread2");
		ts3.setName("MyThread3");
		ts.setPriority(MIN_PRIORITY);
		ts2.setPriority(NORM_PRIORITY);
		ts3.setPriority(MAX_PRIORITY);
		System.out.println("For ts");
		System.out.println("Thread Name : " + ts.getName());
		System.out.println("Thread ID : " + ts.getId());
		System.out.println("Thread Prority : "+ ts.getPriority());
		
		System.out.println("----------------------------------\n\n");
		
		System.out.println("For ts2: ");
		System.out.println("Thread Name : " + ts2.getName());
		System.out.println("Thread ID : " + ts2.getId());
		System.out.println("Thread Prority : "+ ts2.getPriority());
		
		System.out.println("----------------------------------\n\n");
		
		System.out.println("For ts3: ");
		System.out.println("Thread Name : " + ts3.getName());
		System.out.println("Thread ID : " + ts3.getId());
		System.out.println("Thread Prority : "+ ts3.getPriority());
		
		ts.start(); // runnable state
		ts2.start();
		ts3.start();
		
		
	}

}
