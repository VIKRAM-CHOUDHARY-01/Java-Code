import java.util.*;
public class TwoD_UserInput{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row of Array : ");
        int row = sc.nextInt();
        System.out.println("Enter Coloumn of Array : ");
        int col = sc.nextInt();
        int a [] [] = new int [row][col];
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.println("Enter value in " + (i+1) + " row and column " + (j+1));
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------------------------------------------------------");
           for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(a[i][j] + ",   ");
             
            }
            System.out.println();
        }
    }
}