package Collections_Basic;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Cursor_Classes {
public static void main(String[] args) {
	//1)Enumeration -> only reads and works on Legacy Classes
		Vector<String> v = new Vector<>();
		v.add("Iron Man");
		v.add("Hulk");
		v.add("Captain America");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("------------------------------------------------------------");
	//2)Iterator - > can remove element, and can iterate over all JCF classes
		
		Iterator <String> itr = v.listIterator();
		
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("------------------------------------------------------------");
	
	//3)ListIterator -> Only works on List classes, have full control on elements
			
			ArrayList<Integer> ar = new ArrayList<>();
			ar.add(24);
			ar.add(4);
			ar.add(20);
			ListIterator<Integer> litr = ar.listIterator();
			while(litr.hasNext()) {
				System.out.println(litr.next());
			}
}
}
