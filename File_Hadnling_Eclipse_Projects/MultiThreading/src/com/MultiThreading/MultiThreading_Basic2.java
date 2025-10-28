package com.MultiThreading;

// Java Program to get the details of Main Thread?
public class MultiThreading_Basic2 // ----> Current Thread [ Static Type ] 
{
	public static void main(String[] args) {
		Thread current = Thread.currentThread();
		System.out.println(current);
		System.out.println(current.getId());
		current.setName("Hello");
		System.out.println(current.getName());
		System.out.println(current);
		System.out.println(current.getThreadGroup());
		
	
	}

}
// Note : Thread is a Predefined class Available in java.lang package. In thread class we have a
// static method named currentThread.


/* User Defined Threads
 * -> In java we can create Thread in 2 ways
 * 1) By Extending Thread class
 * 2) By Implementing Runnable Interface
 */
