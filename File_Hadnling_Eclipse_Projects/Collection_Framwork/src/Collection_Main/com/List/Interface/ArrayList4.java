package Collection_Main.com.List.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList4 {
public static void main(String[] args) {
	ArrayList<Integer> ar = new ArrayList<>();
	ar.add(35);
	ar.add(3);
	ar.add(345);
	
	ar.add(335);
	ar.add(354);
	ar.add(345);
	//First way - to find max element
	int max = ar.get(0);
	Iterator it = ar.iterator();
	
	while(it.hasNext()) {
		int ele = (Integer)it.next();
		if(max<ele) {
			max = ele;
		}
	}
	System.out.println(max);
	//Second Way : to find max Element
	
	System.out.println(Collections.max(ar));
	
	
	
}
}
