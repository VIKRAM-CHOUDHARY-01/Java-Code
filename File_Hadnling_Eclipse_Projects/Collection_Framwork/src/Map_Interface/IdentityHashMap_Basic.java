package Map_Interface;

import java.util.IdentityHashMap;

public class IdentityHashMap_Basic {
public static void main(String[] args) {
	IdentityHashMap idt = new IdentityHashMap();
	idt.put("Name", "Vikram");
	System.out.println(idt.get(new String("Name")));
}
}
