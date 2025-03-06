import java.util.*;
public class Custom_Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity : ");
        int qt = sc.nextInt();
        try{
             if(qt>500){
            System.out.println("Successfully Ordered");
        }else {
            throw new Custom("Not Enough Quantity");
        }

        }catch(Exception e){
            System.out.println("Exception Caught");
        }
       
    }
}