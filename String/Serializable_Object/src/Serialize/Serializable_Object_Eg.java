package Serialize;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private static final long serialVersionUId=1L;
	private String name;
	private int age;
	private String rollNumber;
	
	//constructor
	public Student(String name,int age, String rollNumber) {
		this.name= name;
		this.age=age;
		this.rollNumber=rollNumber;
	}
	//to get data
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + "]";
	}
	
	
}
public class Serializable_Object_Eg {
	public static void main(String[] args) {
		String fileName = "student.ser"; // file to store serialized Object
		
		
		//Step:2 Serialize the object
		
		Student st = new Student("Bruce Wayne", 22, "BCA101");
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))){
				os.writeObject(st);
				System.out.println("Object Serialized Successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		//Step:3 Deserialize the object
		
		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName))){
			Student deserializedStudent = (Student) is.readObject();
			System.out.println("Object Seserialized Successfully");
			System.out.println("Deserialized Object Data : " + deserializedStudent);
			
		}catch(IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
}
}
