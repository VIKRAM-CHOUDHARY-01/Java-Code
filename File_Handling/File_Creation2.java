import java.io.FileWriter;
import java.io.IOException;
public class File_Creation2 {
    public static void main(String []args) throws IOException{
 
            FileWriter filewriter = new FileWriter("JavaU/newFile.txt");
            //turnicate mode
            filewriter.write("Hello, how are you? MF");
            System.out.println("File has been Created");
            filewriter.close();
        
        
    }
}