import java.util.*;
public class Assignment{
    public static void main(String[] args){
    //Assignment - 12/12/24

        //Q.1 1)voter id 
        //=>user input

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();

            if(age>=18){
                System.out.println("You are eligible to Vote");
            } else {
                System.out.println("You are not eligible to Vote");
            }

        //2)one number max a>10 
        //one number : 

            System.out.println("Enter Number : ");
            int a = sc.nextInt();
            if(a>10){
                System.out.println(a + " is bigger than 10");
            } else {
                System.out.println(a + " is smaller than 10");
            }

        //3)two number max a b 
        //a ya b dono mey se bda konsa hey 

            System.out.println("Enter a : ");
            int x = sc.nextInt();
            System.out.println("Enter b : ");
            int y = sc.nextInt();

            if(x>y){
                System.out.println(x + " is bigger than " + y);
            } else if(x==y) {
                System.out.println("Both are same");
            }
            else{
                System.out.println(y + " is bigger than " + x);
            }

        //4)three number max a b c 

            int m,l,n;
            System.out.println("Enter x: ");
            m = sc.nextInt();
            System.out.println("Enter y: ");
            l = sc.nextInt();
            System.out.println("Enter z: ");
            n = sc.nextInt();
            if(m>l && m>n){
                System.out.println(m + " is bigger than " + l + " and " + n);
            } else if(n>m && n>l){
                System.out.println(n + " is bigger than " + m + " and " + l);
            } else{
                System.out.println(l + " is bigger than " + m + " and " + n);
            }

        //5) five number max abcde
        

        //Optimized Way: 
             int num;
             int max = Integer.MIN_VALUE;

         for(int i =1;i<=5;i++){
            System.out.println("Enter Number : ");
            num = sc.nextInt();
            if(num>max){
                max= num;
            }

         }
         System.out.println("The Max is : " + max);


        //Another Way:

            // Input all 5 numbers individually
        System.out.print("Enter number 1: ");
        int a1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b1 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c1 = sc.nextInt();
        System.out.print("Enter number 4: ");
        int d1 = sc.nextInt();
        System.out.print("Enter number 5: ");
        int e1 = sc.nextInt();

        // Find the maximum manually
        int max1 = a1;
        if (b1 > max1)
        {
             max1 = b1;
        }
        if (c1 > max1) {
            max1 = c1;
        }
        if (d1 > max1) {
            max1 = d1;
        }
        if (e1 > max1) {
            max1 = e1;
        }

    System.out.println("The maximum number is: " + max1);

    //6) user 
        // -9 negative integer 
        // 5 positive integer 
        // 0 =zero 

       System.out.println("Enter Number : ");
       int num1 = sc.nextInt();
       if(num1>0){
        System.out.println("Number is Positive");
       } else if(num1<0){
        System.out.println("Number is Negative");
       } else {
        System.out.println("Number is Zero");
       }
    

    //Q.7 vowel and consonat 
    //->a e i o u vowel 
    //consonant

    System.out.println("Enter an Alphabate : ");
    char ch = sc.next().charAt(0);

    if(ch >= 'A' && ch>='a' || ch<='Z' && ch<='z'){
        if(ch=='a' ||  ch == 'e' || ch=='i' || ch == 'o' || ch=='u' && ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("It's Vowel");
        } else{
            System.out.println("Its Consonant");
        }
    } else {
        System.out.println("Please Enter an Alphabate");
    }

    //8)divisible 5 and 11 
	//a)num dono se divide ho jb process ho 
	//b)num kisi se bhi divide ho jb process ho

    System.out.println("Enter Number to check if it's Divisible to 5 or 10 : ");
    int num2 = sc.nextInt();
    if(num2%5==0 || num2%11==0){
        System.out.println("Yeah It's Divisible to 5 or 11");
    } else {
        System.out.println("No it's not divisible to any of it");
    }

    //9)upper case and lower case input by user 

    System.out.println("Enter character to know if it's Upper case or Lower case: ");
    char ch1 = sc.next().charAt(0);


    if(ch1 >= 'A' && ch1<='Z'){
        System.out.println("It's Upper Case");
    } else if( ch1>='a' && ch1<='z'){
        System.out.println("Its Lower Case");
    } else {
        System.out.println("Please Enter Valid Alphabate");
    }

    //10)if the input is the integer then check ,check number 7 or 3 k multiple se divisible hey kya 

    System.out.println("Enter Number to check if it's divisible to 7 or 3 : ");
    int num3 = sc.nextInt();
    if(num3%7==0){
    System.out.println("It's Divisible to both 7 ");
    } else if(num3%3==0){
        System.out.println("It's Divisible to both 3 ");
        
    } else {
        System.out.println("It's not divisible to both");
    }


    //11)number swap (two ways )

//First Way
    int el = 23;
    int den = 4;
    int temp = el;
    el = den;
    den = temp;
    System.out.println(el + " and " + den);

//Second Way
    el = el+den;
    den = el-den;
    el = el - den;
    System.out.println(el + " and " + den);

//12)m =you are male
//f = female 
//other   

System.out.println("Enter 'm' if you are male and 'f' for female : ");
char gender = sc.next().charAt(0);
if(gender=='m'){
    System.out.println("You are male");
} else if(gender=='f') {
    System.out.println("You are female");
} else {
    System.out.println("Enter Valid Option");
}

// 13) 
// number (WEEK DAYS)
// 1 =>sunday 
// 2 =>monday 
// 3 =>tuesday 
        System.out.println("Enter Day Number : ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter Valid Day Number");
        }

    //14 )user number 
    //check number :even odd

    System.out.println("Enter Number to check if its even or odd: ");
    int che = sc.nextInt();
    if(che%2==0){
        System.out.println("It's Even");
    } else {
        System.out.println("Its Odd");
    }


//15)
// char match 
// a =>apple 
// b :ball 
// c :cat 
// not match 

    System.out.println("Enter an Alphabate : ");
    char alph = sc.next().charAt(0);
    switch(alph){
        case 'a':
            System.out.println("Apple");
            break;
            case 'b':
            System.out.println("Ball");
            break;
            case 'c':
            System.out.println("Cat");
            break;
            default:
            System.out.println("Not Match");
                        }
            

    }
}

