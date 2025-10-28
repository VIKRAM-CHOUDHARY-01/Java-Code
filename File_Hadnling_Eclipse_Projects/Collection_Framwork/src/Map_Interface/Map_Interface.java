package Map_Interface;

import java.util.Map;
import java.util.WeakHashMap;

public class Map_Interface{
	public static void main(String[] args) {
		Map m = new WeakHashMap<String, Integer>();
		m.put("Age", 12);
		m.put("Hight", 5);
		m.put("Weight", 60);
		m.put("Class", 10);
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey("Class"));
		
		
	}
}