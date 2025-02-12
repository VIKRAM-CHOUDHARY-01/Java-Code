//Assignment - 10/01/25

    

        public class Array_Assignment{
            public static void main(String [] args){
                /* Q.1  12,67,46,435,67,385,335,335,34  length*/
                        int a[] = {12,67,46,435,67,385,335,34};
                        System.out.println("The lenght of array is : " + a.length);

                        System.out.println("--------------------------------------------------------");


                /*  Q.2 char :
                        String :five names 
                        float type :    */
                            char []c = {'a','b','c'};
                            for(int i =0;i<c.length;i++){
                                System.out.println(c[i] + "\t");
                            }
                            System.out.println("--------------------------------------------------------");

                            String []s = {"Vikram", "Ronak", "Ashutosh", "Jeetu", "Suraj"};
                            for(int i=0;i<s.length;i++){
                                System.out.println(s[i] + "\t");
                            }

                            System.out.println("--------------------------------------------------------");

                            float []f = {2.4f,6.78f, 97.57f};
                            for(int i=0;i<f.length;i++){
                                System.out.println(f[i] + "\t");
                            }
                            System.out.println("--------------------------------------------------------");


                /*  Q.3 12,67,46,435,67,385,335,335,34

                    forward direction   */

                            int arr[] = {12,67,46,435,67,385,335,335,34};
                            for(int i =0;i<arr.length;i++){
                                System.out.println(arr[i]);
                            }
                            System.out.println("--------------------------------------------------------");

                /*  Q4 12,67,46,435,67,385,335,335,34

                    backward direction */

                            int []arr1 = {12,67,46,435,67,385,335,335,34};
                            for(int i = (arr1.length)-1; i>=0;i--){
                                System.out.println(arr1[i]);
                            }
                             System.out.println("--------------------------------------------------------");
                            

                /*  Q5  12,67,46,435,67,385,335,335,34

                    find mid element     */
                            int arr3[] = {12,67,46,435,67,385,335,335,34,3};
                            int n = arr3.length;
                            if(n%2==0){
                                int mid1 = n/2-1;
                                int mid2 = n/2;
                                System.out.println("There are two middle elements : " + arr3[mid1] + " and " + arr3[mid2]);
                            } else {
                                int mid = n/2;
                                System.out.println("The middle element is : " + arr3[mid]);
                            }
                         System.out.println("--------------------------------------------------------");

                /*  Q6  12,67,46,435,67,385,335,335,34

                    first element and last element find */

                            int []arr4 = {12,67,46,435,67,385,335,335,34};
                            System.out.println("First Element is : " + arr4[0] + " the last element is : " + arr4[arr4.length-1]);

                            System.out.println("--------------------------------------------------------");

                /*  Q7  12,67,46,435,67,385,33,335,34,23

                        output:
                        12,67,46,435,67,23,34,335,33,385    */

                            int arr5[] = {12,67,46,435,67,385,33,335,34,23};
                            for(int i =0;i<arr5.length/2;i++){
                                System.out.println(arr5[i]);
                            }
                            for(int i = arr5.length-1;i>=(arr5.length/2);i--){
                                System.out.println(arr5[i]);
                            }
                            System.out.println("--------------------------------------------------------");

                /*  Q8  12,67,46,435,607,385,33,335,34,23

                        output:
                        607,435,46,67,12,385,33,335,34,23   */

                            int arr6[] = {12,67,46,435,607,385,33,335,34,23};
                            for(int i = ((arr6.length -1)/2);i>=0; i--){
                                System.out.println(arr6[i]);
                            } 
                            for(int i = ((arr6.length)/2); i<arr6.length;i++){
                                System.out.println(arr6[i]);
                            }
                            System.out.println("--------------------------------------------------------");

                /*  Q9  12,67,46,435,607,385,33,335,34,23

                        output:
                        607,435,46,67,12,23,34,335,33,385   */

                            int []arr7 = {12,67,46,435,607,385,33,335,34,23};
                            for(int i = (arr7.length/2)-1;i>=0;i--){
                                System.out.println(arr7[i]);
                            }
                            for(int i = arr7.length-1; i>=(arr7.length/2);i--){
                                System.out.println(arr7[i]);
                            }
                             System.out.println("--------------------------------------------------------");


                /*  Q10 1,2,3,4,5,6,7,8,9,10 :
                        even number */

                            int []arr8 = {1,2,3,4,5,6,7,8,9,10};
                            for(int i =0;i<arr8.length;i++){
                                if(arr8[i]%2==0){
                                    System.out.println(arr8[i]);
                                }
                            }
                            System.out.println("--------------------------------------------------------");

                /*  Q11 1,2,3,4,5,6,7,8,9,10 :
                    odd number */

                         int []arr9 = {1,2,3,4,5,6,7,8,9,10};
                            for(int i =0;i<arr9.length;i++){
                                if(arr8[i]%2!=0){
                                    System.out.println(arr9[i]);
                                }
                            }
                              System.out.println("--------------------------------------------------------");

                /*  Q12 1,2,3,4,5,6,7,8,9,10 :

                    output :
                    1,2,3,4,5,6,8,10    */

                        int []arr10 = {1,2,3,4,5,6,8,10};
                        for(int i =0;i<arr10.length;i++){
                            if(arr10[i]==7){
                                continue;
                            }
                            System.out.println(arr10[i]);
                        }
                        System.out.println("--------------------------------------------------------");


                /*  Q13 1,2,3,4,5,6,7,8,9,10 :

                    output :
                    2,4,7,9*/

                        int []arr11 = {1,2,3,4,5,6,7,8,9,10};

                       for(int i =0;i<arr11.length;i++){
                        if(i<arr11.length/2){
                             if(arr11[i]%2==0){
                            System.out.println(arr11[i]);
                        }
                        } else if(i>=arr11.length/2){
                            if(arr11[i]%2!=0){
                                System.out.println(arr11[i]);
                            }
                        }
                        }
                       
                       
                        
                       
                        System.out.println("--------------------------------------------------------");

                /*  Q14
                            1,2,3,4,5,6,7,8,9,10 :

                            output :
                            9,7,4,2
                         */

                        int []arr12 = {1,2,3,4,5,6,7,8,9,10};
                        for(int i = arr12.length-1;i>=0;i--){
                            if(i<arr12.length/2){
                                if(arr12[i]%2==0){
                                      System.out.println(arr12[i]);

                                }
                              
                            } else if(i>=arr12.length/2){
                                if(arr12[i]%2!=0){
                                    System.out.println(arr12[i]);
                                }
                            }
                        }
                        System.out.println("--------------------------------------------------------");

                /*  Q15 1,2,3,4,5,6,7,8,9,10 :

                        every element table print   */

                        int []arr13 = {1,2,3,4,5,6,7,8,9,10};
                        for(int i =0;i<arr13.length;i++){
                            for(int j =1;j<=10;j++){
                                System.out.print(arr13[i]*j + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println("--------------------------------------------------------");

                /*  Q16 123,567,453,678 ,876

                    every element reverse 
                    123 -->321 
                    567 --->765 */

                        int []arr14 = {123,567,453,678 ,876};
                        for(int i =0;i<arr14.length;i++){
                            int rem=0;
                            int temp = arr14[i];
                            int res = 0;
                            while(temp>0){
                                rem = temp % 10;
                                res = (rem) + res*10;
                                temp = temp/10;
                            }
                            System.out.println(res);

                        }
                         System.out.println("--------------------------------------------------------");

                /*  Q17 array :
                            palindrome 

                            Armstrong find 

                            neon find */

                            int arr15[] = {3,5,4,6,111,151,153,81,9,5};
                            for(int i =0;i<arr15.length;i++){
                                int rem1=0;
                                int pali = 0;
                                int temp1 = arr15[i];
                                while(temp1>0){
                                    rem1 = temp1 % 10;
                                    pali = (rem1) + pali*10;
                                    temp1 = temp1/10;
                                }
                                if(arr15[i]==pali){
                                    System.out.println("Its a Palindrom : " + arr15[i]);
                                }

                                int arm = 0;
                                int rem2 = 0;
                                int temp2 = arr15[i];
                                while(temp2>0){
                                    rem2 = temp2%10;
                                    arm = (rem2 * rem2 * rem2) + arm;
                                    temp2 = temp2/10;
                                }
                                if(arr15[i]==arm){
                                    System.out.println("Its a Armstrong Number : " + arr15[i]);
                                }

                                int neon = 0;
                                int temp3 = arr15[i]*arr15[i];
                                int rem3 = 0;
                                while(temp3>0){
                                    rem3 = temp3 % 10;
                                    neon = rem3 + neon;
                                    temp3 = temp3/10;
                                }
                                if(neon == arr15[i]){
                                    System.out.println("Its a Neon Number : " + arr15[i]);
                                }
                            }

                             System.out.println("--------------------------------------------------------");


                /*  Q18 123,567,453,678 ,876

                        every element k digit ka sum :123=>6 
                        even number */

                            int [] arr16 = {123,567,453,678,876};
                            
                            for(int i =0;i<arr16.length;i++){
                                int rem4 = 0;
                                int temp5 = arr16[i];
                                int sum1 = 0;
                                while(temp5>0){
                                    rem4 = temp5 % 10;
                                    sum1 = rem4 + sum1;
                                    temp5 = temp5/10;
                                }
                                if(sum1%2==0){
                                    System.out.println("Even is : " + arr16[i]);
                                }
                            }
                             System.out.println("--------------------------------------------------------");

                /*  Q19 array :character type :check vowel */

                            char [] ch = {'f','e', 'i','o','j','u','x','a'};
                            for(int i =0;i<ch.length;i++){
                                if(ch[i]=='a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i]=='u'){
                                    System.out.println(ch[i]);
                                }
                            }
                             System.out.println("--------------------------------------------------------");

                /*  Q20 array :character type :check consonant */

                        char [] ch1 = {'a','b','c','d','e','i','z'};
                        for(int i =0;i<ch1.length;i++){
                            if(ch1[i]!='a' && ch1[i] != 'e' && ch1[i] != 'i' && ch1[i] != 'o' && ch1[i]!='u'){
                                System.out.println(ch1[i]);
                            }
                        }
                         System.out.println("--------------------------------------------------------");


                /*  Q21 123,8675,6434,7657,8766 

                    every element k andr se even digit :
                        123 :2 
                        8675 :86    */

                            int []arr17 = {123,8675,6434,7657,8766};
                            for(int i =0;i<arr17.length;i++){
                                int rem4 = 0;
                                int digit = 0;
                                int tempp = arr17[i];
                                while(tempp>0){
                                    rem4 = tempp%10;
                                    digit = rem4;
                                    if(digit%2==0){
                                        System.out.println("The element " + arr17[i] + " has this even number : " + digit);
                                    }
                                    tempp = tempp/10;
                                }
                            }
                            System.out.println("--------------------------------------------------------");


                /*  Q22 123,8675,6434,7657,8766 

                    every element k andr se odd digit ka sum:
                        check even number 

                    123 :odd digit :1+3 =>4 print 4 

                    8675 :odd digit :7+5 =>12 print 12  */

                        int arr18[] = {123,8675,6434,7657,8766};
                        for(int i =0;i<arr18.length;i++){
                            int temp6 = arr18[i];
                            int rem5 = 0;
                            int dig = 0;
                            int summ = 0;
                            while(temp6>0){
                                rem5 = temp6%10;
                                dig = rem5;
                                if(dig%2!=0){
                                    summ +=dig;
                                }
                                temp6 = temp6/10;
                            }
                            System.out.println("Sum of all odd even digit of element : " + summ);
                        }
                                        









            }
        }  