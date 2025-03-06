import java.io.FileWriter;
import java.io.IOException;
public class File_Creation{
    public static void main(String [] args){
        //File Writer
        try{
            FileWriter filewriter = new FileWriter("myFolder/file1.txt");
            filewriter.write("Hello, World!");
            System.out.println("File is created");
            filewriter.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}