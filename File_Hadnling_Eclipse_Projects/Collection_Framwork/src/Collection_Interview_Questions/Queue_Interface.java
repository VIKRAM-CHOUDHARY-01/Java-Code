package Collection_Interview_Questions;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Interface {
public static void main(String[] args) {
	Queue<Integer> q = new PriorityQueue<>();
	q.add(3);
	q.add(2);
	q.add(1);
	System.out.println(q);
}
}
