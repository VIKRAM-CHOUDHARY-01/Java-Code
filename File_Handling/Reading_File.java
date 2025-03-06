import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Reading_File{
    public static void main(String []args) throws IOException{
        //FileReader(Object)
        FileReader filereader = new FileReader("JavaU/file2.txt");
        BufferedReader bf = new BufferedReader(filereader);
        // String s = bf.readLine();
        System.out.println(bf.readLine());

        filereader.close();
        bf.close();

        //ctrl + shift + f -> for formating in eclipse
    }
}