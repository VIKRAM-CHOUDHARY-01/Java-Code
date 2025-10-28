package com.MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceBasic4 {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService es = Executors.newFixedThreadPool(2);
	Callable cal1 = ()->{
		System.out.println("Task 1");
		return 1;
	};
	Callable cal2 = ()->{
		System.out.println("Task 2");
		return 2;
	};
	Callable cal3 = ()->{
		System.out.println("Task 3");
		return 3;
	};
	List<Callable<Integer>> list = Arrays.asList(cal1,cal2,cal3);
	List<Future<Integer>> f = es.invokeAll(list);
	
	es.shutdown();
	System.out.println("Hello World");
	
}
}
