import java.util.*;
public class basicLoopAssignment2{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     //Assignment (2) - 13/12/24
            //1) while : 
                // reverse number 
                // 657
                // 756 

        System.out.println("Enter Number to reverse it : ");
        int num = sc.nextInt();
        int rem;
        int rev=0;
        while(num>0){
            rem = num%10;
            rev = (rev*10) + rem;
            num = num/10;
        }
        System.out.println("The Reversed Number : " + rev);

            //2) pallindrome number 
        System.out.println("Enter Number to check if its palindrome : ");
        int num1 = sc.nextInt();
        int rem1;
        int rev1=0;
        int temp = num1;
        while(num1>0){
            rem1 = num1%10;
            rev1 = (rev1*10) + rem1;
            num1 = num1/10;
        }
        if(temp==rev1){
            System.out.println("It's a Palindrome Number");
        } else {
            System.out.println("It's not a Palindrome");
        }

            //3)armstrong number - 153
            System.out.println("Enter Number to check if it's Armstrong Number : ");
            int num3 = sc.nextInt();
            int numOfDigits = String.valueOf(num3).length();
            int rem3;
            int arm = 0;
            int temp2 = num3;
            while(num3 > 0) {
                rem3 = num3 % 10;
                arm += Math.pow(rem3, numOfDigits);
                num3 /= 10;
            }
            if(temp2 == arm) {
                System.out.println("It's an Armstrong Number");
            } else {
                System.out.println("It's not an Armstrong Number");
            }
            //neon number 
                // 9 ka square 
                // 81 => 8+1=(9) 
            System.out.println("Enter Number to check if its a Neon number : ");
            int num4 = sc.nextInt();
            int rem4;
            int neo = 0;
            int neon = num4;
            int sd= num4*num4;
            while(sd>0){
                rem4 = sd%10;
                neo = neo + rem4;
                sd = sd/10;
            }
            if(neon==neo){
                System.out.println("It's a Neon Number");
            } else {
                System.out.println("It's not a Neon Number");
            }

            //prime number
                // a)check number prime 
                // b)1--->100 prime number 

                System.out.println("Enter Number to check if it's prime number : ");
                int num5 = sc.nextInt();
                int count = 0;
                for(int i = 1;i<=num5;i++){
                    if(num5%i==0){
                        count++;
                    }
                }

                if(count==2){
                    System.out.println("Its a Prime Number");
                } else {
                    System.out.println("It's not a Prime Number");
                }

                int count1;
                for(int j=2;j<=100;j++){
                    count1=0;
                    for(int k = 1;k<=j;k++){
                        if(j%k==0){
                            count1++;
                        }
                    }
                    if(count1==2){
                        System.out.println(j);
                    }
                }

            //factorial
            System.out.println("Enter a number to get it's factorial : ");
            int num6 = sc.nextInt();
            if(num6 < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            }  else {
            int fact = 1;
            for(int i = 1;i<=num6;i++){
                fact*=i;
            }
            System.out.println("The Factorial : " + fact);
            }

            //fibonacci series
            int a1 = 0;
            int a2 = 1;
            int a3;
            System.out.println(a1);
            System.out.println(a2);
            for(int i =1; i<=5;i++){
                a3 = a1 +a2;
                System.out.println(a3);
                a1 = a2;
                a2 = a3;
            }

            //use input :6743 =>4 digit
            System.out.println("Enter Number to get it's digit : ");
            int num7 = sc.nextInt();
            int digit=0;
            while(num7>0){
                num7=num7/10;
                digit++;
            }
            System.out.println("Total digit are : " + digit);

            // even number 
                // type1 : 1-->100 
                for(int i= 1;i<=100;i++){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
                // type2 : 1--->100 even number ka sum
                int sum3=0; 
                  for(int i= 1;i<=100;i++){
                    if(i%2==0){
                       sum3+=i;
                    }
                }
                System.out.println("1--->100 even number ka sum : "+ sum3);

                // type3 : random value 34--->89 =>even number 
                System.out.println("Enter first range : ");
                int num8 = sc.nextInt();
                System.out.println("Enter second range : ");
                int num9 = sc.nextInt();
                   for(int i= num8;i<=num9;i++){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }

                // type4 : randome value k sabi ka sum aa jaye
                System.out.println("Enter first range : ");
                int num10 = sc.nextInt();
                System.out.println("Enter second range : ");
                int num11 = sc.nextInt();
                int sum4=0;
                for(int i= num10;i<=num11;i++){
                    if(i%2==0){
                        sum4+=i;
                    }
                }
                System.out.println("randome value k sabi ka sum aa jaye : " + sum4);
            // odd number 
                    // type1: 1-->100 odd numbers 
                    for(int i= 1;i<=100;i++){
                    if(i%2!=0){
                        System.out.println(i);
                    }
                 }
                    // type2: 1--100 odd number ka sum 
                    int sum5=0; 
                    for(int i= 1;i<=100;i++){
                    if(i%2!=0){
                       sum5+=i;
                    }
                }
                    System.out.println("1--->100 odd number ka sum : "+ sum5);

                    // type3 : random value 34--->89 =>odd number 

                    System.out.println("Enter first range : ");
                    int num13 = sc.nextInt();
                    System.out.println("Enter second range : ");
                    int num14 = sc.nextInt();
                    for(int i= num13;i<=num14;i++){
                    if(i%2!=0){
                        System.out.println(i);
                    }
                }
                    // type4 : randome value k sabi ka sum aa jaye 
                    System.out.println("Enter first range : ");
                    int num15 = sc.nextInt();
                    System.out.println("Enter second range : ");
                    int num16 = sc.nextInt();
                    int sum7=0;
                    for(int i= num15;i<=num16;i++){
                    if(i%2!=0){
                        sum7+=i;
                    }
                }
                    System.out.println("randome value k sabi ka sum aa jaye : " + sum7);

            //perfect number : 
                        // 6 
                        // 1 2 3 
                        // 1 + 2 + 3 => 6 

                        // 8 
                        // 2 2 2 =>6 not perfect number
                        System.out.println("Enter Number to check if it's perfect Number : ");
                        int num20 = sc.nextInt();
                        int sum8 = 0;
                        for(int i =1;i<=num20-1;i++){
                            if(num20%i==0){
                                sum8+=i;
                            }

                        }
                        if(num20==sum8){
                            System.out.println("It's a Perfect Number");
                        } else {
                            System.out.println("It's not a Perfect Number");
                        }

            //neon number:

            System.out.println("Enter Number to check if it is neon Number : ");
            int num21 = sc.nextInt();
            int sq = num21*num21;
            int nu=0;
            int ns = num21;
            int rem7;
            while(sq>0){
                rem7 = sq%10;
                nu +=rem7;
                sq = sq/10;
            } if(nu==ns){
                System.out.println("Its a Neon Number");
            } else {
                System.out.println("Its a not Neon Number");
            }
    }
}