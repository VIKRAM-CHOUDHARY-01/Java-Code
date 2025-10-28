package Serialize;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long SerialVersionUID = 5L;
	private String personName;
	private int age;
	Person(String personName, int age){
		this.personName = personName;
		this.age = age;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
