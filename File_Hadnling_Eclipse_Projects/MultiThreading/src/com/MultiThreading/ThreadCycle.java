package com.MultiThreading;


public class ThreadCycle extends Thread  {
	@Override
	public void run() {
		System.out.println("Running");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void main(String[] args)  throws InterruptedException{
	System.out.println("Current Thread : " + Thread.currentThread());
	System.out.println("Current Thread Name : " + Thread.currentThread().getName());
	System.out.println("Current Thread ID : "+Thread.currentThread().getId());
	System.out.println("---------------------------------\n\n");
	
	
	
	ThreadCycle obj = new ThreadCycle(); // NEW state
	System.out.println(obj.getState());
	obj.start(); // Runnable
	System.out.println(obj.getState());
	//During run method execution its in : Running state. although in getState() -> there is enums of states and there : running is not a state since it does print anyway.
	// if i used sleep(), wait(), join() : its then in blocked/waiting state
	Thread.sleep(200);
	System.out.println(obj.getState()); // Timed Waiting
	obj.join();
	System.out.println(obj.getState());
	
	// when program gets executed : its in Terminated State
	


	
}
}
