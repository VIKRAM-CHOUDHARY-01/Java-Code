package com.Java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionLambda {
public static void main(String[] args) {
	List<Integer> list = new ArrayList();
	list.add(2);
	list.add(1);
	list.add(100);
	list.add(5);
	System.out.println(list);
	System.out.println("------------------\n");
	Collections.sort(list);
	System.out.println("Sorted List :  " + list);
	Collections.sort(list, (a,b)->b-a);
	System.out.println("Decending Order : " + list);
	
	System.out.println("\n------------------\n");
	//One More Example
	TreeSet<Integer> ts = new TreeSet<>();
	ts.add(34);
	ts.add(4);
	ts.add(10);
	ts.add(2);
	
	System.out.println("Natural Order : " + ts);
	
	TreeSet<Integer> ts1 = new TreeSet<>((a,b)->b-a);
	ts1.add(34);
	ts1.add(4);
	ts1.add(10);
	ts1.add(2);
	System.out.println(ts1);
	
	
}
}
