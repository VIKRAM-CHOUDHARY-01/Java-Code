package Set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Cl {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	lhs.add(1);
	lhs.add(2);
	lhs.add(3);
	lhs.add(4);
	lhs.add(1);
	System.out.println(lhs);
	Iterator it = lhs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
