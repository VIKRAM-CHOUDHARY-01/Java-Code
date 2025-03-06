import java.io.File;
public class Folder_Creation3{
    public static void main(String []args){
        File file = new File("NewFolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder Created Succesfully");
        }else{
            System.out.println("Folder Already Exists");
        }
    }
}