//Assignment5 - 12/12/24 - Assignment 5 - MNC Questions
import java.util.*;

/* 1)Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
            lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or
            7. Provide a valid car number, Fails to provide a valid input then display that number is not a
            valid car number.
            Note : The input other than 4 digit positive number[includes negative and 0] is considered as
            invalid.
            Refer the samples, to read and display the data.
            Sample Input 1:
            Enter the car no:1234
            Sample Output 1:
            Lucky Number
            Sample Input 2:
            Enter the car no:1214
            Sample Output 2:
            Sorry its not my lucky number
            Sample Input 3:
            Enter the car no:14
            Sample Output 3:
            14 is not a valid car number
         */

        class MNC_1{
            void lucky(){
                 Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the Car Number you want : ");
                    int carNumber = sc.nextInt();
                    int count=0;
                    int sum = 0;
                    int rem;
                    if(carNumber>0){
                    while(carNumber>0){
                        rem = carNumber%10;
                        sum = sum + rem;
                        carNumber = carNumber/10;
                        count++;            
                    }
                    if(count==4){
                        if(sum%3==0 || sum%5==0 || sum%7 == 0){
                            System.out.println("Lucky Number");
                        } else {
                            System.out.println("Sorry, It's not lucky number");
                        }
                        
                    } else {
                        System.out.println("Invalid Car Number : it should be 4 digit");
                    }
                    } else {
                        System.out.println("Invalid Car Number : is should be in positive and not 0");
                    }
                        }
        }



 /*Q.2 XYZ Technologies is in the process of increment the salary of the employees. This
                increment is done based on their salary and their performance appraisal rating.
                If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
                If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
                If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
                Help them to do this, by writing a program that displays the incremented salary.
        */

       class IncrementCalculation{
        void salaryInc(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Salary : ");
            float salary = sc.nextFloat();
            if(salary<=0){
                System.out.println("Enter Valid Salary");
            } else {
            
            System.out.println("Your Ratting is : (enter between 1 to 5) -> ");
            float rating = sc.nextFloat();

            if(rating>=1 && rating <=3){
                float discount = (salary/100)*10;
                 System.out.println("You got 10% salary increment " + discount + " thus your new salary is : " + (salary+discount));
            }
            else if(rating >=3.1 && rating <=4){
                float discount = (salary/100)*25;
                 System.out.println("You got 25% salary increment " + discount + " thus your new salary is : " + (salary+discount));
            }
            else if(rating >=4.1 && rating <=5){
               float discount = (salary/100)*30;
                 System.out.println("You got 30% salary increment " + discount + " thus your new salary is : " + (salary+discount));
            }
            else{
                System.out.println("Invalid Rating");
            }
            }
           
            
        }
       }
/*  Q.3 Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
        to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
        Tanul should say 'Palindrome'. If not, he should say 'Not a Palindrome'. If the number is
        negative, print 'Invalid Input'. Help Tanul by writing a program.       */

        class Palindrome{
            void checkPali(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number : ");
                int num = sc.nextInt();

                int temp = num;
                int rem;
                int pali=0;
                if(num>0){
                while(num>0){
                    rem = num%10;
                    pali = (pali*10) + rem;
                    num = num/10;
                }
                if(temp==pali){
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Its not Palindrome");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
        }


/*  Q.4 Problem Statement – To speed up his composition of generating unpredictable rhythms,
        Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help
        him out?
        Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).*/

        class Prime{
            void prime(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter range for intervel : \t");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int count;
                System.out.println("Prime Numbers in your given range are : ");
                if(a>0 && b>a){
                    for(int i =a;i<=b;i++){
                        count = 0;
                        for(int j =1;j<=i;j++){
                            if(i%j==0){
                                count++;
                            }
                        }
                        if(count==2){
                                System.out.print(i + "\t");
                            }
                    }
                } else {
                    System.out.println("enter valid range");
                }
                System.out.println();
            }
        }

/*  Q.5 Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
        lesson on seasons. When her teacher tells a month, she needs to say the season
        corresponding to that month. Write a program to solve the above task.   */

        class Season{
            void month(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of month : ");
                int n = sc.nextInt();
                if(n>=1 && n<4){
                    System.out.println("Season is : Spring");
                }
                else if(n>=4 && n<7){
                    System.out.println("Season is : Summer");
                    }
                    else if(n>=7 && n<10){
                        System.out.println("Season is : Autumn");
                        }
                        else if(n>=10 && n<=12){
                            System.out.println("Season is : Winter");
                            }
                            else {
                                System.out.println("Please Enter Right Number of Month");
                            }

            }
        }

/*  Q.6 In a theater, there is a discount scheme announced where one gets a 10% discount
        on the total cost of tickets when there is a bulk booking of more than 20 tickets, and
        a discount of 2% on the total cost of tickets if a special coupon card is submitted.
        Develop a program to find the total cost as per the scheme. The cost of the k class
        ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an
        additional of Rs. 50 per member.        */

      class Ticket {
    void ticketSystem() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of tickets you want: ");
        int tickets = sc.nextInt();
        
        if (tickets > 0) {
            System.out.println("Enter class (k = Rs. 75, q = Rs. 150): ");
            char ticketClass = sc.next().charAt(0);
            
            int ticketPrice;
            if (ticketClass == 'k') {
                ticketPrice = tickets * 75;
            } else if (ticketClass == 'q') {
                ticketPrice = tickets * 150;
            } else {
                System.out.println("Invalid ticket class!");
                return;
            }

            System.out.println("Do you want to buy refreshments (y/n): ");
            char refreshment = sc.next().charAt(0);
            
            if (refreshment != 'y' && refreshment != 'n') {
                System.out.println("Invalid input for refreshments!");
                return;
            }

            System.out.println("Do you have a coupon card? Enter 'c' for yes or any other key for no: ");
            char coupon = sc.next().charAt(0);


            int cost = ticketPrice;
            if (refreshment == 'y') {
                cost += 50 * tickets;
            }

            // Apply discount
            if (tickets > 20) {
                System.out.println("Discount of 10% is applied.");
                cost -= cost * 0.1;
            } else if (coupon == 'c') {
                System.out.println("Discount of 2% is applied.");
                cost -= cost * 0.02;
            }

            System.out.println("Total Cost is: Rs. " + cost);
        } else {
            System.out.println("Invalid number of tickets!");
        }

        sc.close();
    }
}

/*  Q7      Problem Statement – FOE college wants to recognize the department which has
            succeeded in getting the maximum number of placements for this academic year.
            The departments that have participated in the recruitment drive are CSE,ECE,
            MECH. Help the college find the department getting maximum placements. Check
            for all the possible output given in the sample snapshot
            Note : If any input is negative, the output should be 'Input is Invalid'. If all
            department has equal number of placements, the output should be “None of the
            department has got the highest placement'.  */


            class Placement {
                void place(){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the no of students placed in CSE : ");
                    int cse = sc.nextInt();
                    System.out.println("Enter the no of students placed in ECE : ");
                    int ece = sc.nextInt();
                    System.out.println("Enter the no of students placed in MECH : ");
                    int mech = sc.nextInt();

                    if(cse >=0 && ece >=0 && mech>=0){
                        if(cse>ece && cse>mech){
                            System.out.println("Highest placement CSE");
                        } else if(ece>cse && ece>mech){
                            System.out.println("Highest placement ECE");
                        } else if(cse == ece && cse == mech){
                            System.out.println("None of the department has got the highest placement.");
                        } else {
                            System.out.println("Highest placement Mech");
                        }
                    }
                    else {
                        System.out.println("Enter Valid Placement data");
                    }
                }
            }

/*  Q.8 Problem Statement – Ritik wants a magic board, which displays a character for a
        corresponding number for his science project. Help him to develop such an
        application.
        For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be
        displayed.
        [Assume the number of inputs should be always 4 ]*/

        class MagicBoard{
            void magicBoard(){
                Scanner sc = new Scanner(System.in);
                int [] numbers = new int[4];
                System.out.println("Enter 4 numbers : ");
                for(int i =0;i<4;i++){
                    numbers[i] = sc.nextInt();  
                }

                

                for(int num : numbers){
                    char character = (char)num;  // Converting number to corresponding ASCII character
                    System.out.println(num + "-" + character);
                }
            }
        }


/*  Q.9 Vohra went to a movie with his friends in a Wave theatre and during break time he
    bought pizzas, puffs and cool drinks. Consider the following prices :
    Rs.100/pizza
    Rs.20/puffs
    Rs.10/cooldrink
    Generate a bill for What Vohra has bought.      */
    class Bill{
        void bilGenerater(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of pizza you bought : ");
            int pizza = sc.nextInt();
            System.out.println("Enter the number of puffs you bought : ");
            int puffs = sc.nextInt();
            System.out.println("Enter the number of cool drinks you bought : ");
            int coolDrinks = sc.nextInt();

            int cost = (pizza*100) + (puffs*20) + (coolDrinks*10);
            System.out.println("Your total bill is : " + cost);
            System.out.println("Enjoy the show!!");
        }
    }

/*  Q10 Problem Statement – Write a program to calculate the fuel consumption of your
        truck.The program should ask the user to enter the quantity of diesel to fill up the
        tank and the distance covered till the tank goes dry.Calculate the fuel consumption
        and display it in the format (liters per 100 kilometers).
        Convert the same result to the U.S. style of miles per gallon and display the result. If
        the quantity or distance is zero or negative display ' is an Invalid Input'.
        [Note: The US approach of fuel consumption calculation (distance / fuel) is the
        inverse of the European approach (fuel / distance ). Also note that 1 kilometer is
        0.6214 miles, and 1 liter is 0.2642 gallons.]       */

        class Dist{
            void distSystem(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of liters to fill the tank : ");
                double liters = sc.nextDouble();
                System.out.println("Enter the distance covered till the tank goes dry : ");
                double distance = sc.nextDouble();

                double inKm = (liters/distance)*(100.0d);
                System.out.println(inKm + " Liters/km");

                double miles = distance*0.62137;
                double gallon = liters*0.264172;
                double inGal = miles/gallon;
                System.out.println(inGal + " miles/gallons");              
            }
        }

public class Assignment5_MNC_Questions{
    public static void main(String[] args){
    
    //Q.1
            MNC_1 obj = new MNC_1();
            obj.lucky();

    //Q.2
            IncrementCalculation obj1 = new IncrementCalculation();
            obj1.salaryInc();

    //Q.3
            Palindrome pd = new Palindrome();
            pd.checkPali();

    //Q.4
            Prime obj2 = new Prime();
            obj2.prime();

    //Q.5
            Season obj3 = new Season();
            obj3.month();

    //Q.6
            Ticket obj4 = new Ticket();
            obj4.ticketSystem();

    //Q.7
            Placement pl = new Placement();
            pl.place();

    //Q.8

            MagicBoard mb = new MagicBoard();
            mb.magicBoard();

    //Q.9
            Bill b = new Bill();
            b.bilGenerater();      

    //Q10
            Dist ds = new Dist();
            ds.distSystem();      

    }
}