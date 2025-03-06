import java.io.IOException;
public class Throws_Eg{
    public static void operation() throws IOException{
    throw new IOException("Found IO Exception");
    }
    public static void main(String []args){
        try{
            operation();
        } catch(IOException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }   
      
        System.out.println("Program Continues");
    }
}