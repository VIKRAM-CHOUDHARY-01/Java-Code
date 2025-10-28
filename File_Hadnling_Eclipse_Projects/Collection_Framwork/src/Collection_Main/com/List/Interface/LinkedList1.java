package Collection_Main.com.List.Interface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(24);
		ls.add(435);
		ls.add(4);
		Iterator it  = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
