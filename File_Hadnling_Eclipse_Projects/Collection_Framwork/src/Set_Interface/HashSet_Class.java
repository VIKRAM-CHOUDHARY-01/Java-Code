package Set_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Class {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("Zebra");
	hs.add("Vikram");
	hs.add("Roland");
	hs.add("Elon Musk");
	hs.add("Apple");
	
	hs.add("Vikram");
	System.out.println(hs);
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
	

	
	//To use ListIterator
	
//	ArrayList<String> arr = new ArrayList<>(hs);
//	ListIterator lt = arr.listIterator();
//	while(lt.hasNext()) {
//		System.out.println(lt.next());
//	}
	
	// to print HashSet in sorted order
	
	System.out.println("---------------------");
	ArrayList<String> ar = new ArrayList<>(hs);
	Collections.sort(ar);
	System.out.println(ar); 
	
	//Converting hashset to array
	System.out.println("---------------------");
	System.out.println("Array :");
	String []arr = new String[hs.size()];
	hs.toArray(arr);
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	
	//Union, Intersection, difference
	System.out.println("------------------------------------");
	HashSet<Integer> h1 = new HashSet<>(Arrays.asList(1,2,3));
	HashSet<Integer> h2 = new HashSet<>(Arrays.asList(3,4,5));
	//Difference
	h1.removeAll(h2);
	System.out.println(h1);
	
	//Union
	h1.addAll(h2);
	
	System.out.println(h1);
	
	//Intersection
	h1.retainAll(h2);
	System.out.println(h1);

	
	
	
}
}
