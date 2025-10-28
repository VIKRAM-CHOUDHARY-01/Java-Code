import java.util.Scanner;
import static java.lang.Math.sqrt;
public class PerfectNumber{
    public static void PerfectNumber(int a){
        boolean flag = false;
        int perfect=0;
      
       for(int i =1;i<=a/2;i++){
        int rem = a%i;
        if(rem==0){
            perfect+=i;
        }
       }
       if(perfect==a){
            System.out.println("Given Number is Perfect Number");
       }else{
   
        System.out.println("Given Number is not Perfect Number");
       }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        PerfectNumber(a);

    }
}