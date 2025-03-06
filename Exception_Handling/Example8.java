import java.util.*;

public class Example8{
    public static void main(String []args) throws InputMismatchException{
        //Q8 Example using throw and throws
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}