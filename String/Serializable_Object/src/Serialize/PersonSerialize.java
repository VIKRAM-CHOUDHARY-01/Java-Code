package Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerialize {
public static void main(String[] args) {
	Person p = new Person("John JohnaHill", 34);
	try(FileOutputStream fos = new FileOutputStream("Person.ser")){
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		System.out.println("Object Serialized Successsfully");
		
		oos.close();
		
	} catch (IOException e) {
				e.printStackTrace();
	}
}
}
