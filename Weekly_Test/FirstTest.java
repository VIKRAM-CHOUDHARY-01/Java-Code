/*
Weekly Test Java
Q.1 user input :
Declare and Initialize Variables:
Declare an integer variable named age and initialize it with the value 25.
Declare a double variable named price and initialize it with the value 19.99.

Ans-> import java.util.*;
public class FkjairstTest{
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        System.out.println(age);
        System.out.println(price);
    }
}

Q.2 user input :
Performing Operations:
Create two variables, num1 and num2, with values 10 and 5 respectively. Perform addition, subtraction, multiplication, and division operations on them.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        System.out.println("The Sum is : " + sum);
        System.out.println("The Sub is : " + sub);
          System.out.println("The Multiplication is : " + mul);
             System.out.println("The Division is : " + div);
          
    }
}

Q.3 : Boolean Operations:
Declare two boolean variables, isJavaFun and isCodingEasy, and initialize them with appropriate values.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       boolean isJavaFun = true;
       boolean isCoddingEasy = false;
       System.out.println(isJavaFun);
       System.out.println(isCoddingEasy);
    }
}
Q.4  String Length:
Declare a String variable named text and initialize it with any text.
Ans.: import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       String text = "California Dreamin";
       System.out.println(text);
    }
}

Q.5 Even or Odd:
Write a Java program to check if a given number is even or odd.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Numebr : ");
       int a = sc.nextInt();
       if(a%2==0){
        System.out.println("Even");
       } else {
        System.out.println("Odd");
       }
    }
}

Q.6 Leap Year:
Create a Java program to determine if a given year is a leap year.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Year : ");
       int Year = sc.nextInt();
       if(year%4==0){
        System.out.println("Leap Year");
       } else {
        System.out.println("Not a Leap Year");
       }
    }
}

Q.7 : Positive, Negative, or Zero:
Create a Java program to check if a given number is positive, negative, or zero.
Ans: import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Number : ");
       int num = sc.nextInt();
       if(num>0){
        System.out.println("Number is Positive");
       } else if(num<0){
        System.out.println("Number is Negative");
       } else {
        System.out.println("Number is Zero");
       }
    }
}

Q.8 Grade Calculator:
Develop a Java program that takes a student's score as input and prints their grade (A, B, C, D, or F).
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Your Mark (Out of 100): ");
       int s = sc.nextInt();
       if(s>=90 && s<=100){
        System.out.println("Grade A");
       } else if(s>=80 && s<90){
        System.out.println("Grade B");
       } else if(s>=70 && s<80){
        System.out.println("Grade C");
       } else if(s>=34 && s<70){
        System.out.println("Grade D");
       } else if(s<34 && s>=0){
        System.out.println("Grade F");
       } else {
        System.out.println("Please Enter Valid Marks");
       }
       
    }
}

Q.9 Print even numbers between 20 and 30 using a while loop.
Ans: import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
       
       int num=20;
       while(num<=30){
        if(num%2==0){
            System.out.println(num+" is even");

        }
        num++;
       }
       
    }
}

Q10 Calculate the sum of first 100 natural numbers using a for loop.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
int sum = 0;
       
     
      for(int num = 1;num<=100;num++){
       sum = sum + num;

}
System.out.println(sum);

       }
       
    }

Q.11 Print the Fibonacci series up to 10 terms using a for loop.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
    
    int a1 = 0;
    int a2 = 1;
    int a3;
    System.out.println(a1);
    System.out.println(a2);
   
    for(int i =1;i<=8;i++){
        a3 = a1 + a2;
        System.out.println(a3);
        a1 = a2;
        a2 = a3;
    
    }
    }   
    }
Q12 Write a program to find the factorial of a number using a while loop.13)
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet a Number to get its factorial: ");
        int num = sc.nextInt();

        int fact = 1;
        while(num>0){
            fact = fact * num;
            num--;
           
        }
        System.out.println("The Factorial is : " + fact);
    
    }
    }

Q14 Check if a given number is a palindrome using a using loop.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number to check if it's Palindrome or not : ");
       int n = sc.nextInt();
       int rem;
       int temp = n;
       int pali=0;

       while(n>0){
        rem = n%10;
        pali = (pali*10) +rem;
        n = n/10;
       }
       if(pali==temp){
        System.out.println("Its a Palindrome Number");
       } else {
        System.out.println("Its not a Palindrome Number");
       }
    
    }
    }

Q.15 Rock-Paper-Scissors Game:
Create a Java program for a simple Rock-Paper-Scissors game using if-else if conditions.

Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 for rock, 2 for paper and 3 for scissors: ");
       int n = sc.nextInt();
       int comp = (int) (Math.random() * 3) + 1;
       if (n == 1 && comp == 2) {
        System.out.println("Computer chose paper, you lose!");
    }
    else if(n == 1 && comp == 3){
        System.out.println("Computer chose scissors, you win!"); 
    } else if(n==1 && comp == 1){
        System.out.println("It's a tie!");
    } else if(n==2 && comp == 1){
        System.out.println("Computer chose rock, you win!");
    } else if(n==2 && comp==2){
        System.out.println("It's a tie!");
    } else if(n==2 && comp == 3){
        System.out.println("Computer chose scissors, you lose!");
    } else if (n==3 && comp == 1){
        System.out.println("Computer chose rock, you lose!");
    } else if(n==3 && comp ==2){
        System.out.println("Computer chose paper, you win!");
    } else if(n==3 && comp==3){
        System.out.println("It's a tie!");
    } else {
        System.out.println("Invalid input");
    }
    }
}

Q16 Temperature Converter:
Write a Java program that converts temperature from Celsius to Fahrenheit or vice versa based on user input using if-else statements.
Ans: import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 to input celcius or 2 to input farehnihite: ");
       int opt = sc.nextInt();
       if(opt==1){
        System.out.println("Enter Tempreature in Celcuis : ");
        int cel = sc.nextInt();
        int fer = (cel*9/5) + 32;
        System.out.println("Tempretue in Ferhenight : " + fer);
         } else if(opt == 2){
             System.out.println("Enter Tempreature in Fahrenheit : ");
        int fer = sc.nextInt();
        int cel = (fer-32)*5/9;
        System.out.println("Tempretue in Celcuis : " + cel);
         } else {
            System.out.println("Please Enter Valid Option");
         }

    }
}


Q.17 Ticket Reservation System:
Develop a Java program for a simple ticket reservation system that checks seat availability and age restrictions using if-else if conditions.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Age to check your eligibilty to book ticket :  ");
      int age = sc.nextInt();
      if(age>=18){
        System.out.println("You are eligible to book ticket");
        System.out.println("Enter Numbers of seat you want to book : ");
        int seat = sc.nextInt();
        if(seat>5){
            System.out.println("Sorry you can't book more than 5 seat");
        } else {
            System.out.println("You can book");
        }
      }
      else{
        System.out.println("You are not eligible to book ticket");
        }
    }

}

Q18 Even or Odd and Positive or Negative:
Create a Java program that checks if a number is even or odd and positive or negative using nested if-else statements.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numebr: " );
        int num = sc.nextInt();
        if(num>=0){
           if(num%2==0){
            System.out.println("The Number is Positive and Even");
           } else {
            System.out.println("The Number is Positive and Odd");
           }
        }
        else{
            if(num%2==0){
                System.out.println("The Number is Negative and Even");
                } else {
                    System.out.println("The Number is Negative and Odd");
                }
        }
    }
}

Q19 Month Name:
Develop a Java program that takes a month number as input and prints the month's name using switch.
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month Numebr: " );
        int num = sc.nextInt();
        switch(num){
            case 1: 
            System.out.println("January");
            break;
            case 2: 
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
                System.out.println("Invalid Month Number");
        }
        
    }
}

Q20 : Ticket Pricing:
Create a Java program to calculate the ticket price based on the age group (child, adult, senior).
Ans : import java.util.*;
public class FirstTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of tickets you want: ");
        int ticket = sc.nextInt();
        System.out.println("Enter Your age to check your age group and ticket price (80/ticket for child, 100/ticket for adult, 120/ticket for senoir) : ");
        int age = sc.nextInt();
        if(age>0 && age<=18){
            System.out.println("You are Child");
            int ticketPrice = 80*ticket;
            System.out.println("Your Total Ticket Price is : " + ticketPrice);
        }
        else if(age>18 && age<=60){

            System.out.println("You are Adult");
            int ticketPrice = 100*ticket;
            System.out.println("Your Total Ticket Price is : " + ticketPrice);

        } else if(age>60){
              System.out.println("You are Senoir");
            int ticketPrice = 120*ticket;
            System.out.println("Your Total Ticket Price is : " + ticketPrice);
        } 
    }
}














































*/