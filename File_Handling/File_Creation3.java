import java.io.IOException;
import java.io.FileWriter;
public class File_Creation3{
    public static void main(String[]args) throws IOException{
        //Append
        FileWriter filewriter = new FileWriter("JavaU/file2.txt", true);
        // filewriter.write("Hello Nice Guy!");
        filewriter.append("What are you doing now day?");
        System.out.println("File Created");
        filewriter.close();
    }
}