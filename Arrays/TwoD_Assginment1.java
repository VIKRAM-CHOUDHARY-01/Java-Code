//Assignment - 19/02/25

import java.util.*;
public class TwoD_Assginment1{

    public static void printArray(int a[][]){
        for(int i =0;i<a.length;i++){

            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        /* Q.1 int a[][]={{23,56,465},{64,432,24}};

            432 
            24 print    */

            int a[][] ={{23,56,465},{64,432,24}};
            System.out.println(a[1][1]);
            System.out.println(a[1][2]);


        /*Q2
                user input :2 D array 
                string 
                row1 :fruits name :3 
                row2 :class student name :3
                row3: family name :3 */
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter row of Array : ");
                int row = sc.nextInt();
                System.out.println("Enter Column of Array : ");
                int colomn = sc.nextInt();
                int b[][] = new int[row][colomn];
                for(int i =0;i<row;i++){
                    for(int j =0;j<colomn;j++){
                        b[i][j] = sc.nextInt();
                    }
                }
                printArray(b);


            /*Q3
                            user input :
                float value :
                column1 :10th,12th 
                column2 :first year , second year percentage   */
                
                int marks[][] = new int[2][2];
                for(int i = 0;i<a.length;i++){
                    for(int j = 0;j<a.length;j++){
                        marks[i][j] = sc.nextInt();
                    }
                }
                printArray(marks);


            /*Q4
                                2 D array :method print method 
                ->print element through method 
                int a[][]={{1,2,3},{45},{8,9,6,3,5},{0},{2,3}}; */
                int c[][]={{1,2,3},{45},{8,9,6,3,5},{0},{2,3}};
                printArray(c);


                

                



    }
}