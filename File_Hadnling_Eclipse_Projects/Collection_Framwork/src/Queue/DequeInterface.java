package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeInterface {
public static void main(String[] args) {
	Deque<Integer> d = new ArrayDeque<>();
	
	d.add(1);
	d.add(5);
	d.addFirst(0);
	d.add(3);
	
	
	Iterator<Integer> it = d.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("-------------------------/");
	System.out.println(d.remove());
	System.out.println(d);
	System.out.println(d.peek());
	System.out.println(d.removeLast());
}
}
