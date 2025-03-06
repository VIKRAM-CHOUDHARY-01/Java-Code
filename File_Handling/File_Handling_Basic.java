import java.io.File;
public class File_Handling_Basic{
    public static void main(String [] args){

        File file = new File("myFolder");
        //file --> Class
        //ctrl + shilf + o --> import package
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder is created");
            
        }else{
            System.out.println("File exists");
        }
        
    

    }
}