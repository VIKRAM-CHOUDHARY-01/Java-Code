import java.util.*;
public class Example1{
    //Q.1 Example Using try and catch blocks?
    public static void main(String []args){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e);
        }
  
    }
}