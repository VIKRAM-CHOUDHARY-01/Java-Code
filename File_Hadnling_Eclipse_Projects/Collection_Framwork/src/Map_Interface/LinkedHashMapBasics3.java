package Map_Interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics3 extends LinkedHashMap<String,String>{

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry eldest) {
		// TODO Auto-generated method stub
		return size()>3;
	}
public static void main(String[] args) {
	LinkedHashMapBasics3 obj= new LinkedHashMapBasics3();
	
	obj.put("Country", "USA");
	obj.put("City", "Las Vegas");
	obj.put("Popular", "Casino");
//	obj.put("Hollywood", "Quinton");

	
	for(Map.Entry<String,String> entry : obj.entrySet()) {
		System.out.println(entry.getKey() + "\t" + entry.getValue());
	}
}
}
