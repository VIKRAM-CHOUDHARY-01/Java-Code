import java.util.*;
public class Assignment4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Assignment3 - 12/12/24 
                //1)write a program to read a week day number and print weekday name using switch 
                    // eg 1 =>sunday 
                    // 1 sunday

                    System.out.println("Enter Week Day : ");
                    int weekDay = sc.nextInt();
                    switch(weekDay){
                        case 1 : 
                            System.out.println("Sunday");
                            break;
                        case 2 :
                            System.out.println("Monday");
                            break;
                        case 3 : 
                            System.out.println("Tuesday");
                            break;
                        case 4 :
                            System.out.println("Wednesday");
                            break;
                        case 5 :
                            System.out.println("Thursday");
                            break;
                        case 6 :
                            System.out.println("Firday");
                            break;
                        case 7 :
                            System.out.println("Saturday");
                            break;
                        default :
                            System.out.println("Invalid Week Day");
                    }


                //2) write a program to read gender (M/F) and print the corresponding gender using a switch statement
                    
                    System.out.println("Enter (M/F) : ");
                    char gen = sc.next().charAt(0);
                   switch(gen){
                    case 'M' :
                        System.out.println("Male");
                        break;
                    case 'F' :
                        System.out.println("Female");
                        break;
                    case 'm' :
                        System.out.println("Male");
                        break;
                    case 'f' :
                        System.out.println("Female");
                        break;
                    default :
                        System.out.println("Invalid Option");
                   }

                //3) write a program to check whether the number is even or odd 
                    // type1: 1 even number 
                    // 2 :odd number 

                    // type2: e =>even number 
                    // o=>odd number

                    System.out.println("Enter Number to check if it's odd or even : ");
                    int num = sc.nextInt();
                    int check = num%2 == 0 ? 1 : 2;
                    switch(check){
                        case 1 :
                            System.out.println("It's Even");
                            break;
                        case 2 :
                            System.out.println("It's Odd");
                            break;
                        default :
                        System.out.println("Invalid Option");
                    }

                    System.out.println("Again enter number to check if it's even or odd : ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    char check2 = n%2==0 ? 'e' : 'o';
                    switch(check2){
                        case 'e' :
                            System.out.println("It's Even");
                            break;
                        case 'o' :
                            System.out.println("It's Odd");
                            break;
                        default :
                        System.out.println("Noopes");
                    }

                //4) write a program to create a simple calculator 
                    // a b + 
                    // a+b

                    System.out.println("Enter Number : ");
                    int num12 = sc.nextInt();
                    System.out.println("Enter Number : ");
                    int num123 = sc.nextInt();
                    System.out.println("Enter Operation you want (+,-,*,/) : ");
                    char ope = sc.next().charAt(0);
                    switch(ope){
                        case '+' :
                            int sum = num12 +num123;
                            System.out.println("Sum of two number is : "+sum);
                            break;
                        case '-' :
                            int sub = num12 - num123;
                            System.out.println("Sub of two number is : "+sub);
                            break;
                        case '*' :
                            int mul = num12 * num123;
                            System.out.println("Mul of two number is : "+mul);
                            break;
                        case '/' :
                            if(num123 != 0)
                            {
                                int div = num12/ num123;
                                System.out.println("Div of two number is : "+div);
                                break;
                                }
                                else {
                                    System.out.println("Not divisible");
                                    break;
                                }
                        default : 
                        System.out.println("Invalid Operation");
                                
                    }
                //5)write a program to check whether a person is eligible or not for vote
                    // v :check voter id valid or not 

                    System.out.println("Enter your age to know if you are eligible to vote or not : ");
                    int ag = sc.nextInt();
                    int eligiblity = ag>= 18 ? 1 : 2;
                    switch(eligiblity){
                        case 1 :
                            System.out.println("You are eligible to vote");
                            break;
                        case 2 :
                            System.out.println("You are not eligible to vote");
                            break;
                        default :
                        System.out.println("Something is fishy here...");
                    }
                //6) write a program to check month ? 
                    // 12 month 
                    System.out.println("Enter Number of Month : ");
                    int m = sc.nextInt();
                    switch(m){
                        case 1 :
                            System.out.println("Janaury");
                            break;
                        case 2 :
                            System.out.println("February");
                            break;
                        case 3 :
                            System.out.println("March");
                            break;
                        case 4 :
                            System.out.println("April");
                            break;
                        case 5 :
                            System.out.println("May");
                            break;
                        case 6 :
                            System.out.println("June");
                            break;
                        case 7 :
                            System.out.println("July");
                            break;
                        case 8 :
                            System.out.println("August");
                            break;
                        case 9 :
                            System.out.println("September");
                            break;
                        case 10 :
                            System.out.println("October");
                            break;
                        case 11 :
                            System.out.println("November");
                            break;
                        case 12 :
                            System.out.println("December");
                            break;
                        default : 
                            System.out.println("Not a Valid Month Number");
                        
                    }

                //7)a p e o f r l 
                    // a=armstrong number 
                    // p =prime number 
                    // e =even 
                    // o =odd 
                    // f =factorial 
                    // r =reverse 
                    // l =fibonacci 
                    // t =perfect number 
                    // n =neon number 
                    // w =leap year 
                    // s =swap one way 
                    // v =vowel and consonant 

                    System.out.println("Enter a = armstrong number, p =prime number,     e =even,    o =odd,     f =factorial,       r =reverse,    l =fibonacci,    t =perfect number,      n =neon number,     w =leap year,   s =swap one way,    v =vowel and consonant ");
                    char opt = sc.next().charAt(0);
                    switch(opt){
                        case 'a':
                            System.out.println("Enter a Number to check if it's armstrong number or not : ");
                            int anum = sc.nextInt();
                            int rem;
                            int arm=0;
                            int temp = anum;
                            while(anum>0){
                                rem = anum%10;
                                arm = arm + rem*rem*rem;
                                anum = anum/10;
                            }
                            if(arm == temp){
                                System.out.println("It's a Armstrong Number");
                                break;
                            } else {
                                System.out.println("It's not a Armstrong Number");
                                break;
                            }

                        case 'p' :
                            System.out.println("Enter number to check if it's Prime Number : ");
                            int pnum = sc.nextInt();
                            int count = 0;
                            for(int init = 1; init<=pnum;init++){
                                if(pnum%init==0){
                                    count++;
                                }
                            } if(count == 2){
                                System.out.println("It's a Prime Number");
                                break;
                            } else {
                                System.out.println("It's not a Prime Number");
                                break;
                            }
                        case 'e' :
                            System.out.println("Enter number to check if it's a even number : ");
                            int eenum = sc.nextInt();
                            if(eenum%2==0){
                                System.out.println("It's a even Number");
                                break;
                            } else {
                                System.out.println("It's not a even Number");
                                break;
                            }
                        case 'o' :
                            System.out.println("Enter a Number to check if it's odd : ");
                            int onum = sc.nextInt();
                            if(onum%2==0){
                                System.out.println("It's not a odd number");
                                break;
                            } else {
                                System.out.println("It's a odd number");
                                break;
                            }
                        case 'f' :
                            System.out.println("Enter number to get it's factorial : ");
                            int fnum = sc.nextInt();
                            int fact = 1;
                            while(fnum>0){
                                fact*=fnum;
                                fnum--;
                            }
                            System.out.println("The factorial is : "+ fact);
                            break;
                        case 'r' : 
                        System.out.println("Enter number to reverse it : ");
                        int rnum = sc.nextInt();
                        int rem1 = 1;
                        int rev = 0;
                        while(rnum>0){
                            rem1 = rnum%10;
                            rev = (rev*10) + rem1;
                            rnum = rnum/10;
                        } 
                        System.out.println("The Reverse is : " + rev);
                        break;

                    case 'l' :
                        System.out.println("Enter Number til you want fibonacci series : ");
                        int lnum = sc.nextInt();
                        int a1 = 0;
                        int a2 = 1;
                        int a3;
                        System.out.println(a1 + "\t" + a2 + "\t");
                        for(int init = 1;init<=lnum-2;init++){
                            a3 = a1 + a2;
                            System.out.println(a3 + "\t");
                            a1=a2;
                            a2=a3;
                        }
                        break;
                    case 't' : 
                    /*In Java, a perfect number is a positive integer that is equal to the sum of its proper divisors (divisors excluding the number itself). 
                    Example:
                    6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
                    28 is another perfect number because 1 + 2 + 4 + 7 + 14 = 28. 
                    */
                    System.out.println("Enter to check if it's a perfect number : ");
                    int pernum = sc.nextInt();
                    int per=0;
                    for(int init = 1; init<pernum;init++){
                        if(pernum%init==0){
                            per = per + init;

                        }
                    }
                    if(pernum==per){
                        System.out.println("It's a Perfect Number");
                        break;
                    } else {
                        System.out.println("It's not a Perfect Number");
                    }

                case 'n' :
                    System.out.println("Enter a number to check if its neon number : ");
                    int nnum = sc.nextInt();
                    int neo = nnum*nnum;
                    int rem2;
                    int sum=0;
                    int tem = nnum;
                    while(neo>0){
                        rem2 = neo%10;
                        sum = sum + rem2;
                        neo = neo/10;
                    }
                    if(tem == sum){
                        System.out.println("It's a Neon Number");
                        break;
                    } else {
                        System.out.println("Its not a Neon Number");
                        break;
                    }

                case 'w' :
                    System.out.println("Enter Year to check if it's a leap year : ");
                    int yes = sc.nextInt();
                    if((yes % 4 == 0 && yes % 100 != 0) || (yes % 400 == 0)){
                        System.out.println("Its a Leap Year");
                        break;
                    } else {
                        System.out.println("Its not a Leap Year");
                        break;
                    }
                case 's' : 
                    System.out.println("Enter Number for swapping : ");
                    int x1 = sc.nextInt();
                    System.out.println("Enter Number for swapping : ");
                    int y1 = sc.nextInt(); 
                     x1 = x1+y1;
                     y1 = x1-y1;
                     x1 = x1-y1;
                    System.out.println(x1 + "\t" + y1);
                    break;

                case 'v' :
                    System.out.println("Enter Number for Vowel check : ");
                    char vc = sc.next().charAt(0);
                    if((vc>='a' && vc<='z') || (vc>='A' && vc <='Z')){

                    
                    if(vc == 'a' || vc == 'e' || vc == 'i' || vc =='o' || vc=='u' || vc == 'A' || vc == 'E' || vc == 'I' || vc == 'O' ||  vc == 'U')
                    {
                        System.out.println("It's a Vowel");
                        break;
                    } else {
                        System.out.println("Its a Consonent");
                        break;
                    }
                    } else {
                        System.out.println("Its not Alphabate");
                        break;
                    }
                    
                    }
    }
}