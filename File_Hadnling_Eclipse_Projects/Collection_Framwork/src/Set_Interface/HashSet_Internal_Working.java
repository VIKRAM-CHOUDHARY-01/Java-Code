package Set_Interface;

import java.util.HashSet;

public class HashSet_Internal_Working {
	public static void main(String[] args) {
		//Proving That HashSet does not store Duplicate Value
		HashSet<String> hs = new HashSet<>();
		boolean b = hs.add("India");
		boolean b2 = hs.add("USA");
		boolean b3 = hs.add("India");
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3); // false
		
		
		
	}

}
