package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CoachingDataSerialize {
public static void main(String[] args) {
	 ArrayList<String> teachers = new ArrayList<>();
     teachers.add("Mr. Sharma");
     teachers.add("Ms. Gupta");
     teachers.add("Dr. Verma");

     // Create CoachingData object
     CoachingData coaching = new CoachingData(120, "Java Programming", teachers);
     
//     try(FileOutputStream fos = new FileOutputStream("CoachingData.ser");
//    	ObjectOutputStream oos = new ObjectOutputStream(fos); 
//    	){
//    	 oos.writeObject(coaching);
//    	 System.out.println("Object Serialized Successfully");
//    	 
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//     
     
     System.out.println("\n---------------------------\n");
     try(FileInputStream fis = new FileInputStream("CoachingData.ser");
    	ObjectInputStream ois = new ObjectInputStream(fis);	 ) 
     {
    	 CoachingData newObj = (CoachingData) ois.readObject();
    	 System.out.println("Data De-serialized Succesfully");
    	 System.out.println(newObj);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    
     
     
	
}
}
