package com.MultiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceBasic3 {
public static void main(String[] args) throws InterruptedException, ExecutionException  {
	ExecutorService es = Executors.newFixedThreadPool(2);
	Future<Integer> fs = es.submit(()->1+2);
	Integer i = fs.get();
	System.out.println("Sum is : " + i);
	es.shutdown();
	System.out.println(es.isShutdown());	
}
}
