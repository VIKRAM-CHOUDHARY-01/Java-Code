import java.io.File;
public class Folder_Creation2{
    public static void main(String []args){
        File file = new File("JavaU");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder has been Created");
        }else {
            System.out.println("Folder already exists");
        }
    }
}