import java.util.*;
public class Basic4_Array{
    //user giving size and elements of an array
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i =0;i<a.length;i++){
            System.out.println("Enter Number : ");
            a[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------------------");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
    }
}