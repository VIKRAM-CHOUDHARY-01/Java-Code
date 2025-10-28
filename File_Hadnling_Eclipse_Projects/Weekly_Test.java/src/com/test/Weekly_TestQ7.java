package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private static final long serialVersionUID = 2L;
	private String studentName;
	private int studentClass;
	private transient int studentAge;
	Student(String studentName, int studentClass, int studentAge){
		this.studentName = studentName;
		this.studentAge= studentAge;
		this.studentClass = studentClass;
	}
	
	@Override
	public String toString() {
		return "Student name is : " + studentName	+
				" He is in Class : " + studentClass +
				" His age is : " + studentAge;
		}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
}
public class Weekly_TestQ7 {
public static void main(String[] args) throws ClassNotFoundException {
	//   What is transent keyword in java? write down the code for it.
	
	Student s = new Student("Vikram Choudhary", 12, 21);
	//before serialization
	System.out.println("Before Serialization");
	System.out.println(s);
	
	try(
			FileOutputStream fos = new FileOutputStream("Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			){
		oos.writeObject(s);
		System.out.println("Serialization Completed");
		
		//De-serialization
		FileInputStream fis = new FileInputStream("Student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student) ois.readObject();
		System.out.println("De-serialization Completed");
		
		System.out.println("After De-serialization: ");
		System.out.println(s1);
		
	}catch(IOException e) {
		System.out.println(e);
	}

}
}
