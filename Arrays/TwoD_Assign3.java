//Assignment 2 - 21/02/25

public class TwoD_Assign3{
    public static void ArraySum(int a[][]){
        int sum = 0;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("The sum of array is : " + sum);
    }

    public static void findMax(int a[][]){
        int max = a[0][0];
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(max<a[i][j]){
                    max = a[i][j];
                }
            }
        }
        System.out.println("The max element is : " + max);
    }

    public static void printArray(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
        System.out.println();
    }
    }

    public static void Transpose(int a[][], int row, int col){
        int TransposedArr[][] = new int[col][row];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                TransposedArr[j][i] = a[i][j];
            }
        }
        printArray(TransposedArr);
    }
    public static void TransposeWithoutNewArray(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printArray(a);
    }
    public static void printOneD(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
    public static void rowSum(int a[][]){
        int sum;
        int result[]= new int[a.length];
        for(int i = 0;i<a.length;i++){
            sum = 0;
            for(int j =0;j<a.length;j++){
                sum+=a[i][j];
            }
            result[i] = sum;
        }
        printOneD(result);
    }

    public static void colSum(int a[][]){
        int colArr[] = new int[a[0].length];
        int sum;
        for(int i =0;i<a[0].length;i++){
            sum = 0;
            for(int j = 0;j<a.length;j++){
                sum+=a[j][i];
            }
            colArr[i] = sum;
        }
        printOneD(colArr);
    }
    public static void rotateNighty(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printArray(a);
        System.out.println("--------------------------------");
       for(int i =0;i<a.length;i++){
        for(int j =0;j<a.length/2;j++){
            int temp = a[i][j];
            a[i][j]=a[i][a.length-j-1];
            a[i][a.length-j-1]=temp; 
        }
       }
       printArray(a);
    }

    public static void LargestSmallestRowSum(int a[][]){
        int sum;
      
        int rowSum[] = new int[a.length];
        for(int i =0;i<a.length;i++){
            sum=0;
            for(int j =0;j<a.length;j++){
                sum+=a[i][j];
            }
            rowSum[i] = sum;
        }
          int max = rowSum[0];
        int min = rowSum[0];
        for(int i =0;i<rowSum.length;i++){
            if(max<rowSum[i]){
                max = rowSum[i];
            }
            if(min>rowSum[i]){
                min = rowSum[i];
            }
        }
        System.out.println("Largest sum of row is : " + max + " and Minimum is : " + min);
    }

    public static void smallestEle(int a[][]){
        int min = a[0][0];
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                if(min>a[i][j]){
                    min = a[i][j];
                }
            }
        }
        System.out.println("The Smallest Element in Array is : " + min);
    }

    public static void frequencyEle(int a[][], int ele){
        int count = 0;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                if(ele==a[i][j]){
                    count++;
                }
            }
        }
        System.out.println("The Frequenct of " + ele + " is : " + count);
    }   

    public static void maxMinEle(int a[][]){
        for(int i =0;i<a.length;i++){
            int max = a[i][0];
            int min = a[i][0];
            for(int j =0;j<a.length;j++){
                if(max<a[i][j]){
                    max = a[i][j];
                }
                if(min>a[i][j]){
                    min = a[i][j];
                }
            }
            System.out.println("The maximum element of row " + (i+1) + " is : " + max);
            System.out.println("The minimum element of row " + (i+1) + " is : " + min);

        }
    } 

    public static void minEleCol(int a[][]){
        for(int i=0;i<a.length;i++){
            int min = a[0][i];
            for(int j =0;j<a[i].length;j++){
                if(min>a[j][i]){
                    min = a[j][i];
                }
            }
            System.out.println("The Minimum element of column is  : " + min);
        }
    }
    public static void sumBorder(int a[][]){
        int sum=0;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                if(i==0 || j==0 || j==a[i].length-1 || i==a.length-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The of border is : " + sum);
    }

    public static void averageEle(int a[][]){
        int avg;
        int sum = 0;
        int totalEle = a.length * a[0].length;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        avg =sum/totalEle;
        System.out.println(totalEle);
        System.out.println("The Avrage of Array is : " + avg);
    }

    public static void largestEleCol(int a[][]){
        int max;
        for(int i = 0;i<a[0].length;i++){
            max = a[0][i];
            for(int j =0;j<a.length;j++){
                if(max<a[j][i]){
                    max = a[j][i];
                }
                
            }
            System.out.println("The max in column is : " + max);
        }
    }
    public static void targetFound(int a[][], int target){
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                if(a[i][j]==target){
                    System.out.println("Target found at : " + i + " " + j + " indices");
                }
            }
        }
    }
    public static void pallindromeCheck(int a[]){
        int left =0;
        int right = a.length-1;
        boolean isPali = false;
        while(left<right){
            if(a[left] != a[right]){
                isPali = true;
            }
            left++;
            right--;
        }
        if(isPali==true){
            System.out.println("Given array is not palindrome");
        } else {
            System.out.println("Given number is palindrome");
        }
    }
    public static void generateSpiralMatrix2(int n){
        int a[][]= new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right= n-1;
        int num =1;
        while(num<=n*n){
            for(int i =left;i<=right;i++){
                a[top][i]=num++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                a[i][right]=num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                a[bottom][i]=num++;
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
                a[i][left] = num++;
            }
            left++;
        }
        printArray(a);
    }
    public static void generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];  // Create an empty n x n matrix
        int num = 1; // Start filling from 1
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            // Move Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // Move down to next row

            // Move Down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Move left to next column

            // Move Left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--; // Move up to next row

            // Move Up
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++; // Move right to next column
        }

        // Print the matrix
        printArray(matrix);
    }

    public static void sumNatural(int n){
        int sum = 0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum-=i;
            }else {
                sum+=i;
            }
        }
        System.out.println("The Result : " + sum);
    }
    public static void main(String [] args){
        /*Q1
                        1: Sum of Elements in 2D Array
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                sum =>45    */


                int a[][] =  {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
                ArraySum(a);


        /*Q2    2) Finding Maximum Element
                            {12, 45, 67},
                            {23, 9, 13},
                            {56, 34, 21}

                67 is max */
                System.out.println("-------------------------------------------------------");
                int b[][] ={{12, 45, 67},
                            {23, 9, 13},
                            {56, 34, 21}};

                findMax(b);

        /*  Q3  3)Transpose of a Matrix :avoid  */
                System.out.println("-------------------------------------------------------");
                int c[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
                Transpose(c,a.length,a[0].length);
                System.out.println("-------------------------------------------------------");
                TransposeWithoutNewArray(c);


        /*  Q4 Calculate the sum of each row in a 2D array.
            {1, 2, 3}=6
            {4, 5, 6}=15
            {7, 8, 9}=24    */
                System.out.println("-------------------------------------------------------");
                int d[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
                rowSum(d);


        /*  Q5  5) Calculate the sum of each column in a 2D array.

                {1, 2, 3},=12
                {4, 5, 6},=15
                {7, 8, 9}=18*/
                System.out.println("-------------------------------------------------------");
                int e[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
                colSum(e);

        /*  Q6  6)Rotate a matrix 90 degrees clockwise.*/
                System.out.println("-------------------------------------------------------");
                int f[][] = {{1,2,3},{4,5,6},{7,8,9}};
                rotateNighty(f);


        /*  Q7  type 1:Find the largest row sum in a 2D array.
                type2:Find the smallest row sum in a 2D array.  */

                int g[][]=  {{1,2,3},{4,5,6},{7,8,9}};
                System.out.println("-------------------------------------------------------");
                LargestSmallestRowSum(g);


        /*  Q8  8)Find the smallest element in a 2D array.*/
                System.out.println("-------------------------------------------------------");
                int h[][]=  {{1,2,3},{4,5,6},{7,8,9}};
                smallestEle(h);

        /*  Q9  Find the frequency of a specific element in a 2D array.*/

                System.out.println("-------------------------------------------------------");
                int i [][] ={{1,2,3},{4,1,6},{1,8,1}}; 
                int freq = 1;
                frequencyEle(i, freq);


        /*  Q10 10)
                    type1: Find the maximum element in each row of a 2D array.
                    type2:Find the minimum element in each row of a 2D array.*/

                     int j [][] ={{14,2,3},{4,12,6},{1,8,21}};
                     System.out.println("-------------------------------------------------------");
                     maxMinEle(j);

        /*  Q11 11)Find the minimum element in each column of a 2D array.   */

                    int k[][] = {{14,2,3},{4,12,6},{1,8,21}};
                    System.out.println("-------------------------------------------------------");
                    minEleCol(k);



        /*  Q12 12)Find the sum of elements in the border of a matrix (outermost elements). */

                    int l[][] =  {{14,2,3},{4,12,6},{1,8,21}};
                    System.out.println("-------------------------------------------------------");
                    sumBorder(l);


        /*  Q13 13)Find the average of all elements in a 2D array.*/
                    System.out.println("-----------------------------------------------------");
                    int m[][] =  {{14,2,3},{4,12,6},{1,8,21}};
                    averageEle(m);


        /*  Q1414) Find the largest element in each column of a 2D array.   */

            System.out.println("-----------------------------------------------------");
            int n[][] = {{14,2,3},{4,12,6},{1,8,21}};
            largestEleCol(n);



        /*  Q16Check if a specific element exists in a row of a 2D array. */

                int p[][] = {{14,2,3},{4,12,6},{1,8,21}};
                int tar = 4;
                System.out.println("-----------------------------------------------------");
                targetFound(p, tar);
        /*  Q17 17)Find the sum of elements in the border of a matrix (outermost elements).*/

                 int q[][] = {{14,2,3},{4,12,6},{1,8,21}};
                System.out.println("-----------------------------------------------------");
                sumBorder(p);

        /*  Q18 18)check a 1D array is pallindrome or not */
                     System.out.println("-----------------------------------------------------");
                    int r[] = {1,2,3,2,1};
                    pallindromeCheck(r);


        /*  Q19 19)given a positive integer n , generate an nX n matrix filled with elements from 1 to n^2 in       spiral order ?    */
                 System.out.println("-----------------------------------------------------");
                int num = 3;
                generateSpiralMatrix(num);
                System.out.println("-----------------------------------------------------");
                generateSpiralMatrix2(num);


        /*  Q20 normal loop: 
                Given a number n. find the sum of natural numbers till n th with alterate signs. 
                10 
                (1---->10)
                1+2-3+4-5+6.....+,-     */
                System.out.println("-----------------------------------------------------");
                int num1 = 10;
                sumNatural(num1);



                




                


                
    }
}