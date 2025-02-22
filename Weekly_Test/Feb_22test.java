//Assignment - 22/02/25
import java.util.*;
import java.lang.Math;


public class Feb_22test{
    public static void printArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
    public static void largestEle(int a[]){
        int max = a[0];
                for(int i =0;i<a.length;i++){
                    if(a[i] > max){
                        max = a[i];
                    }
                }
                System.out.println("The max element in array is : " + max);
    }
    public static void oddEvenCount(int a[]){
        int odd = 0, even = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("There are " + odd + " odd numbers in array and " + even + " even numbers");
    }

    public static void twoSorted(int a[], int b[]){
        int length = a.length + b.length;
        int count = 0;
        int mergedArray[] = new int[length];
        for(int i =0;i<length;i++){
            if(i<a.length){
                mergedArray[i] = a[i];
            }
            else{
               
                    mergedArray[i] = b[count];
                    count++;
            }
        }
       Arrays.sort(mergedArray);
      System.out.println(Arrays.toString(mergedArray));
        
    }
    public static void removeDuplicate(int a[]){
        boolean dupli;
        System.out.println("All distinct elements in array : " );
        
        for(int i =0;i<a.length;i++){
            dupli = false;
            for(int j = i +1;j<a.length;j++){
                if(a[i] == a[j]){
                    dupli = true;
                }
               
            }
            if(dupli){
                continue;
            } else {
                System.out.print(a[i] + "\t");
            }
           
        }
    }

    public static void arraySum(int a[]){
        System.out.println();
        int sum = 0;
        for(int i =0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("The sum of array is : " + sum);
    }
    public static void ArrayPalindrom(int a[]){
        int left = 0;
        int right = a.length - 1;
        boolean pali = true;
        for(int i =0;i<a.length;i++){
            if(a[left] != a[right]){
                pali = false;
            }
            left++;
            right--;
            
        }
        if(pali){
            System.out.println(
                "the whole array is palindrom"
            );
        } else {
            System.out.println("No its not palindrome");
        }
    }
    public static void armstrong(int a[]){
        int rem;
        int arm;
        int temp;
        for(int i = 0;i<a.length;i++){
            rem = 0;
            temp = a[i];
            arm = 0;

            while(temp>0){
                rem = temp%10;
                arm += rem*rem*rem;
                temp = temp/10;
            }
            if(arm == a[i]){
                System.out.println("This is armstrong number in array : " + a[i]);
            }
        }
    }
    public static void zeroSort(int a[]){
        int countZero = 0;

        for(int i =0;i<a.length;i++){
                if(a[i]==0){
                    countZero++;
                } 
        }
        for(int i =0;i<a.length;i++){
            if(i<countZero){
                a[i] = 0;
        } else {
            a[i] = 1;
        }

    }

    printArray(a);
    }
    public static void neonNum(int a[]){
        int neon;
        int rem;
        int temp;
        for(int i =0;i<a.length;i++){
            neon = 0;
            rem = 0;
            temp = a[i] *a[i];
            while(temp>0){
                rem = temp%10;
                neon += rem;
                temp = temp/10;
            }
            if(neon == a[i]){
                System.out.println("This is neon number in the array : " + a[i]);
            }
        }
    }

    public static void primeArray(int a[]){
        int prime;
        int temp;
        
        for(int i =0;i<a.length;i++){
            prime=0;
            temp = a[i];
            for(int j = 1;j<Math.sqrt(temp);j++){
                if(temp%j==0){
                    prime++;
                }
            }
            if(prime==1){
                System.out.println(a[i]);
            }
            
        }
    }
  
    
    public static void main(String [] args){
        /*  Q.1 Find the largest element in an array.   */
                int a[] = {23,3,5,46,7,3,46};
                largestEle(a);

        /*  Q.2 Count the number of even and odd elements in an array.*/
                int b[] = {2,3,4,5,6,7,86,4,35,3,5,7,42};
                oddEvenCount(b);
        
        /*  Q.3 Merge two sorted arrays into one sorted array   */

                int c[] = {1,2,3,4,5,6};
                int d[] = {3,4,5,6,7};
                twoSorted(c,d);


        /*  Q.4 Remove duplicate elements from an array.    */

                int e[] = {2,4,4,5,2,4,6,3,56,3,56,2,2,2,5,5,6};
                removeDuplicate(e);

        /*  Q5  Find the sum of all elements in an array.   */

                int f[] = {1,3,34,5,65,33,6,4};
                arraySum(f);

        /*  Q6  Check if an array is a palindrome (reads the same forward and backward).    */
                int g[] = {1,2,3,2,1};
                ArrayPalindrom(g);

        /*  Q7  Find Armstrong Numbers in an Array:
                Write a Java program to find all Armstrong numbers in an array of integers. An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. */

                int h[] = {407, 153,371,243,543,532};
                armstrong(h);


        /*  Q8  Sort Zeros and Ones in an Array:
                Write a Java program to sort all the zeros and ones in a binary array (containing only 0s and 1s) such that all zeros appear first followed by all ones.    */
                int i[] = {1,0,0,1,1,0,0,1,0,1,1,0};
                zeroSort(i);

        
        /*  Q9  Find Neon Numbers in an Array:
                Write a Java program to find all Neon numbers in an array. A Neon number is a number where the sum of the digits of the square of the number is equal to the number itself. */

                int j[] = {9,1,0,3,6,4,3,55};
                neonNum(j);


        /*  Q10 Find Prime Numbers in a 1D Array and Sort Them:
                Write a Java program to find all prime numbers in a 1D array and return them sorted in ascending order.*/

                int p[] = {3,2,7,17,64,3,87,5,10,45};
                primeArray(p);
            
                
                

    }
}