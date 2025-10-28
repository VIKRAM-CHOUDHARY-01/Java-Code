package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Basics {
public static void main(String[] args) {
	HashMap<String,String> hm = new HashMap();
	hm.put("Batman", "Bruce Wayne");
	hm.put("Superman", "Clerk Kent");
	hm.put("SpiderMan", "Peter Park");
	hm.put("Ironman", "Tony Stark");
	System.out.println("Getting Batman Name : " + hm.get("Batman"));
	System.out.println("Is Superman Data Available : " + hm.containsKey("Superman"));
	System.out.println("Total Key-Pairs we have : " + hm.size());
	System.out.println("All Keys: "+ hm.keySet());
	System.out.println("All Values : " + hm.values());
	
	System.out.println("--------------------------------------------------------\n\n");
	
	for(Map.Entry<String, String> entry : hm.entrySet()) {
		System.out.println(entry.getKey() + "\t : \t" + entry.getValue());
	}
	
	System.out.println("--------------------------------------------------------\n\n");
	//Or
	
	Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry<String, String> entry = it.next();
		System.out.println(entry.getKey() + "\t : \t" + entry.getValue() );
	}
	
}
}
