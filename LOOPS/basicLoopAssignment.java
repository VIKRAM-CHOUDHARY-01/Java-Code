import java.util.*;
public class basicLoopAssignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Assignment - 13/12/24
        //while loop: 
            //1)1---->100
            int i=1;
            while(i<=100){
                System.out.println(i);
                i++;
            } 
            //2)100---->1
            int j =100;
            while(j>0){
                System.out.println(j);
                j--;
            }
            //3)1---->100 even numbers print 
            System.out.println("Even Numbers : ");
            int k = 1;
            while(k<=100){
                if(k%2==0){
                    System.out.println(k);
                }
                k++;
            }
            //4) 100--->1 even number 
            System.out.println("Even Numbers : ");
            int l = 100;
            while(l>0){
                if(l%2==0){
                    System.out.println(l);
                }
                l--;
            }
            //5)1---->100 odd numbers 
            System.out.println("Odd Numbers : ");
            int m=1;
            while(m<=100){
                if(m%2!=0){
                    System.out.println(m);
                }
                m++;
            }
            //6)50---->500 number print 
            int n=50;
            while(n<=500){
               
                    System.out.println(n);
                
                n++;
            }

            //7)500--->50 number print
             int p=500;
            while(p>=50){
               
                    System.out.println(p);
                
                p--;
            }
            //8)50--->1000 even number 
            System.out.println("Even : ");
            int q=50;
            while(q<=1000){
                if(q%2==0){
                    System.out.println(q);
                }
                q++;
            }
            //9)user input  
            //34-----67
            System.out.println("Enter two number : ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            while(u<=v){
                System.out.println(u);
                u++;
                }
            //10)random two 34-->67
                // even number 
                System.out.println("Enter Two Numbers  :  ");
                int w = sc.nextInt();
                int x = sc.nextInt();
                System.out.println("Even Numbers : ");
                while(w<=x){
                    if(w%2==0){
                        System.out.println(w);
                    }
                     w++;
                }
            //11) odd number

                System.out.println("Enter Two Numbers  :  ");
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println("Odd Numbers : ");
                while(y<=z){
                    if(y%2!=0){
                        System.out.println(y);   
                    }
                    y++;
                }

            //12)1--->10 sum (addition) 
            int a=1;
            int sum=0;
            while(a<=10){
                sum+=a;
                a++;
            }
            System.out.println("The Sum is 1--->10 : " + sum);

            //13)2 table print
            int b = 1;
            while(b<=10){
                System.out.println(b*2 + "\t" );
                b++;
            }
            //14)user input table
            System.out.println("Enter number to get its table : ");
            int c = sc.nextInt();
            int d = 1;
            while(d<=10){
                System.out.println(d*c + "\t" );
                d++;
            }
            //15) 3 4 5 6 7 8 9 10 table print (nested while)
                // type2: 
                // 5 ----9 table 
                int e;
                int f = 5;
                while(f<=9){
                    e=1;
                    while(e<=10){
                        System.out.println(e*f + "\t");
                        e++;
                        }
                        f++;
                }

            //16) 1-->100 (7 and 3 k multiple se divisible ho)
           
            int g=1;
            while(g<=100){
                if(g%7==0 && g%3==0){
                    System.out.println(g);
                }
                g++;
            }
            //18) divide number both 5 and 11 (1---->100)

            int h=1;
            while(h<=100){
                if(h%5==0 && h%11==0){
                    System.out.println(h);
                }
                h++;
            }

             //19) 2 table opposite print
            int j1 = 20;
            while(j1>=1){
                System.out.println(j1*2 + "\t");
                j1--;
            }

            //20) 100--->1 (n or m k multiple se divisible ho) 
            System.out.println("Enter Number : ");
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();

            int i1=100;
            while(i1>=1){
                if(i1%n1==0 && i1%m1==0){
                    System.out.println(i1);
                }
                i1--;
            }

           
            //21) // constant : 
                    // 2 X 1 =2 
                    // user input : 
                    // 9 X 1 = 9 
            
            System.out.println("Enter Number : ");
            int num1 = sc.nextInt();
            int constant = 2;
            int result = constant * num1;
            System.out.println(num1 + " X " + constant + " = " + result);

            //22) 1--->100 even number sum 
            int num2 = 1;
            int sum1=0;
            while(num2<=100){
                if(num2%2==0){
                    sum1 +=num2;

                }
                num2++;
            }
            System.out.println("The even sum is : " + sum1);

              //22) 1--->100 odd number sum 
            int num3 = 1;
            int sum2=0;
            while(num3<=100){
                if(num3%2!=0){
                    sum2 +=num3;

                }
                num3++;
            }
            System.out.println("The even sum is : " + sum2);


                
            
    }
}