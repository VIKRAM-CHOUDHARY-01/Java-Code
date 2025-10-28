package com.Java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
public static void main(String[] args) {
	Consumer<String> obj = s -> System.out.println("Hello, " + s );
	obj.accept("Vikram");
	
	//It has one default method : andThen
	
	Consumer<String> obj2 = s -> System.out.println(s.toUpperCase());
	Consumer<String> obj3 = obj.andThen(obj2);
	obj3.accept("Nice");
	
	
	ArrayList<Integer> li = new ArrayList();
	li.add(1);
	li.add(10);
	li.add(100);
	li.add(1000);
	
	Consumer<ArrayList<Integer>> cons = s ->{
		for (Integer listEle : s) {
			System.out.println(listEle);
		}
	};
	cons.accept(li);
}
}
