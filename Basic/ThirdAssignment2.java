import java.util.*;
public class ThirdAssignment2{
    public static void main(String [] args){
     
     //Assignment 2nd : 9//12/24 -> Part 2

        Scanner sc = new Scanner(System.in);

        /* all primitive data type 
            user define methods :   
            //Primitive Data Types
            //byte, short, int, long, float, double, boolean, char
        */
        //byte
        System.out.println("Enter Byte : ");
        byte bt = sc.nextByte();

        //short

        System.out.println("Enter Short : ");
        short st = sc.nextShort();

        //int
        System.out.println("Enter Number (Int) : ");
        int num = sc.nextInt();

        //long
        System.out.println("Enter Long Data Type : ");
        long lt = sc.nextLong();

        //float
        System.out.println("Enter Float Number : ");
        float fl = sc.nextFloat();

        //double
        System.out.println("Enter Double Number : ");
        double db = sc.nextDouble();

        //boolean
        System.out.println("Enter Boolean : ");
        boolean bl = sc.nextBoolean();

        //char
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);

        System.out.println("Byte : " + bt);
        System.out.println("Short : " + st);
        System.out.println("Int : " + num);
        System.out.println("Long : " + lt);
        System.out.println("Float : " + fl);
        System.out.println("Double : " + db);
        System.out.println("Boolean : " + bl);
        System.out.println("Character : " + ch);


    }
}