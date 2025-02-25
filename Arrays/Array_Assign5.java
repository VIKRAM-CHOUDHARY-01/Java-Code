//Assignment - 5 -> 18/02/25
import java.util.Arrays;
public class Array_Assign5{
    public static void printArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
    /* Q.2 array : 
        first_index and second_index 

        first_index swap second_index 

        first_index:3 
        second_index:5 

        3 swap 5 k sath 

        input :1,2,3,4,5,6,7,8,9,10

        output :1,2,3,6,5,4,8,9,10  */

        public static int[] swap(int [] a, int first_index, int second_index){
             a[first_index] = a[first_index] ^ a[second_index];
             a[second_index] = a[first_index] ^ a[second_index];
             a[first_index] = a[first_index] ^ a[second_index];
             return a;

        }


        public static void twoPointerSort(int a[]){
            int left = 0;
            int right = a.length-1;
            for(int i =0;i<a.length;i++){
                if(left<right){
                     if(a[left]==0){
                left++;
               }
               if(a[right]==1){
                right--;
               }
               if(a[right] ==0 && a[left]==1){
                swap(a,left, right);
                left++;
                right--;
               }
                }
              
            }
            printArray(a);
        }
    
        /* Q.4  input :0,1,0,2,0,2,1,0,1,2 
            output :0,0,0,0,1,1,1,2,2,2     */

            public static void twoPointerSort1(int a[]){
               
                for(int i =0;i<a.length;i++){
                    for(int j =i+1;j<a.length;j++){
                        if(a[i]>a[j]){
                            swap(a,i,j);
                        }
                    }
                }
                printArray(a);
            }


            public static void rotateRightArray(int a[], int k){
                int n =a.length;
                reverse(a,0, n-1);
                reverse(a,0, k-1);
                reverse(a, k, n-1);
                printArray(a);
            }

            public static void reverse(int a[], int start, int end){
                while(start<end){
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    start++;
                    end--;
                }
            }

            public static void leftRotateArray(int a[], int n){
                int last = a.length-1;
                reverse1(a, 0, last);
                reverse1(a,0,last-n);
                reverse1(a,last-n+1,last);
                printArray(a);
            }
            public static void reverse1(int a[], int start, int end){
                while(start<end){
                    int temp  = a[start];
                    a[start] = a[end];
                    a[end]= temp;
                    start++;
                    end--;
                }
            }

            public static void sumArr(int a[]){
                int count = 0;
                for(int i =1;i<a.length;i++){
                   a[i] += a[i-1];
                   
                }
                printArray(a);
            }

            public static void definedSum(int a[], int first, int last){
                int sum = 0;
                for(int i =first;i<=last;i++){
                    sum+=a[i];
                }
                System.out.println(sum);
            }
        
    public static void main(String [] args){
         /* Q1) array : 
        sort :through method    */
                int a[] = {2,4,63,12,1,2,32,3,5,7,53,3,2};
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));

                System.out.println("--------------------------------------------------");
                int b[] = {1,2,3,4,5,6,7,8,9,10};
                int first_index = 3;
                int second_index = 5;
                System.out.println(Arrays.toString(swap(b, first_index, second_index)));
                   System.out.println("--------------------------------------------------");

                /* Q3) 1 0 0 1 0 1 0 1 

                        sort :two pointer variable :
                        ->dry run   */

                    int c[] = {1, 0, 0, 1, 0, 1, 0, 1};
                    twoPointerSort(c);
                     System.out.println("--------------------------------------------------");
                    int d[] = {0,1,0,2,0,2,1,0,1,2};
                    twoPointerSort1(d);


                    /*  Q5  user input :1,2,3,4,5,6,7,8,9,10 

                            input :3 

                            output :
                            description[
                            first move :10,1,2,3,4,5,6,7,8,9
                            second move :9,10,1,2,3,4,5,6,7,8
                            third move :8,9,10,1,2,3,4,5,6,7 
                            ]

                            final output :8,9,10,1,2,3,4,5,6,7  */
                            System.out.println("--------------------------------------------------");
                            int e[] = {1,2,3,4,5,6,7,8,9,10};
                            int in = 1;
                            rotateRightArray(e, in);


                    /*  Q.6
                    user input :1,2,3,4,5,6,7,8,9,10 

                    input :3 

                    output :
                    description[
                    first move :2,3,4,5,6,7,8,9,10,1
                    second move :3,4,5,6,7,8,9,10,1,2
                    third move :4,5,6,7,8,9,10,1,2,3
                    ]

                    final output :4,5,6,7,8,9,10,1,2,3      */
                    System.out.println("--------------------------------------------------");
                    int f[] = {1,2,3,4,5,6,7,8,9,10};
                    int n= 3;
                    leftRotateArray(f,n);


                    /*  Q7
                    
                    1,2,3,4,5 

                    1,3,6,10,15 

                    description[
                    1 
                    3 =>1+2 
                    6 :1+2+3 
                    10=1+2+3+4 
                    15=1+2+3+4+5 ]  */
                        System.out.println("--------------------------------------------------");
                        int g[] = {1,2,3,4,5};
                        sumArr(g);


                    /*  Q8
                                                q)
                            1,2,3,4,5,6,7,8,9,10 

                            starting index :3
                            ending index :8 

                            3 ----8 sum     */


                            int h[] = {1,2,3,4,5,6,7,8,9,10};
                            int first1 = 3;
                            int last2 = 8;
                            definedSum(a, first1, last2);



                


        
            
        
    }
}