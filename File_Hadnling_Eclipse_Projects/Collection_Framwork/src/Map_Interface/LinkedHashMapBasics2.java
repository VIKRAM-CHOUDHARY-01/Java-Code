package Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapBasics2 {
public static void main(String[] args) {
	LinkedHashMap<String, String> map = new LinkedHashMap<>(16, 0.75f, true);
	map.put("Name", "Vikram");
	map.put("Age", "21");
	map.put("City", "Jaipur");
	map.put("Job", "Java Developer");
	System.out.println(map.get("Name"));
	System.out.println(map.get("Job"));
	System.out.println(map.get("City"));
	
	System.out.println("------------------------------\n");
	
	//last Accessed Element will be fetched at last
	for(Entry<String,String> et : map.entrySet()) {
		System.out.println(et.getKey() + "\t" + et.getValue());
		// Output : [Age : 21], [Name : Vikram], [Job : Java Developer], [City : Jaipur]
	}
	
}
}
