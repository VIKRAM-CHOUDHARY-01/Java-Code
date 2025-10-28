package Queue;

import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
	String sName;
	int sRoll;
	Student(String sName, int sRoll){
		this.sName = sName;
		this.sRoll =sRoll; 
	}
	
	@Override
	public int compareTo(Student st) {
		return this.sRoll-st.sRoll;
	}
	@Override
	public String toString() {
		return  " Roll : " + sRoll + " Name : " + sName;
	}
}

public class ComparableUsage{
	public static void main(String[] args) {
		Student s1 = new Student("Vikram", 3);
		Student s2 = new Student("Roland", 1);
		Student s3 = new Student("Odessy", 4);
		
		ArrayList arr = new ArrayList();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		System.out.println(arr);
		
		System.out.println("--------------------------------\n");
		Collections.sort(arr);
		System.out.println(arr);
	
	
	}
	
}