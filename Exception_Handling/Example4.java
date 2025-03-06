import java.lang.Exception;
public class Example4{
    public static void main(String []args){ 
        //Q.4 Example using multiple try and catch blocks?

        try{
            int a = 10/2;
            try{
                int b = 10/0;
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}