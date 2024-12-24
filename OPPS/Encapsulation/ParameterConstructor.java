import java.util.*;
class A {
    A(int a, int b){//Parameterized Constructor
        int sum = a+b;
        System.out.println("The Sum is : " + sum);
       

    }
}
public class ParameterConstructor{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Enter Number : ");
        int m = sc.nextInt();
        A obj = new A(n,m);

    }
}