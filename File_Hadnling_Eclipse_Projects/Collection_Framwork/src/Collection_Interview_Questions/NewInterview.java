package Collection_Interview_Questions;

import java.util.Enumeration;
import java.util.Properties;

public class NewInterview{
	//Remove Duplicate Elements from String.
	static String duplicate(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		for(int i = 0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(sb.indexOf(ch.toString())==-1) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
		
	
	}
	public static void main(String[] args) {
		System.out.println(duplicate("Hello"));
		
		Properties prop = new Properties();
		prop.put("Film", "The Odessy");
		prop.put("Director", "Christphor Nolan");
		prop.setProperty("Release Date", "2026");
		
		Enumeration en = prop.propertyNames();
		while(en.hasMoreElements()) {
			Object key= en.nextElement();
			Object value = prop.getProperty((String) key);
			System.out.println(key + "\t" + value);
		}
		
	}

}
