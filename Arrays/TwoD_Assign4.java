//Assignment 4 --> 21.02.25

public class TwoD_Assign4{
    public static void printArray(int a[][]){
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        } 
    }
    public static void oneDPrint(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
    }

    public static void rowSum(int a[][]){
        int rowArr[] = new int [a.length];
        int sum = 0;
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            rowArr[i] = sum;
        }
        oneDPrint(rowArr);
    }

    public static void colSum(int a[][]){
        int maxCol = 0;
        for(int i =0;i<a.length;i++){
            if(maxCol<a[i].length){
                maxCol = a[i].length;
            }
        }

        for(int i =0;i<maxCol;i++){
            int sum = 0;
            for(int j = 0;j<a.length;j++){
                if(i<a[j].length){
                    sum+=a[j][i];
                }
            }
            System.out.print(sum + "\t");
        }
        
    }

    public static void rowMax(int a[][]){
       
        for(int i =0;i<a.length;i++){
             int max = a[i][0];
            for(int j =0;j<a[i].length;j++){
                if(max<a[i][j]){
                    max = a[i][j];
                }
            }
            System.out.println("The max element in row is : " + max);
        }
    }
    public static void rowMin(int a[][]){
        for(int i =0;i<a.length;i++){
            int min = a[i][0];
            for(int j= 0;j<a[i].length;j++){
                if(min>a[i][j]){
                    min=a[i][j];
                }
                
            }
            System.out.println("The Minimim element in row is : " + min);
        }
    }
    public static void colMin(int a[][]){
        int maxCol=0;
        for(int i =0;i<a.length;i++){
            if(maxCol<a[i].length){
                maxCol = a[i].length;
            }
        }
        for(int i =0;i<maxCol;i++){   
           int min = Integer.MAX_VALUE;
             for(int j =0;j<a.length;j++){
                if(i<a[j].length){
                if(min>a[j][i]){
                    min = a[j][i];
                }
                }
               
            }
            System.out.println("The minimum element in column is : " + min);
           
           
            
        }
    }
    public static void colMin2(int a[][]){
        for(int i =0;i<a.length;i++){
            int min = a[0][i];
            for(int j =0;j<a[i].length;j++){
                if(min>a[j][i]){
                    min = a[j][i];
                }
            }
            System.out.println("The minimum element is : " + min);
        }
    }

    public static void colMax(int a[][]){
        int maxCol =0;
        for(int i =0;i<a.length;i++){
            if(maxCol<a[i].length){
                maxCol = a[i].length;
            }
        }

        for(int i =0;i<maxCol;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<a.length;j++){
                if(i<a[j].length){

                    if(max<a[j][i]){
                        max = a[j][i];
                    }
                }
            }
            System.out.println("The max element in array is : " + max);
        }
    }


    public static void colMax2(int a[][]){
        for(int i =0;i<a.length;i++){
            int max = a[0][i];
            for(int j = 0;j<a[i].length;j++){
                if(max<a[j][i]){
                    max = a[j][i];
                }
            }
            System.out.println("The max in column is : " + max);
        }
    }

    public static void rowAdd(int a[][]){
        int max []= new int[a.length];
        int sum;
        for(int i =0;i<a.length;i++){
            sum=0;
            for(int j = 0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            max[i] = sum;
        }
        int maxNum = max[0];
        for(int i =0;i<max.length;i++){
                if(maxNum<max[i]){
                    maxNum = max[i];
                }
        }
        System.out.println("The maximum of additions of row is : " + maxNum);
    }

    public static void colAdd(int a[][]){
        int maxCol = 0;
        for(int i =0;i<a.length;i++){
            if(maxCol<a[i].length){
                maxCol = a[i].length;
            }
        }
        int newArr []= new int[maxCol];
        int sum=0;
        for(int i =0;i<maxCol;i++){
            sum = 0;
            for(int j = 0;j<a.length;j++){
                
                if(i<a[j].length){
                    sum+=a[j][i];
                }
            }
            newArr[i] = sum;
        }
        int max = newArr[0];
        for(int i =0;i<newArr.length;i++){
            if(max<newArr[i]){
                max = newArr[i];
            }
        }
        System.out.println("The max of coloumn addition is : " + max);
    }
    public static void evenNum(int a[][]){
        int count=0;
        
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                if(a[i][j]%2==0){
                    System.out.println("The even number come at " + i +" th row and " + j + " th column and the number is : " + a[i][j]);
                    count++;
                    
                }
            }
        }
        System.out.println("Total Even Numbers are : " + count);
    }

    public static void oddNum(int a[][]){
        int maxCol = 0;
        for(int i =0;i<a.length;i++){
            if(maxCol<a[i].length){
                maxCol = a[i].length;
            }
        }
        int count=0;
        for(int i =0;i<maxCol;i++){
            for(int j = 0;j<a.length;j++){
                if(i<a[j].length){
                    if(a[j][i]%2!=0){
                        System.out.println("The even number come at " + i +" th row and " + j + " th column and the number is :" + a[j][i]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total Odd numbers are : " + count);
    }

    public static void arrayMultiplication(int a[][], int b[][], int rowA, int colA, int colB){
       
        int arr[][] = new int[rowA][colB];
        for(int i =0;i<rowA;i++){
            for(int j= 0;j<colB;j++){
                for(int k = 0;k<colA;k++){
                    arr[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printArray(arr);
    }
    public static void main(String [] args){
        /*Q1  
                    row1 :addition 
                    row2 :addition
                    row3 :addition  */
                    int a[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}};

                    rowSum(a);


        /*  Q2 )3,3
                col1 :addition 
                col2 :addition
                col3 :  */
                    System.out.println("-----------------------------------------------");
                    int b[][] = {{3,4,6},{74,3,3,5,6},{3}};
                 
                    colSum(b);

        /*  Q3
                row1 :maximum
                row2 :maximum
                row3 :maximum   */
                    System.out.println();
                    System.out.println("-----------------------------------------------");
                    int c[][] ={{3,4,6},{74,3,3,5,6},{3}};
                    rowMax(c);



        /*Q4    row1 :minimum
                row2 :minimum
                row3 :minimum   */
                    System.out.println();
                    System.out.println("-----------------------------------------------");
                    int d[][] = {{3,4,6},{74,3,3,5,6},{3}};
                    rowMin(d);


        /*Q5    col1 :minimum
                col2 :minimum
                col3 :minimum   */
                    System.out.println("-----------------------------------------------");
                    int e[][] = {{3,4,6},{74,3,3,5,6},{3}};
                    colMin(e);
                    System.out.println("-----------------------------------------------");
                    colMin2(a);


        /* Q6  
                row1 :maximum
                row2 :maximum
                row3 :maximum   */
                System.out.println("-----------------------------------------------");
                colMax(e);
                System.out.println("-----------------------------------------------");
                colMax2(a);

        
        /*Q7    
                row1 :addition 
                row2 :addition
                row3 :addition

                maximum */
                 System.out.println("-----------------------------------------------");
                 int f[][] = {{3,4,6},{74,3,3,5,6},{3}};
                 rowAdd(f);


        /*Q8    
                col1 :addition 
                col2 :addition
                col3 :addition

                maximum     */
                System.out.println("-----------------------------------------------");
                colAdd(f);

        /*Q9    row1 :even number  
                row2 :even number 
                row3 :even number 

                count :total kitne hey 
                    kon konse index pr rkhey huye hey 
                maximum 
                add 
                minimum */
                System.out.println("-----------------------------------------------");
                int g[][] = {{3,4,6},{74,3,3,5,6},{3}};
                evenNum(g);


        /*Q10   row1 :odd number  
                row2 :odd number 
                row3 :odd number 

                count :total kitne hey 
                    kon konse index pr rkhey huye hey   */

                System.out.println("-----------------------------------------------");
                oddNum(g);


        /*Q11   multiplication of 2 D array     */

                System.out.println("-----------------------------------------------");
                int x[][] = {{1,2,4},{5,7,4}, {9,7,4}};
                int y[][] = {{9,7}, {2,6},{1,5}};
                arrayMultiplication(x,y,3,3,2);
                

    }
}