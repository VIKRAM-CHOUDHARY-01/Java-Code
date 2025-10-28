package Collection_Interview_Questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NewInterview5 {
	static void Duplicate(String s) {
		Set<Character> st = new HashSet<>();
		for(int i =0;i<s.length();i++) {
			st.add(s.charAt(i));
		}
		System.out.println(st);
		Iterator it = st.iterator();
		String ans = "";
		while(it.hasNext()) {
			ans+=it.next();
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Duplicate("abbcdcd");
		
	}

}
