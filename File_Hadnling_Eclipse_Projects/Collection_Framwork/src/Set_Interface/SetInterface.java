package Set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
public static void main(String[] args) {
	
	Set<String> countries = new HashSet<>();
	countries.add("India");
	countries.add("USA");
	countries.add("Austrialia");
	countries.add("Zimbambe");
	countries.add("South Africa");
	countries.add(null);
	Iterator itr = countries.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
