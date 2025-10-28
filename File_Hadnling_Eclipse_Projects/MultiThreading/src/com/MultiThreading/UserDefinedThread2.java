package com.MultiThreading;
//Q Java Program to create user defined thread using Runnable Interface?
class Dem implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
	}
}
public class UserDefinedThread2 {
public static void main(String[] args) {
	Dem d = new Dem();
	Thread t = new Thread(d);
	t.start();
	d.run();
}
}

// What is the difference between extending thread class or implementing runnable interface ? which is recommended?
	
/* Ans: 	If we extend properties from thread class then we can not extend properties from any other class
 *			because java does not support multiple inheritance. (We are closing gate for inheritance)
 *			
 *			if we implement runnable interface then in future we can extend properties from any other class based on 
 *			requirements. [ our gate is open for inheritance ]
 *				
 *			Note : - Implementing runnable interface is always recommended.
 * 
 *	Q What is Thread Scheduler?
 *	Ans: Thread Schedular is a program in the jvm which is responsible to schedule threads execution
 *and resources allocation required for thread.
 * -> When we call start() then Thread schedular will start its operation
 * 1) Allocating Resources
 * 2) Thread Scheduling
 * 3) Thread Execution by calling run() 
 * 
 *
 * Q start() vs run()?
 * 
 * Ans: To start thread execution we will call start() method -> t.start()
 * 		Once start() method is called then thread schedular will come into picture to execute our thread.
 * 		start() method will call run() method internally
 * 
 * Q: Can we call run() directly without calling start()?
 * Ans : Yes, but it will execute like a normal method ( there is no use ) by 'Main' Thread.
 * 		 If we want to execute run() as thread then we should call start() then internally it will call run().
 * 		 (Thread Schedular will take care of Thread Execution)
 * 
 * 		-> If we call start method then run() will be executed by our user defined thread ( We can see thread
 * 		name as Thread - 0)
 *      
 *      -> If we call run()
 * 		
 * 
 * */
