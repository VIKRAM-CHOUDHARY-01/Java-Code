import java.util.*;
public class User_Defined_Exception{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
      
        try{
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age<18){
            throw new UnderAge("No Can't vote");
        }else {
            System.out.println("Yes you are eligible to vote");
        }
        
        }catch(UnderAge e){
            System.out.println(e);
        }
        
    }
}