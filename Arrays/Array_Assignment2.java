//Assignment - 11/02/25
import java.util.*;
import java.lang.Math;
public class Array_Assignment2{
    public static void armstrong(int a){
        int rem;
        int arm = 0;
        int temp = a;
        while(a>0){
            rem = a%10;
            arm += rem*rem*rem;
            a = a/10;
        }
        if(temp == arm){
            System.out.println("Given Number is Armstrong");
        } else {
            System.out.println("Its not armstrong number");
        }
    }
    static void printArray(int a[]){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
      public static int sum(int a[]){
                    int sum1 = 0;
                    for(int i =0;i<a.length;i++){
                        sum1 += a[i];
                    }
                    return sum1;
                    
                }

    public static int printMax(int a[]){
        int max = a[0];
        for(int i =0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.println("The Max element is : " + max);
        return max;
    }
    
    public static void printMin(int a[]){
        int min = a[0];
        for(int i =0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println("The Max element is : " + min);
    }
    public static void pCheck(int a){
        int prime = 0;
        for(int i =1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                prime++;
            }
        }
        if(prime==1){
            System.out.println("Number is prime");
        } else {
            System.out.println("Its not prime");
        }
    }
    public static void main(String [] args){

        /*Q.1 user input 
                string :five name input 
                count total */

                Scanner sc = new Scanner(System.in);
                // System.out.println("Enter size of array : ");
                // int size = sc.nextInt();
                // String [] str = new String[size];
                // sc.nextLine();
                // for(int i =0;i<str.length;i++){
                //     System.out.println("Enter Element : ");
                //     str[i] = sc.nextLine();
                // }
                // int count = 0;
                // for(int i = 0;i<str.length;i++){
                    
                //     count++;
                // }
                // System.out.println(count);


        /*  Q.2 user input :characters 
                total vowel count */
                // System.out.println("Enter Size of Array : ");
                // int size = sc.nextInt();
                // sc.nextLine();
                // int count =0;

                // char[] ch = new char[size];
                // for(int i =0;i<ch.length;i++){
                //     System.out.println("Enter character as element : ");
                //     ch[i] = sc.next().charAt(0);
                // }
                // for(int i = 0;i<ch.length;i++){
                //     if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                //         count++;
                //     }
                // }
                // System.out.println("Total Vowel count is : " + count);


        /*  Q3  user input character :
                total count vowel 
                total count consoant 

                which one is maximum :vowel and consonant    */

                // System.out.println("Enter Size of Array : ");
                // int size = sc.nextInt();
                // char [] ch = new char[size];

                // int countVowel = 0;
                // int countCon = 0;
                // for(int i =0;i<ch.length;i++){
                //     System.out.println("Enter Char: ");
                //     ch[i] = sc.next().charAt(0);
                //     if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                //         countVowel++;
                //     } else {
                //         countCon++;
                //     }
                // }
                // System.out.println("Total vowel : " + countVowel + " and total consonet : " + countCon);


        /*  Q4  string :10 input :fruits name 
                count :apple how much   */

                String []str = {"apple", "banana" , "Apple", "orange", "grapes", "apple", "Strawberry", "Mango", "apple"};
                int count = 0;
                for(int i =0;i<str.length;i++){
                    if(str[i].equalsIgnoreCase("apple")){
                        count++;
                    }
                }
                System.out.println(count);


        /*  Q5  a[]=1,2,3,4,5
                b[]=1,2,3,4,5
                sum two array */

                    int a[] = {1,2,3,4,5};
                    int b[] = {1,2,3,4,5};
                    int sum =0;
                    for(int i =0;i<a.length;i++){
                        sum += a[i] + b[i];
                    }
                    System.out.println(sum);
                    System.out.println("-----------------------------------------------------------");

        /*  Q5  5 array :print through method user define */
                    int arr[] = {13,23,3,4,55};
                    printArray(arr);
                    int arr2[] = {2,4,4,46,7,46};
                    printArray(arr2);
                    int arr3[] = {5,7,78,5,45};
                    printArray(arr3);
                    int arr4[] = {43,6,8,79,5};
                    printArray(arr4);
                    int arr5[] = {1,2,3,4,5};
                    printArray(arr5);
                System.out.println("-----------------------------------------------------------");

        /*  Q6  1,2,3,4,5,6,7,8,9,10 array :

                first element swap with the last element */

                    int a1[] = {1,2,3,4,5,6,7,8,9,10};
                    int temp = a1[0];
                    a1[0] = a1[a1.length-1];
                    a1[a1.length-1] = temp;
                    for(int i =0;i<a1.length;i++){
                        System.out.println(a1[i]); 
                    }
                    System.out.println("-----------------------------------------------------------");

        /*  Q7  first element mid swap and mid +1 last swap in array */

                int a2[] = {1,2,3,4,5,6,7,8};
                int mid2 = ((a2.length)/2)-1;
                int temp2 = a2[mid2];
                a2[mid2] = a2[0];
                a2[0] = temp2;
                int temp3 = a2[mid2+1];
                a2[mid2+1] = a2[a2.length-1];
                a2[a2.length-1] = temp3;
                
                for(int i =0;i<a2.length;i++){
                    System.out.println(a2[i]);
                }
                System.out.println("-----------------------------------------------------------");

        /*  Q8  array create :odd index element print */
                int arr10[] = {2,3,545,46,5686,96794,845,45};
                for(int i =0;i<arr10.length;i++){
                    if(i%2!=0){
                        System.out.println(arr10[i]);
                    }
                }
                System.out.println("-----------------------------------------------------------");

        /*  Q9  array create :first even and last even element */
                int array1[] = {2,4,6,3,6,8,16,27};
                int firstEven = -1;
                int lastEven = -1;
                for(int i = 0;i<array1.length;i++){
                    if(array1[i]%2==0){
                        if(firstEven==-1){
                            firstEven = array1[i];
                        }
                        lastEven = array1[i];

                    }
                }
                System.out.println("Fist Even : " + firstEven + " and last Even : " + lastEven);

                 System.out.println("-----------------------------------------------------------");

        /*  Q10 array create :first even index swap last even index k sath */
               
               int firstEvenIndex = 2;
               int lastEvenIndex = (array1.length-1)%2==0 ? (array1.length-1) : (array1.length-2);
               array1[firstEvenIndex] = array1[firstEvenIndex] ^ array1[lastEvenIndex];
               array1[lastEvenIndex] = array1[firstEvenIndex] ^ array1[lastEvenIndex];
               array1[firstEvenIndex] = array1[firstEvenIndex] ^ array1[lastEvenIndex];
               for(int i =0;i<array1.length;i++){
                System.out.println(array1[i]);
               }
                System.out.println("-----------------------------------------------------------");


        /*  Q11 array create :1,2,3,4,5,6,7,8,9,10 
            target : find out */

                int arr21[] = {1,2,3,4,5,6,7,8,9,10};
                int target = 3;
                for(int i =0;i<arr21.length;i++){
                    if(arr21[i] == target){
                        System.out.println("Target found at index number " + i);
                    }
                }
                System.out.println("-----------------------------------------------------------");

        /*  Q12 array :duplicate element stored :1,2,3,2,1,4,6,3,2,4 
                    target :check duplicate element how much and which index 
                        */

        //                     int arr22[] = {1, 2, 3, 2, 1, 4, 6, 3, 2, 4};
        //                     boolean [] checked = new boolean[arr22.length];
        //                     int dupi=0;
                            
        //                     for(int i = 0;i<arr22.length;i++){
        //                         if(!checked[i]){
        //                             String indices = i + "";
        //                             boolean found = false;
        //                             checked[i] = true;
                                   
                                    
        //                             for(int j = i+1;j<arr22.length;j++){
        //                                 if(arr22[i]== arr22[j]){
        //                                     indices += ", " + j;
        //                                     found = true;
        //                                     checked[j] = true;
        //                                 }
                                        
        //                             }
        //                             if(found==true){
        //                                 System.out.println("Duplicate element found at index : " + indices);
        //                                 dupi++;
        //                             }
        //                         }
        //                     }
        //                     System.out.println("Total Duplicate element : " + dupi);


        // /*  Q13 array :user input 
        //         target check present :
        //                     check Armstrong number*/

                        
                       
        //                 System.out.println("Enter size of an Array : ");
        //                 int size = sc.nextInt();
        //                 int []arr23 = new int[size];
        //                 for(int i =0;i<arr23.length;i++){
        //                     System.out.println("Enter Element in array : ");
        //                     arr23[i] = sc.nextInt();
        //                 }
        //                 System.out.println("Enter number to check if that number is in array and then if it is aram strong number : ");
        //                 int target1 = sc.nextInt();
        //                 for(int i =0;i<arr23.length;i++){
        //                     if(target1==arr23[i]){
        //                         armstrong(arr23[i]);
        //                     }
                          
        //                 }

        /*  Q14 a[]=>5 element (sum)
                b[] =>5 element (sum)

                which maximum :a and b 
                which minimum :a and b */

                int []arr24 = {1,3,4,7,6,4,6,3,67,2};
                int []arr25 = {2,56,7,4,32,2,5,45,45,6,8,3};
                int sum1 = sum(arr24);
                int sum2 = sum(arr25);
                if(sum1>sum2){
                    System.out.println("first array sum is max " + sum1);
                } else if(sum1==sum2){
                    System.out.println("Both are equal : " + sum1 + sum2);
                } else {
                    System.out.println("Second array sum is max " + sum2);
                }


        /*  Q15 user input :
            array :1,2,3,5,4 :maximum element find */

            // System.out.println("Enter Size of array : ");
            // int size = sc.nextInt();
            // int [] arr26 = new int[size];
            // for(int i =0;i<arr26.length;i++){
            //     System.out.println("Enter Element : ");
            //     arr26[i] = sc.nextInt();

            // }
            // printMax(arr26);


        /*  Q16 user input :
            array :1,2,3,5,4 :minimum element find */
            // System.out.println("Enter Size of array : ");
            // int size = sc.nextInt();
            // int [] arr26 = new int[size];
            // for(int i =0;i<arr26.length;i++){
            //     System.out.println("Enter Element : ");
            //     arr26[i] = sc.nextInt();

            // }
            // printMin(arr26);


        /*  Q17 user input :
                array :user value :maximum element find 
                ->prime number check */

            System.out.println("Enter Size of array : ");
            int size = sc.nextInt();
            int [] arr26 = new int[size];
            for(int i =0;i<arr26.length;i++){
                System.out.println("Enter Element : ");
                arr26[i] = sc.nextInt();

            }
            int primeCheck = printMax(arr26);
            pCheck(primeCheck);
            


              


                
                                



                





    }
}