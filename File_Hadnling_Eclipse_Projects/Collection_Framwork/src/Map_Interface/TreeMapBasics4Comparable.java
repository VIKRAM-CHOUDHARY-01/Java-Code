package Map_Interface;

import java.util.TreeMap;

class Student implements Comparable<Student>{
	 String Name;
	int Age;
	Student(String Name, int Age){
		this.Name = Name;
		this.Age= Age;
	}
	@Override
	public int compareTo(Student s) {
		return s.Name.compareTo(this.Name);
	}
	@Override
	public String toString() {
		return this.Name;
	}
}
public class TreeMapBasics4Comparable {
public static void main(String[] args) {
	Student s1 = new Student("Vikram", 21);
	Student s2 = new Student("Ajay", 26);
	Student s3 = new Student("Prem", 24);
	Student s4 = new Student("Raghav", 23);
	Student s5 = new Student("Ridam", 21);
	TreeMap<Student, Integer> map = new TreeMap<>();
	map.put(s1, s1.Age);
	map.put(s2, s2.Age);
	map.put(s3, s3.Age);
	map.put(s4, s4.Age);
	map.put(s5, s5.Age);
	System.out.println(map);
	
}
}
