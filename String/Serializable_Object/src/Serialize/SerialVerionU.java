package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	String name;
	private static final long serialVersionUID= 26L;

	Animal(String name) {
		this.name = name;

	}
}
public class SerialVerionU {


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//Serialization
		Animal an = new Animal("Lion");
		
		try(FileOutputStream foos = new FileOutputStream("Animal.ser")){
			
			ObjectOutputStream oos = new ObjectOutputStream(foos);
			oos.writeObject(an);
			System.out.println("Serialization Successfully");
			oos.close();
			
			class Animal implements Serializable {
				String name;
				Boolean isPet;
				private static final long serialVersionUID= 26L;

				Animal(String name, Boolean isPet) {
					this.name = name;
					this.isPet=isPet;
				}
			}
			
			
			//De-serialization
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Animal.ser"));
			Animal deSerializedObject = (Animal) ois.readObject();
			System.out.println("De-serialization Completed");
			ois.close();
			
			
			
			
			
		}
	}
}
