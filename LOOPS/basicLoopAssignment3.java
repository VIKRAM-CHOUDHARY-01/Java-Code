 //Assignment (3) - 13/12/24
import java.util.*;
 public class basicLoopAssignment3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

    //Q.1   Write a program to print numbers from 1 to 10.

        for(int i =1;i<=10;i++){
            System.out.println(i);
        }

    //Q.2 Write a program to calculate the sum of first 10 natural number.

        int sum=0;
        for(int i = 1;i<=10;i++){
            sum+=i;
        }
        System.out.println("the sum of first 10 natural number : " + sum);

    //Q.3  Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

        System.out.println("Enter Number to get it's table : ");
        int tab = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(tab*i);
        }

    //Q.4 Write a program to find the factorial value of any number entered through the keyboard.

        System.out.println("Enter Number to get its factorial : ");
        int num = sc.nextInt();
        
        if(num>0){
            int fact = 1;
            for(int i =num;i>0;i--){
            fact *=i;
        }
        System.out.println("The factorial is : " + fact);
        }
        else {
            System.out.println("Invalid Number");
        }

    //Q.5  1--->100 number print 
            for(int i =1;i<=100;i++){
                System.out.println(i);
            }

    //Q.6   100--->1 number print 

             for(int i =100;i>=1;i--){
                System.out.println(i);
            }

    //Q.7   1--->100 even number print sum

             for(int i =1;i<=100;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }

    //Q.8   100---->1odd number print sum

                for(int i =100;i>=1;i--){
                    if(i%2!=0){
                    System.out.println(i);
                }
            }

    //Q.9 50--->1000 even number sum

            int sum1=0;
            for(int i =50;i<=1000;i++){
                if(i%2==0){
                    sum1+=i;
                }
            }
            System.out.println("The sum of even number (50 - 1000) is : " + sum1);

    //Q10  1000--->500 odd numbers sum
        
         int sum2=0;
            for(int i =1000;i>=500;i--){
                if(i%2!=0){
                    sum2+=i;
                }
            }
            System.out.println("The sum of odd number (1000 - 500) is : " + sum2);

    //Q11   table 2 to 10 

            for(int i =2;i<=10;i++){
                for(int j = 1;j<=10;j++){
                    System.out.print(i*j);
                }
                System.out.println();
            }

    //Q.12  table print between range from user input 

            System.out.println("enter range of table : ");
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();  

            if(a1>0 && b1>=a1){

            
              for(int i =a1;i<=b1;i++){
                for(int j = 1;j<=10;j++){
                    System.out.print(i*j);
                }
                System.out.println();
            }
            } else {
                System.out.println("Enter valid Range");
            }

    //Q13   1-->100 those type of numbers print (divisible by the multiple of any two numbers from user input ) 

        System.out.println("Enter number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter number : ");
        int num4 = sc.nextInt();
        int multi = num2*num4;
        System.out.println("numbers print (divisible by the multiple of any two numbers from user input): ");
        for(int i =1;i<=100;i++){

            if(i%multi == 0){
                System.out.println(i);
            }
        }

    //Q.14  1--->100 print numbers id divisible by 11 and 5 both 

            for(int i =1;i<=100;i++){
                if(i%11==0 && i%5==0){
                    System.out.println(i);
                }
            }
    //Q.15  print 2 table opposite 

            for(int i =10;i>=1;i--){
                System.out.println(2*i);
            }

    //Q16   print 2 table : 
            // like this format : 
            // 2 X 1 =2 
            // 2 X 2 =4 

            for(int i =1;i<=10;i++){
                System.out.println(2 + " X " + i + " = " + 2*i);
            }

    //Q17   write and make a program user input armstrong = then check number is armstrong and not , when user input pallindrome =check number is pallindrome or not , when user input reverse then check number is reverse or not (through user input ) (use if else if else and while loop and for loop only)

            System.out.println("Enter 'a' for armstrong, 'p' palindrome, 'r' for reverse : ");
            char ch = sc.next().charAt(0);

            if(ch == 'a'){
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
            } else if(ch=='p'){
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
            }
            else if(ch=='r'){
                 System.out.println("Enter Number to reverse it : ");
        int num_1 = sc.nextInt();
        int rem;
        int rev=0;
        while(num_1>0){
            rem = num_1%10;
            rev = (rev*10) + rem;
            num_1 = num_1/10;
        }
            System.out.println("The Reversed Number : " + rev);

            } else {
                System.out.println("Invalid Option");
            }

    //Q18   write and make a program user input any number and user input like factorial then calculate a factorial of code and user input a string like reverse then calculate a reverse number only.

            System.out.println("Enter a Number : ");
            int sui = sc.nextInt();
            System.out.println("what operation you want ('reverse' for reverse number, 'factorial' for factorial of number ): ");
            String se = sc.nextLine();
            if(se=="reverse"){
                int rev_1=0;
                int rem_1;
                while(sui>0){
                    rem_1 = sui%10;
                    rev_1 = (rev_1*10) + rev_1;
                    sui = sui/10;
                }
                System.out.println("The Reversed Number is : " + rev_1);
            } else if(se=="factorial"){
                int fact_1=1;
                for(int i =1;i<=sui;i++){
                    fact_1 *=i; 
                }
                System.out.println("The factorial is : " + fact_1);
            } else {
                System.out.println("Please Enter correct Option");
            }

    //Q19   write and make a program user give two string like even and odd even denoted even number and odd denoted odd number when user input odd then input a range and calculate even and odd number in java ?(use if else if and for loop)  

        
        System.out.println("Enter 'even' or 'odd':");
        String choice = sc.nextLine().toLowerCase();

       
        int evenCount = 0;
        int oddCount = 0;


        if (choice.equals("even") || choice.equals("odd")) {
            System.out.println("Enter the range (two integers):");
            int start = sc.nextInt();
            int end = sc.nextInt();

           
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

          
            if (choice.equals("even")) {
                System.out.println("Count of even numbers in the range: " + evenCount);
            } else if (choice.equals("odd")) {
                System.out.println("Count of odd numbers in the range: " + oddCount);
            }
        } else {
      
            System.out.println("Invalid input. Please enter 'even' or 'odd'.");
        }

    //Q20 write a java prgram user input neon number :then calucate neon number or user input perfect number then calculate perfect number or user input prime number then agin user input is one or more when a user input one then check a input is prime or not otherwise userinput more then print 1 to 100 prime numbers or when user input a one digit the user input again : count ya sumofdigit when a user input count then count the digit and user input sumofdigit then addition of all the digits when user input fibonacci the user again input to lastnumber ya series of nth term when user input last number then print last number of a sum of fibonacci and user input a series then print a series of fibonacci

        System.out.println("Enter your choice: neon, perfect, prime, count, sumofdigit, fibonacci");
        String choice_1 = sc.next().toLowerCase();
        switch(choice_1){
            case "neon" : 
                    System.out.println("Enter Number to check if its neon : ");
                    int num_9 = sc.nextInt();
                    int ne_o = num_9*num_9;
                    int su_m = 0;
                    int re_m;
                    while(ne_o>0){
                        re_m = ne_o%10;
                        su_m = su_m + re_m;
                        ne_o = ne_o/10;
                    }
                    if(su_m == num_9){
                        System.out.println("It's a neon Number");
                        break;
                    } else {
                        System.out.println("It's not a neon Number");
                        break;
                    }
            case "perfect": 
                    System.out.println("Enter Number to check if its perfect : ");
                    int p = sc.nextInt();
                    int perfectNum=0;
                    for(int i =1;i<p;i++){
                        if(p%i==0){
                            perfectNum+=i;
                        }
                    }
                    if(perfectNum==p){
                        System.out.println("Its a perfect Number");
                        break;
                    } else {
                        System.out.println("It's not a perfect Number");
                        break;
                    }
            case "prime":
                    System.out.println("Enter Number to check if its prime : ");
                    int pri = sc.nextInt();
                    int prime_1 = 0;
                    for(int i =1;i<=pri;i++){
                        if(pri%i==0){
                            prime_1++;
                            
                    }
                }
                if(prime_1==2){
                    System.out.println("Its a prime Number");
                    break;
                } else {
                    System.out.println("It's not a prime Number");
                    break;
                }

            case "count" :
                System.out.println("Enter Number to count its factors : ");
                int fact_number = sc.nextInt();
                int fact_counter=0;
                for(int i =1;i<=fact_number;i++){
                    if(fact_counter%i==0){
                        fact_counter++;
                    }
                }
                System.out.println("The factors cont is : " + fact_counter);
                break;

            case "subofdigit" : 
                System.out.println("Enter Number to get its sum of digits : ");
                int sumof = sc.nextInt();
                int sumof_rem;
                int sumof_digit = 0;
                while(sumof>0){
                    sumof_rem = sumof%10;
                    sumof_digit += sumof_rem;
                    sumof = sumof/10;
                }
                System.out.println("The sum of digit is : " + sumof_digit);
                break;

            case "fibonacci" :
                System.out.println("Enter number till you want fibonacci : ");
                int fib_num = sc.nextInt();
                 if (fib_num <= 0) {
                        System.out.println("Enter a valid positive number.");
                    } else {
                        int x1 = 1, x2 = 1;

                        System.out.println("Fibonacci Sequence:");
                        if (fib_num >= 1) {
                            System.out.println(x1); // First term
                        }
                        if (fib_num >= 2) {
                            System.out.println(x2); // Second term
                        }
                        for (int i = 3; i <= fib_num; i++) { // Start from the 3rd term
                            int x3 = x1 + x2;
                            System.out.println(x3);
                            x1 = x2;
                            x2 = x3;
                        }
                    }
                    break;
            default :
            System.out.println("Invalid Choice");
        }





    }
 }