package Map_Interface;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMap_Basics {
public static void main(String[] args) {
	
	WeakHashMap wk = new WeakHashMap();
	wk.put(new String("Name"), "Vikram");
	
	System.out.println(wk);
	System.gc();
	System.out.println(wk);
	
	System.out.println("---------------------------------------------------------\n");
	HashMap<String, String> hm = new HashMap();
	hm.put(new String("Name"), "Vikram");
	System.out.println(hm);
	System.gc();
	System.out.println(hm);
	
	
}
}
