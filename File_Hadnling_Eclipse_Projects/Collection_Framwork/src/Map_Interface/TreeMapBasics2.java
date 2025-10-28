package Map_Interface;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapBasics2 {
public static void main(String[] args) {
	TreeMap<Integer, String> map = new TreeMap<>();
	map.put(100, "Ken");
	map.put(200, null);
	map.put(1, "Live");
	map.put(2, null);
	
	for(Entry<Integer, String> ent : map.entrySet()) {
		System.out.println(ent.getKey() + "\t" + ent.getValue());
	}
	
}
}
