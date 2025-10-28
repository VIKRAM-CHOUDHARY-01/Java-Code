package Collection_Main.com.List.Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Basic {
public static void main(String[] args) {
	List li1 = new ArrayList();
	li1.add(24);
	li1.add(34);
	System.out.println(li1);
	ArrayList <String>al = new ArrayList<>();
	al.add("Vikram");
	al.add("Choudhary");
	al.add("is Best");
	Iterator it = al.iterator();
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
	System.out.println("Accessing it through index :" + al.get(1));
	
	//Using List Iterator
	System.out.println("\n---------------------------------------------\n");
	
	ListIterator li = al.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
}
}
