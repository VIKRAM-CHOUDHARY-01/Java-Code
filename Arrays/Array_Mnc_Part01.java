//Assignemnt - Array MNC Qestions Part-01 - 13/02/25

    /*Q1) Problem Statement – Chaman planned to choose a four digit lucky number for his car. His
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
            14 is not a valid car number    */
import java.util.*;
public class Array_Mnc_Part01{
    public static void luckey(int a){
      
        if(a<1000 || a>9999){
            System.out.println(a+ " is not a Valid Car Number");
            return;
        } else {

        int sum=0;
        int rem1;
        int temp = a;
        while(temp>0){
            rem1 = temp%10;
            sum+=rem1;
            temp = temp/10;
        }
        if(sum%3==0 || sum%5==0 || sum%7==0){
            System.out.println("Lucky Number");
        }else {
            System.out.println("Sorry its not my lucky number");
        }

        }
      
    }


    
    /*Q2
            XYZ Technologies is in the process of increment the salary of the employees. This
        increment is done based on their salary and their performance appraisal rating.
        If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
        If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
        If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
        Help them to do this, by writing a program that displays the incremented salary. Write a
        class 'IncrementCalculation.java'and write the main method in it.
        Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to
        5 (inclusive), then the output should be 'Invalid Input'.
        Sample Input 1 :
        Enter the salary
        8000

        Enter the Performance appraisal rating
        3
        Sample Output 1 :
        8800
        Sample Input 2 :
        Enter the salary
        7500
        Enter the Performance appraisal rating
        4.3
        Sample Output 2 :
        9750
        Sample Input 3 :
        Enter the salary
        -5000
        Enter the Performance appraisal rating
        6
        Sample Output 3 :
        Invalid Input           */


    /*Q3  
            Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
            to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
            Tanul should say 'Palindrome'. If not, he should say 'Not a Palindrome'. If the number is
            negative, print 'Invalid Input'. Help Tanul by writing a program.
            Sample Input 1 :
            21212
            Sample Output 1 :
            Palindrome
            Sample Input 2 :
            6186

            Sample Output 2 :
            Not a Palindrome    */



            public static void Palindrome(int a){
                int rem = 0;
                int temp = a;
                int pali =0;
                while(a>0){
                    rem = a%10;
                    pali = (pali*10) + rem;
                    a = a/10;
                }
                if(temp==pali){
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
            }

    /*Q4   
            Problem Statement – To speed up his composition of generating unpredictable rhythms,
            Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help
            him out?
            Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
            Note
            Input 1 should be lesser than Input 2. Both the inputs should be positive.
            Range must always be greater than zero.
            If any of the condition mentioned above fails, then display 'Provide valid input'
            Use a minimum of one for loop and one while loop
            Sample Input 1:
            2
            15
            Sample Output 1:
            2 3 5 7 11 13
            Sample Input 2:
            8
            5
            Sample Output 2:
            Provide valid input */


            public static void Prime(int start, int end){
                
                if(start<=1){
                    start++;
                }
                int count;
                for(int i =start;i<=end;i++){
                count =0;
                for(int j =2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==0){
                    System.out.println(i);
                }

                }
               
                
            }

    /*Q5    Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
            lesson on seasons. When her teacher tells a month, she needs to say the season
            corresponding to that month. Write a program to solve the above task.
            Spring – March to May,
            Summer – June to August,
            Autumn – September to November and,
            Winter – December to February.
            Month should be in the range 1 to 12. If not the output should be 'Invalid month'.

            Sample Input 1:
            Enter the month:11
            Sample Output 1:
            Season:Autumn
            Sample Input 2:
            Enter the month:13
            Sample Output 2:
            Invalid month   */

    /*Q6
            In a theater, there is a discount scheme announced where one gets a 10% discount
            on the total cost of tickets when there is a bulk booking of more than 20 tickets, and
            a discount of 2% on the total cost of tickets if a special coupon card is submitted.
            Develop a program to find the total cost as per the scheme. The cost of the k class
            ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an
            additional of Rs. 50 per member.
            Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a
            time. If fails display 'Minimum of 5 and Maximum of 40 Tickets'. If circle is given a
            value other than 'k' or 'q' the output should be 'Invalid Input'.
            The ticket cost should be printed exactly to two decimal places.
            Sample Input 1:
            Enter the no of ticket:35
            Do you want refreshment:y
            Do you have coupon code:y
            Enter the circle:k
            Sample Output 1:
            Ticket cost:4065.25
            Sample Input 2:
            Enter the no of ticket:1
            Sample Output 2:    
            Minimum of 5 and Maximum of 40 Tickets  */

            public static void ticketSystem(int ticketNumbers, char refereshment, char couponCode, char circle){
                float totalCost = (circle=='k') ? (ticketNumbers*75) : (ticketNumbers*150);
                System.out.println(totalCost);
                
                if(ticketNumbers>=20){
                    totalCost = totalCost - ((totalCost/100)*10);
                    System.out.println(totalCost);
                }
               
                if(couponCode=='y'){
                    totalCost = totalCost - ((totalCost/100)*2);
                    System.out.println(totalCost);
                }

                 if(refereshment=='y'){
                    totalCost = totalCost + (ticketNumbers*50);
                    System.out.println(totalCost);
                }
              
                System.out.println("Total cost is : " + totalCost);

               

            }

            
    /*Q9
            Vohra went to a movie with his friends in a Wave theatre and during break time he
            bought pizzas, puffs and cool drinks. Consider the following prices :
            Rs.100/pizza
            Rs.20/puffs
            Rs.10/cooldrink
            Generate a bill for What Vohra has bought.
            Sample Input 1:
            Enter the no of pizzas bought:10
            Enter the no of puffs bought:12
            Enter the no of cool drinks bought:5
            Sample Output 1:
            Bill Details
            No of pizzas:10
            No of puffs:12
            No of cooldrinks:5
            Total price=1290
            ENJOY THE SHOW!!!  
      */
         

    /*Q10
            Problem Statement – Write a program to calculate the fuel consumption of your
            truck.The program should ask the user to enter the quantity of diesel to fill up the
            tank and the distance covered till the tank goes dry.Calculate the fuel consumption
            and display it in the format (liters per 100 kilometers).
            Convert the same result to the U.S. style of miles per gallon and display the result. If
            the quantity or distance is zero or negative display ”'is an Invalid Input'.
            [Note: The US approach of fuel consumption calculation (distance / fuel) is the
            inverse of the European approach (fuel / distance ). Also note that 1 kilometer is
            0.6214 miles, and 1 liter is 0.2642 gallons.]
            The result should be with two decimal place.To get two decimal place refer the
            below-mentioned print statement :

            float cost=670.23;
            System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);
            Sample Input 1:
            Enter the no of liters to fill the tank
            20
            Enter the distance covered
            150
            Sample Output 1:
            Liters/100KM
            13.33
            Miles/gallons
            17.64
            Explanation:
            For 150 KM fuel consumption is 20 liters,
            Then for 100 KM fuel consumption would be (20/150)*100=13.33,
            Distance is given in KM, we have to convert it to miles (150*0.6214)=93.21,
            Fuel consumption is given in liters, we have to convert it to gallons
            (20*0.2642)=5.284,
            Then find (miles/gallons)=(93.21/5.284)=17.64
            Sample Input 2:
            Enter the no of liters to fill the tank
            -5
            Sample Output 2:
            -5 is an Invalid Input
            Sample Input 3:
            Enter the no of liters to fill the tank
            25
            Enter the distance covered
            -21

            Sample Output 3:
            -21 is an Invalid Input */


    public static void main(String [] args){
        //Q.1
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the car no : ");
                int carNum = sc.nextInt();
                luckey(carNum);

        //Q.2
                System.out.println("Enter the Salary : ");
                int salary = sc.nextInt();
                if(salary>0){
                    System.out.println("Enter Apprasial Rating : ");
                    float ratting = sc.nextFloat();
                    if(ratting>=1 && ratting<=5){
                        float newSalary;
                        if(ratting>=1 && ratting<=3){
                            newSalary = salary + (salary/100f)*10;
                            System.out.println(newSalary);
                        }else if(ratting>=3.1 && ratting<=4){
                            newSalary = salary + (salary/100f)*25;
                            System.out.println(newSalary);
                        } else if(ratting>=4.1 && ratting<=5){
                            newSalary = salary + (salary/100f)*30;
                            System.out.println(newSalary);
                        }

                    }else {
                        System.out.println("Invalid Input");
                    }
                }else {
                    System.out.println("Invalid Input");
                }


        //Q3    
                System.out.println("Enter Number : ");
                int a = sc.nextInt();
                if(a>0){
                    Palindrome(a);
                } else {
                    System.out.println("Invalid Input");
                }


        //Q4
                System.out.println("Enter Starting Range : ");
                int start = sc.nextInt();
                System.out.println("Enter Ending Point : ");
                int end = sc.nextInt();
                if(start>0 && end>1 && (end-start)>=1){
                    Prime(start,end);
                }else {
                    System.out.println("Provide valid input");
                }


        //Q5    
                System.out.println("Enter Month : ");
                int month = sc.nextInt();
                if(month>=1 && month<=12){

                    if(month>=3 && month<=5){
                        System.out.println("Spring");
                    }else if(month>=6 && month<=8){
                        System.out.println("Summer");
                    } else if(month>=9 && month<=11){
                        System.out.println("Autmn");
                    }else {
                        System.out.println("Winter");
                    }

                }else {
                    System.out.println("Invalid Month");
                }
               


        //Q6
                System.out.println("Enter number of tickets : ");
                int ticketNumbers = sc.nextInt();
                if(ticketNumbers>=5 && ticketNumbers<=40){
                    System.out.println("Do you want refereshment : ");
                    char refereshment = sc.next().charAt(0);
                    if(refereshment!='y' && refereshment!='n'){
                        System.out.println("Please enter 'y  for yes or 'no' for 'n' none");
                    }else {

                        System.out.println("Do you have coupen code : ");
                        char couponCode = sc.next().charAt(0);

                        if(couponCode !='y' && couponCode !='n'){
                            System.out.println("Please enter 'y  for yes or 'no' for 'n' for none");
                        }else {
                            System.out.println("Enter the Circle : ");
                            char circle = sc.next().charAt(0);
                            if(circle!='k' && circle!='q'){
                                System.out.println("Please enter 'k' for lower class or 'q' for quality class");
                            }else {
                                ticketSystem(ticketNumbers,refereshment,couponCode,circle);
                            }
                        }
                        
                    }

                }else {
                    System.out.println("Minimum of 5 and Maximum of 40 Tickets");
                }

        //Q7    
                System.out.println("Enter the no of student placed in cse : ");
                int cse = sc.nextInt();
                if(cse>=0){
                    System.out.println("Enter the no of student placed in ece : ");
                    int ece = sc.nextInt();
                    if(ece>=0){
                        System.out.println("Enter the nu of student placed in mech : ");
                        int mech = sc.nextInt();
                        if(mech>=0){
                            if(cse>ece && cse>mech){
                                System.out.println("CSE");
                            }else if(ece>cse && ece>mech){
                                System.out.println("ECE");
                            }else {
                                System.out.println("MECH");
                            }
                        }
                        else {
                            System.out.println("Input Invalid");
                        }
                    }else {
                        System.out.println("Input Invalid");
                    }
                }else {
                    System.out.println("Input Invalid");
                }


        //Q8
            System.out.println("Enter the digits : ");
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            System.out.println(a1 + " - " + (char)a1);
            System.out.println(a2 + " - " + (char)a2);
            System.out.println(a3 + " - " + (char)a3);
            System.out.println(a4 + " - " + (char)a4);
                
        //Q9
                    System.out.println("Enter the no of pizzas bought : ");
                    int pizza = sc.nextInt();
                    System.out.println("Enter the no of puffs bought : ");
                    int puffs = sc.nextInt();
                    System.out.println("Enter the no of cool drinks bought : ");
                    int drink = sc.nextInt();

                    System.out.println("Bill Details : ");
                    System.out.println("No of pizzas : " + pizza);
                    System.out.println("No of puffs : " + puffs);
                    System.out.println("No of cool drinks : " + drink);
                    int totalPrice = (pizza*100) + (20*puffs) + (drink*10);
                    System.out.println("Total Price : " + totalPrice);

        //Q10

                  // Asking user for fuel quantity
                    System.out.print("Enter the number of liters to fill the tank: ");
                    float liters = sc.nextFloat();
                    
                    // Check for invalid input (liters should be positive)
                    if (liters <= 0) {
                        System.out.println((int)liters + " is an Invalid Input");
                        return;
                    }

                    // Asking user for distance covered
                    System.out.print("Enter the distance covered: ");
                    float distance = sc.nextFloat();

                    // Check for invalid input (distance should be positive)
                    if (distance <= 0) {
                        System.out.println((int)distance + " is an Invalid Input");
                        return;
                    }

                    // Calculating Liters per 100 KM
                    float litersPer100KM = (liters / distance) * 100;

                    // Converting KM to Miles and Liters to Gallons
                    float miles = distance * 0.6214f;
                    float gallons = liters * 0.2642f;

                    // Calculating Miles per Gallon (MPG)
                    float milesPerGallon = miles / gallons;

                    // Printing results with two decimal places
                    System.out.println("Liters/100KM");
                    System.out.printf("%.2f\n", litersPer100KM);
                    System.out.println("Miles/gallons");
                    System.out.printf("%.2f\n", milesPerGallon);


            
    }
}