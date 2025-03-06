import java.io.FileWriter;
import java.io.IOException;
public class File_Creation4{
    public static void main(String []args) throws IOException{
        FileWriter filewriter = new FileWriter("NewFolder/newFile.txt");
        //filewriter.write("Hello MF");
        filewriter.append("\n Nice Guy");
        filewriter.append(
            "\n I am a programmer");
       filewriter.close();
     
    
    }
}