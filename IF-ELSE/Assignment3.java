import java.util.*;
public class Assignment3{
    public static void main(String []args){
    //Assignment3 - 12/12/24 
            //Q) 1: Tax Calculator
            // Write a Java program that calculates income tax for individuals based on the following criteria:

            // Income <= 10,000: No tax
            // 10,001 - 30,000: 10% tax
            // 30,001 - 50,000: 20% tax
            // Income > 50,000: 30% tax
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Your Income : ");
                    int salary = sc.nextInt();
                    if(salary<=10000){
                        System.out.println("No Tax");
                    } else if(salary>10000 && salary<=30000){
                        System.out.println("Tax is 10%");
                        int tax = (salary/100)*10;
                        System.out.println("Your Tax is : " + tax);
                    } else if(salary>30000 && salary<=50000){
                        System.out.println("Tax is 10%");
                        int tax = (salary/100)*20;
                        System.out.println("Your Tax is : " + tax);
                    } else if(salary>50000){
                        System.out.println("Tax is 10%");
                        int tax = (salary/100)*30;
                        System.out.println("Your Tax is : " + tax);

                    }
            //Q) 2: BMI Calculator
                // Create a program that calculates the Body Mass Index (BMI) based on a person's weight and height. Categorize the BMI using the following ranges:
                // BMI < 18.5: Underweight
                // 18.5 <= BMI < 24.9: Normal weight
                // 25 <= BMI < 29.9: Overweight
                // BMI >= 30: Obesity

                    System.out.println("Enter weight in kg : ");
                    float kg = sc.nextFloat();
                    System.out.println("Enter Height in cm : ");
                    int cm = sc.nextInt();
                    float meter = cm/100f;
                    float bmi = kg/(meter*meter);

                    if(bmi<18.5){
                        System.out.println("Underweight");
                    } else if(bmi>=18.5 && bmi<=24.5){
                        System.out.println("Normal weight");
                    } else if(bmi>24.5 && bmi<=29.9){
                        System.out.println("Overweight");
                    } else {
                        System.out.println("Obesity");
                    }

            //Q) 3 : Question 3: Leap Year Checker
                    // Write a Java program that checks if a given year is a leap year or not. Leap years are divisible by 4, but years divisible by 100 are not leap years unless they are also divisible by 400.

                    System.out.println("Enter Year to check if it's a leap year : ");
                    int year = sc.nextInt();

                    if(year%4==0){
                        if(year%100==0 && year%400==0){
                        System.out.println("It's a Leap Year");
                    }
                    else {
                        System.out.println("It's not a Leap Year");
                    }
                    } else {
                        System.out.println("It's not a Leap Year");
                    }  
            //Q) 4 :  Time of Day Greeting
                    // Create a program that asks for the time of day (morning, afternoon, evening) and then greets the user accordingly. For example, "Good morning!" if the time is morning.

                    System.out.println("What time is now (morning,noon,evening,night) : ");
                    String time = sc.next();
                    if(time.equalsIgnoreCase("morning")){
                        System.out.println("Good morning!");
                        }
                        else if(time.equalsIgnoreCase("noon")){
                            System.out.println("Good noon!");
                            }
                            else if(time.equalsIgnoreCase("evening")){
                                System.out.println("Good evening!");
                                }
                                else if(time.equalsIgnoreCase("night")){
                                    System.out.println("Good night!");
                                    }
                                    else {
                                        System.out.println("Enter Correct Time");
                                    }

            //Q) 5 :  Menu Selection
                    // Design a simple restaurant menu system that takes a customer's choice (1-3) and displays the selected food item and its price. Use if-else if-else statements.  
                    System.out.println("Enter 1 to see menu : ");
                    int choice1 = sc.nextInt();
                    if(choice1==1){
                        System.out.println("Menu :");
                        System.out.println("1. Burger - $5.99");
                        System.out.println("2. Pizza - $7.99");
                        System.out.println("3. Sandwich - $4.99");
                        System.out.println("Enter your choice : ");
                        int choice2 = sc.nextInt();
                        if(choice2==1){
                            System.out.println("You Selected Burger");
                            System.out.println("Your Bill is : $5.99");
                        } 
                        else if(choice2==2){
                            System.out.println("You Selected Pizza");
                            System.out.println("Your Bill is : $7.99");
                        } 
                        else if(choice2==3){
                            System.out.println("You Selected Sandwich");
                            System.out.println("Your Bill is : $4.99");
                        } else {
                            System.out.println("Invalid Choice");
                        }

                        
                    }   else {
                        System.out.println("Invalid choice");
                    }   

            //Q) 6 : Temperature Converter
                    // Write a Java program to convert temperatures between Celsius and Fahrenheit. The program should ask the user for the input temperature and the unit (C or F) and provide the converted temperature.

                    System.out.println("Enter 1 to convert Celsius to fahrenheit or 2 for vica versa");
                    int cho1 = sc.nextInt();
                    if(cho1==1){
                        System.out.println("Enter Temperature in Celsuis : ");
                        int cel = sc.nextInt();
                        int fer = (cel*(9/5))+32;
                        System.out.println("Temperature in fahrenhiet : " + fer);
                    } else if(cho1==2){
                        System.out.println("Enter Temperature in Fahrenhiet : ");
                        int fer = sc.nextInt();
                        int cel = (fer-32)*(5/9);
                        System.out.println("Temperature in Celsuis : " + cel);
                    } else {
                        System.out.println("Invalid Input");
                    }

            //Q) 7 :  Number Comparison
                    // Create a program that takes two numbers as input and uses if-else if-else statements to determine and print which number is greater or if they are equal.

                    System.out.println("Enter Number : ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter Number : ");
                    int num2 = sc.nextInt();
                    if(num1>num2){
                        System.out.println(num1 + " is bigger than " + num2);
                    } else if(num1<num2){
                        System.out.println(num2 + " is bigger than " + num1);
                    } else {
                        System.out.println("Both are Equal");
                    }

            //Q) 8 :  Ticket Booking System
                    // Design a ticket booking system for a cinema that calculates the ticket price based on the age of the customer. Children (age < 12) get a 50% discount, while seniors (age >= 65) get a 30% discount.

                    System.out.println("Enter Your age to get your ticket price :  ");
                    int ag = sc.nextInt();
                    int ticketPrice = 500;
                    if(ag<12){
                        int dis = ticketPrice- ((ticketPrice/100)*50);
                        System.out.println("You are Child You will get 50% discount thus your ticket price is : " + dis);
                    } else if(ag>=65){
                        int dis = ticketPrice- ((ticketPrice/100)*30);
                        System.out.println("You are Senior You will get 30% discount thus your ticket price is : " + dis);
                    } else {
                        System.out.println("Ticket Price is : " + ticketPrice);
                    }


            //Q) 9 : Letter Grade Calculator
                    // Write a program that accepts a student's score as input and calculates their letter grade using if-else if-else statements. Consider the standard letter grading system (A, B, C, D, F).

                    System.out.println("Enter Number : ");
                    int mark1 = sc.nextInt();
                    System.out.println("Enter Number : ");
                    int mark2 = sc.nextInt();
                    System.out.println("Enter Number : ");
                    int mark3 = sc.nextInt();
                    System.out.println("Enter Number : ");
                    int mark4 = sc.nextInt();
                    System.out.println("Enter Number : ");
                    int mark5 = sc.nextInt();
                    float av = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
                    if(av>=80){
                        System.out.println("Grade : A");
                    } else if(av>=60 && av<80){
                        System.out.println("Grade : B");
                    } else if(av>=50 && av<60){
                        System.out.println("Grade : C");
                    } else if(av>=45 && av<50){
                        System.out.println("Grade : D");
                    } else {
                        System.out.println("Fail");
                    }

            //Q) 10 : Vowel or Consonant Checker
                    // Create a program that takes a single alphabet character as input and checks if it is a vowel (A, E, I, O, U) or a consonant.
                    sc.nextLine();
                    System.out.println("Enter a Aplphabate : ");
                    char c = sc.next().charAt(0);

                    if(c>='a' && c<='z' || c>='A' && c<='Z'){
                        if(c=='a' || c=='e' || c=='i' || c== 'o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                            System.out.println("It's a Vowel");
                        } else {
                            System.out.println("It's a Consonet");
                        }
                    } else {
                        System.out.println("It's not a alphabate");
                    }



    }
}