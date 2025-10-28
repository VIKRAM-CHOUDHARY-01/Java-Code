package Collection_Main.com.List.Interface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add(1);
		vc.add(2);
		vc.add(3);
		
		Enumeration em = vc.elements();
		
		while(em.hasMoreElements()) {
			Object a = (Object) em.nextElement();
			System.out.println(a);
		}
		System.out.println(vc.lastElement());
		System.out.println("----------------------------");
		Iterator it = vc.iterator();
		while(it.hasNext()) {
			Object b = it.next();
			System.out.println(b);
		}
		System.out.println("----------------------------");
		
		ListIterator lt = vc.listIterator();
		while(lt.hasNext()) {
			Object c = lt.next();
			System.out.println(c);
		}

		System.out.println("----------------------------");
		
		while(lt.hasPrevious()) {
			
		System.out.println(lt.previous());
		}
	}

}
