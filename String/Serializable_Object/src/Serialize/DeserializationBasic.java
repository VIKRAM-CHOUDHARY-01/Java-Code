package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Anime implements Serializable{
	private static final long serialVersionUID = 1L;
	private String animeName;
	private transient int ep;
	public String getAnimeName() {
		return animeName;
	}
	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
	
	
	public int getEp() {
		return ep;
	}
	public void setEp(int ep) {
		this.ep = ep;
	}
	@Override
	public String toString() {
		return "Anime name is : " + animeName + " And Total Episodes are : " + ep;
	}
	
}
public class DeserializationBasic {

	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Anime an = new Anime();
		an.setAnimeName("Attack On Titan");
		an.setEp(87);
		System.out.println(an);
		
		try(FileOutputStream fos = new FileOutputStream("Anime.ser")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(an);
			System.out.println("Object Serialized Successfully");
			
			//De-serialization
			
			FileInputStream f = new FileInputStream("Anime.ser");
			ObjectInputStream ois = new ObjectInputStream(f);
			Anime a = (Anime) ois.readObject();
			System.out.println("De-serialized Succesfully : the object -> " + a);
			System.out.println(a.getAnimeName());
			ois.close();
			f.close();
			
		}
		
	}
}
