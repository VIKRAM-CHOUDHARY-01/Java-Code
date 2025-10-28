package Collection_Main.com.List.Interface;

import java.util.Enumeration;
import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack st = new Stack();
	st.push(12);
	st.push(13);
	st.push(15);
	st.push(20);
	st.push(20);
	st.push(20);
	st.push(20);
	st.push(20);
	st.push(20);
	st.push(20);
	st.push(20);
	System.out.println(st.capacity());
	System.out.println(st);
	System.out.println("--------------------------------------");
	System.out.println(st.search(20));
	System.out.println("--------------------------------------");
	System.out.println(st.indexOf(20));
	System.out.println("--------------------------------------");
	Enumeration em = st.elements();
	while(em.hasMoreElements()) {
		System.out.println(em.nextElement());
	}
	
	
	
}
}
