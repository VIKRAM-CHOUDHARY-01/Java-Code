package Collections_Basic;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

class Hello{
	
}

public class Legacy_Classes {
public static void main(String[] args) {
	//Legacy Classes -----> jdk (1.2)  Vector, Stack,	Dictionary, Hashtable, Properties
	//Vector
	//1) Collection of Elements : 
	
	Vector v = new Vector();
	int a = 34;
	v.addElement(a);
	v.addElement("Vikram");
	v.addElement(3);
	v.addElement(new Hello());
	System.out.println(v);


	Enumeration enm =  v.elements();
	
	while(enm.hasMoreElements()) {
		Object obj = enm.nextElement();
		System.out.println(obj);
	}
	
	
	//Properties
	System.out.println("\n--------------------------------------------------------------\n");
	Properties p = new Properties();
	p.put("Name", "Vikram");
	p.put("Email", "3factzisbest@gmail.com");
	p.put("Address", "Jaipur");
	p.setProperty("File", "Oppenhiemer");
	System.out.println(p);
	
	Enumeration e = p.propertyNames();
	while(e.hasMoreElements()) {
		Object keys = e.nextElement();
		Object pvalue = p.get(keys);
		System.out.println(keys + "	-	" + pvalue);
	
	}
	//different way for iteration of elements 
	System.out.println("------------------------");
	
	Set<?> se = p.keySet();
	for(Object o : se) {
		System.out.println(o + "	-	" + p.getProperty((String)o));
	}
	
//	//Hashtable
//	System.out.println("\n--------------------------------------------------------------\n");
//	Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
//	ht.put("a", new Integer(3));
//	ht.put("b", new Integer(6));
//	Set st = ht.entrySet();
//	Iterator itr = st.iterator();
//	while(itr.hasNext()) {
//		Map.Entry m = (Map.Entry)itr.next();
//		System.out.println(m.getKey() + "	-	 " + m.getValue());
//			
//	}
//	
	
	//Hashtable
	System.out.println("\n----------------------------------------------------\n");
	
	Hashtable<String, String> table = new Hashtable<>();
	table.put("Film","inception");
	table.put("Director", "Chritopher Nolan");
	Enumeration env1 = table.keys();
	while(env1.hasMoreElements()) {
		Object ke = env1.nextElement();
		System.out.println(ke + "	-	" + table.get(ke));
	}
	System.out.println("\n----------------------------------------------------\n");
	
	
	
	//Stack
	System.out.println("\n------------------------------------------------------\n");
	Stack st = new Stack();
	st.push("Vikram Choudhary");
	st.push("Nice");
	st.push(23);
	System.out.println(st);
	
	Enumeration en = st.elements();
	while(en.hasMoreElements()) {
		Object ele = en.nextElement();
		System.out.println(ele);
	}
	
	
	
}
}
