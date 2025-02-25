// Assignment - 21/02/25
public class TwoD_Assign2{
    public static void printArray(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void arraySum(int a[][]){
        int sum = 0;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("The sum of array : " + sum);
    }

    public static void twoDmultiplication(int a[][], int b[][], int rowA, int colA, int colB){
        int result[][] = new int[rowA][colB];
        for(int i =0;i<rowA;i++){
            for(int j =0;j<colB;j++){
                for(int k = 0;k<colA;k++){
                    result[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        printArray(result);
    }

    public static void transposeArray(int a[][], int row, int col){
        int transposedArray[][] = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                transposedArray[j][i] = a[i][j];
            }
        }
        printArray(transposedArray);
    }

    public static void main(String [] args){
        /* Q1 2d array questions : 
            basic questions of 2D array 
            1:
            Write a Java program to initialize and display a 2D array of integers.  */

            int a[][] = {{1,2,4}, {5,6,7}};
            printArray(a);

        /*  Q2
            Create a Java program that finds and prints the sum of all elements in a 2D array.*/
            int b[][] = {{1,2,4}, {5,6,7}};
            arraySum(b);


        /*  2)mulitplication    */

            int c[][] = {{1,2,3}, {5,4,2}, {6,3,6}};
            int d[][] = {{1,2},{5,4},{2,5}};
            twoDmultiplication(c,d,3,3,2);


        /*  Q3 
        
                transpose of array 
                123
                456
                789

                output :
                147
                258
                369
                        */


                       int e[][] = {{1,2,3}, {4,5,6},{7,8,9}};
                       transposeArray(e,3,3);


    }
}