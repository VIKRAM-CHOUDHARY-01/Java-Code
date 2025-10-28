package Collections_Basic;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Legacy_CursorPractice {
	public static void main(String[] args) {
		//Enumeration with Vector
		
		Vector vt = new Vector();
		vt.add("Hello");
		vt.add(34);
		vt.add("World");
		
		Enumeration en = vt.elements();
		while(en.hasMoreElements()) {
			Object ob = (Object) en.nextElement();
			System.out.println(ob);
		}
		
		System.out.println("\n--------------------------------------------------------------\n");
		//Enumeration with Stack
		
		Stack st = new Stack();
		st.push("Naveen");
		st.push("MaderChod");
		st.push("Hai");
		st.push("Kuch bhi kaho");
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println("---");
		Enumeration env = st.elements();
		while(env.hasMoreElements()) {
			Object obj = env.nextElement();
			System.out.println(obj);
		}
		System.out.println("\n--------------------------------------------------------------\n");
		
		//Enumeration with Properties
		Properties pr = new Properties();
		pr.setProperty("Name", "Vikram Choudhary");
		pr.setProperty("AGE", "32");
		
		Enumeration e = pr.propertyNames();
		while(e.hasMoreElements()) {
			Object keys =  (Object) e.nextElement();
			String values = pr.getProperty((String) keys);
			System.out.println(keys + "\t" + values);
			
		}
		System.out.println("\n--------------------------------------------------------------\n");
		//Enumeration with Hashtable
		
		Hashtable ht = new Hashtable();
		ht.put("Movie", "Oppenhiemer");
		ht.put("Director", "Christphor Nolan");
		ht.put("Release Date", 2023);
		
		Enumeration env1 = ht.keys();
		while(env1.hasMoreElements()) {
			Object ke = env1.nextElement();
			System.out.println(ke + "\t" + ht.get(ke));
		}
		
		
	
	}

}
