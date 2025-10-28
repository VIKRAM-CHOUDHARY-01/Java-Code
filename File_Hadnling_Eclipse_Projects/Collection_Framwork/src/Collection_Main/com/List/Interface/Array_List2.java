package Collection_Main.com.List.Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List2 {
	public static void main(String[] args) {
		List<Integer> arrLi = new ArrayList<>();
		arrLi.add(34);
		arrLi.add(35);
		arrLi.addFirst(1);
		arrLi.addLast(100);

		// Printing all List element using Iteratior

		Iterator it = arrLi.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Printing all List Element using List Iterator.
		System.out.println("\n-------------------------------------------------\n");
		ListIterator lt = arrLi.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("\n-------------------------------------------------\n");
		System.out.println(arrLi.size());
		System.out.println(arrLi.isEmpty());
		System.out.println(arrLi);

		System.out.println(arrLi.remove(2));
		System.out.println(arrLi);
		System.out.println(arrLi.contains(35));
		System.out.println(arrLi.contains(1));
		// arrLi.clear();
		System.out.println(arrLi);
		System.out.println("\n-------------------------------------------------\n");

		Collection<Integer> arrLi2 = new ArrayList();
		arrLi2.add(230);
		arrLi2.add(350);
		arrLi2.add(100);
		System.out.println(arrLi2);
		arrLi.addAll(arrLi2);
		Boolean bn = arrLi.containsAll(arrLi2);
		System.out.println(bn);

	}
}
