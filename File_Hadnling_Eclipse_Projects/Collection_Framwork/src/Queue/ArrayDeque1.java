package Queue;

import java.util.ArrayDeque;

public class ArrayDeque1 {
public static void main(String[] args) {
	ArrayDeque<Integer> ad = new ArrayDeque<>();
	ad.add(4);
	ad.add(5);
	ad.add(2);
	System.out.println(ad);
	System.out.println(ad.isEmpty());
	System.out.println(ad.reversed());
}
}
