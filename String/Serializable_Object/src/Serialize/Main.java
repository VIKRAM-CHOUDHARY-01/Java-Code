package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
public static void main(String[] args) throws FileNotFoundException, IOException {
	//Serialization
	Employee emp = new Employee("Vikram Choudhary", 50000);
	try(FileOutputStream fos = new FileOutputStream("Employee.ser")){
		ObjectOutputStream op = new ObjectOutputStream(fos);
		op.writeObject(emp);
		System.out.println("Object serialized successfully.");
	}catch(IOException e) {
		System.out.println(e);
	}
			
}
}
