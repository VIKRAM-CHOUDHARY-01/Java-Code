package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MovieData {
	

public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	MovieDataSerialize mds = new MovieDataSerialize("Dark Knight", "Christphor Nolan");
	try(FileOutputStream fos = new FileOutputStream("moviedata.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);){
		
		oos.writeObject(mds);
		System.out.println("Object Serialized Succesfully");
		System.out.println("\n--------------------------------------------\n");
		
		FileInputStream fis = new FileInputStream("moviedata.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MovieDataSerialize m = (MovieDataSerialize) ois.readObject();
		
		System.out.println("Deserilization Succesfully");
		System.out.println(m);
		ois.close();
		fis.close();
		
		
	}catch(IOException e) {
		System.out.println(e);
	}
}

}
