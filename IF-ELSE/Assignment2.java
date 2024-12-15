import java.util.*;
public class Assignment2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    //Assignment2 - 12/12/24 
        //1)C program to find out whether a given year is a leap year or not:
                    System.out.println("Enter Year : ");
                    int year = sc.nextInt();
                    if(year%4==0){
                        System.out.println("It's a Leap Year");
                    } else {
                        System.out.println("It's not a Leap Year");
                    }
        //2) C program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit
            // celsius 
            // f---->c 
            // fahrenheit
            // c---f 

                    System.out.println("Enter 1 to convert celcuis to fegrenheit or 2 to convert vica versa: ");
                    int opt = sc.nextInt();
                    if(opt==1){
                        System.out.println("Enter temperature in celsius: ");
                        int cel = sc.nextInt();
                        int fer = (cel * (9/5)) + 32;
                        System.out.println("In Ferehnight : "+ fer);

                    } else if(opt==2){
                        System.out.println("Enter temperature in fahrenheit: ");
                        int fer = sc.nextInt();
                        int cel = (fer-32)*5/9;
                        System.out.println("Temperatue in Celcuis is : " + cel);

                    }else {

                        System.out.println("Please enter Valid Option");

                    }

        //3)3)Check whether the trainge , square , reactanlge (area & volume)
            // ->input area /volume 
            // area 
            // traingle square rectangle 
            // square

                    System.out.println("Enter 1 for triangle or 2 for square or 3 for reactangle : ");
                    int option = sc.nextInt();
                    if(option==1){
                        System.out.println("Enter base and height of triangle: ");
                        int base = sc.nextInt();
                        int height = sc.nextInt();
                        int area = (base*height)/2;
                        System.out.println("Area of Triangle is : "+ area);
                        int volume = (base*height*height)/6;
                        System.out.println("Volume of Triangle is : "+ volume);
                    } else if(option==2){
                        System.out.println("Enter side of square: ");
                        int side = sc.nextInt();
                        int area = side*side;
                        System.out.println("Area is :  " + area);

                    } else if(option==3){
                        System.out.println("Enter length and breadth of rectangle: ");
                        int length = sc.nextInt();
                        int breadth = sc.nextInt();
                        int area = length*breadth;
                        System.out.println("Area is : " + area);

                    } else{
                        System.out.println("Please enter valid option");
                    }
        
        //4)java program to check whether a character is an alphabet or not
            // input =a =alpha 
            // digit :
            // 3 =this is a digit 

                System.out.println("Enter a Character : ");
                char chr = sc.next().charAt(0);
                if(chr>='a' && chr<='z' || chr>='A' && chr<='Z'){
                    System.out.println("It's an Alphabate");
                } else if(chr>='0' || chr<='9'){
                    System.out.println("It a Digit");
                } else {
                    System.out.println("Its a Special Character");
                }

        //Q.5 C program to enter student marks and find percentage and grade
            // A college has the following rules for the grading system:
            // 5 marks (grade + %)
            // 1. Below 25 – F
            // 2. 25 to 45 – E
            // 3. 45 to 50 – D
            // 4. 50 to 60 – C
            // 5. 60 to 80 – B 
            // 6. Above 80 – A

                System.out.println("Enter Your Marks : ");
                int mark = sc.nextInt();
                if(mark<=25){
                    System.out.println("F");
                } else if(mark>25 && mark<45){
                    System.out.println("E");
                }
                else if(mark>=45 && mark<50){
                    System.out.println("D");
                }
                else if(mark>=50 && mark<60){
                    System.out.println("C");
                }
                else if(mark>=60 && mark<80){
                    System.out.println("B");
                }
                else if(mark>=80 && mark<=100){
                    System.out.println("A");
                }
        // 6)Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
            // ->meter ===>cm 
            // mid 
            // low 
            // high 

                System.out.println("Enter Height in CentiMeter : ");
                int cm = sc.nextInt();
                float meter = (cm/100f);
                if(meter<1.5){
                    System.out.println("Low");
                    }
                    else if(meter>=1.5 && meter<1.7){
                        System.out.println("Mid");
                        }
                        else if(meter>=1.7){
                            System.out.println("High");
                            }

        //7) Write a java program to read the roll no, name,fnname and marks of three subjects and calculate the total, percentage and division.
                // Test Data :
                // Input the Roll Number of the student :784
                // student name : 
                // fname:
                // mname:
                // address:
                // contact:
                // Input the marks of Physics, Chemistry and Computer Application : 70 80 90
                // total: 
                // precentage : % 
                // division:



    }
}