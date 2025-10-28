package com.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceBasic2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Callable<String> rs =()->"Hello";
		Future<String> fs = es.submit(rs);
	
		System.out.println(fs.get());
		if(fs.isDone()) {
			System.out.println("Task is Done");
		}
		es.shutdown();
	}

}
