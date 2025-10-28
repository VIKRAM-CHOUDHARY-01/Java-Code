package Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapBasics {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> hash = new LinkedHashMap<>();
	hash.put("Age", 22);
	hash.put("hight", 6);
	hash.put("Weight", 58);
	hash.put("Class", 12);
	System.out.println("Checking if Data contains 6 :" + hash.containsValue(6));
	System.out.println("Getting Age :  "+hash.get("Age"));
	System.out.println("Gtting All Data (Insertion Order is Maintained) : " + hash.entrySet());
	System.out.println("" + hash.sequencedKeySet());
	System.out.println("All data in reversed order : " + hash.reversed());
	
	System.out.println("\n\n----------------------------------------------------\n\n");
	
	for(Entry<String, Integer> s : hash.entrySet()) {
		System.out.println(s.getKey() + "\t" + s.getValue());
	}
}
}
