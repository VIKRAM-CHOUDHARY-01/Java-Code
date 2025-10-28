package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProrityQueue1 {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	pq.add(1);
	pq.add(3);
	pq.add(2);
	pq.add(5);
	Iterator it = pq.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("----------------------------\n");
	System.out.println(pq.peek());
	
	System.out.println(pq);
	System.out.println("----------------------------\n");
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println("----------------------------\n");
}
}
