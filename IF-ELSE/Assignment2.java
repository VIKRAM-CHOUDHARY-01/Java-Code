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

                System.out.println("Enter The Roll Number : ");
                int roll = sc.nextInt();
                sc.nextLine();  
                System.out.println("Enter Your First Name : ");
                String fname = sc.nextLine();
                System.out.println("Enter Last Name : ");
                String lname = sc.nextLine();
                System.out.println("Enter Your Address : ");
                String address = sc.nextLine();
                System.out.println("Enter Your Mobile Number : ");
                String mob = sc.nextLine();
                System.out.println("Enter The Marks of Physics : ");
                int phy = sc.nextInt();
                System.out.println("Enter The Marks of Chemistry : ");
                int chem = sc.nextInt();
                System.out.println("Enter The Marks of Computer Application : ");
                int comp = sc.nextInt();
                float total = phy + chem + comp;
                float per = (total/300)*100;
                char div;
                if(per>=80){
                    div = 'A';
                } else if(per>=60 && per<80){
                    div = 'B';
                }
                else if(per>=40 && per<60){
                    div = 'C';
                    }
                else
                 {
                        div = 'F';
                    }

                    System.out.println("--------------------------------------Marksheet------------------------------------------");
                    System.out.println();
                    System.out.println("Roll No : " + roll);
                    System.out.println("Name : " + fname + " " + lname);
                    System.out.println("Address : " + address);
                    System.out.println("Mobile Number : " + mob);
                    System.out.println("---------------------Makrs in Subjects---------------------------------");
                    System.out.println("Physics : " + phy);
                    System.out.println("Chemistry : " + chem);
                    System.out.println("Computer Application : " + comp);
                    System.out.println("Total : " + total);
                    System.out.println("Percentage : " + per + "%");
                    System.out.println("Division : " + div);


        //8) 5 number input 
            // >40 
            // average 
            // 3. 45 to 50 – D
            // 4. 50 to 60 – C
            // 5. 60 to 80 – B
            // 6. Above 80 – A 
            // otherwise fail 
            // -------------------------------

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
    // 9)three number max used only if else 

            System.out.println("Enter three number to get the max : ");
            int anum = sc.nextInt();
            int bnum = sc.nextInt();
            int cnum = sc.nextInt();
            if(anum>bnum && anum>cnum){
                System.out.println(anum + " is Max");
            }
            else if(bnum>anum && bnum>cnum){
                System.out.println( bnum + " is Max");

            } else {
                System.out.println(cnum + " is Max");
            }

    //11) // salalry :
            // holidays (1) =full salary 
            // 2-5 =5% 
            // 5-14 =10% 
            // 15 =50% 
            // else =not salary 
            //             output : 
            // name:
            // address: 
            // bank details: 
            // salary : 
            // alot :
            //  holidays 


            sc.nextLine();
            System.out.println("Enter Name : ");
            String empName = sc.nextLine();
            System.out.println("Your Address : ");
            String empAdd = sc.nextLine();
            System.out.println("Bank Name : ");
            String empBank = sc.nextLine();
            System.out.println("Your Salary : ");
            int empSalary = sc.nextInt();
            System.out.println("Enter Holidays : ");
            int empHolidays = sc.nextInt();
            int empTotalSalary=0;
            if(empHolidays==1){
                empTotalSalary=empSalary;
                
            } else if(empHolidays>1 && empHolidays<=5){
                empTotalSalary = empSalary - ((empSalary/100)*5);
            } else if(empHolidays>5 && empHolidays<=14){
                empTotalSalary = empSalary - ((empSalary/100)*10);
            }
            else if(empHolidays>=15){
                empTotalSalary = empSalary - ((empSalary/100)*50);
            }

            System.out.println("----------------------Your Salary Details----------------------------------------");
            System.out.println();
            System.out.println("Name : " + empName);
            System.out.println("Address : " + empAdd);
            System.out.println("Bank Details : " + empBank);
            System.out.println("Salary : " + empSalary);
            System.out.println("Holidays : " + empHolidays);
            System.out.println("Your Final Salary : " + empTotalSalary);


    //12) electric city bill : 
            // 4 unit 
            // 40 
            // 1- 10 = 10% 
            // 11-20 =15% 
            // 21-40 =30% 
            // 50 =50% 

            // output : 
            // name:
            // unit :3 
            // amout 30 
            // discout : 10% 
            // total pay amount : 


            System.out.println("Enter Your Cost Unit : ");
            int unit = sc.nextInt();
            int bill=0;
            if(unit<=10){
                bill = 40;
                }
                else if(unit>10 && unit<=20){
                    bill = 40 - ((40/100)*10);
                    }
                    else if(unit>20 && unit<=40){
                        bill = 40 - ((40/100)*15);
                        }
                        else if(unit>40 && unit<=50){
                            bill = 40 - ((40/100)*30);
                            }
                            else if(unit>50){
                                bill = 40 - ((40/100)*50);
                                }

                                System.out.println("Your Bill Amount : " + bill);


    //13)retailer 
        // customer 
        // retailer : 
        // 1-15 peices =15% 
        // 16-30 =30% 
        // 31-50 =50% 

        // output : 
        // reailer name :asish kumar 
        // peicies : 30 
        // discount : 
            sc.nextLine();
            System.out.println("Customer Name : ");
            String custName = sc.nextLine();
            System.out.println("Enter Your Peices : ");
            int peices = sc.nextInt();
            int bill1 = 100*peices;
            int discount=0;
            if(peices<=15)
            {
               discount=(bill1/100)*15;
               bill1 = bill1 - ((bill1/100)*15);
                }
            else if(peices>15 && peices<=30)
            {
                    discount=(bill1/100)*30;
                      bill1 = bill1 - ((bill1/100)*30);
                    }
            else if(peices>30 && peices<=50)
            {
                      discount=(bill1/100)*50;
                      bill1 = bill1 - ((bill1/100)*50);

                        }

            System.out.println("Retailer Name : Aashish Kumar");
            System.out.println("Peices : " + peices);
            System.out.println("Discount : " + discount);
            System.out.println("Final Total : " + bill1);

    //14)customer  : 
                // 1000 to 2000 -10% 
                // 100-1000 -5% 
                // 2000--3000 =15% 
                // 3000< 30% 
                // sout("---------------------");
                // output : 
                // customer name : 
                // contact number : 
                // payment : 
                // discout : 
                // total payment 

            
            System.out.println("Customer Name : ");
            String customerName = sc.nextLine();
            System.out.println("Customer Contact Number : ");
            String contactNumber = sc.nextLine();
            System.out.println("Enter Your Payment : ");
            int payment = sc.nextInt();
            int discount1=0;
            int finalTot=0;
            if(payment>=1000 && payment<=2000){

                discount1 = ((payment/100)*10);
                finalTot  = payment - ((payment/100)*10);

            } else if(payment<1000 && payment>=100){

                discount1 = ((payment/100)*5);
                finalTot = payment - ((payment/100)*5);

            } else if(payment>=2000 && payment<=3000){

                discount1 = ((payment/100)*15);
                finalTot = payment - ((payment/100)*15);

            } else if(payment>3000){

                discount1 = ((payment/100)*30);
                finalTot = payment - ((payment/100)*30);
            } 

            System.out.println("-----------------------------Bill----------------------------------------------");
            System.out.println();
            System.out.println("Customer Name : "+ customerName);
            System.out.println("Contact Number : " + contactNumber);
            System.out.println("Your Payment : " + payment);
            System.out.println("Your Discount : " + discount1);
            System.out.println("Your Final Payment : " + finalTot);




    }
}