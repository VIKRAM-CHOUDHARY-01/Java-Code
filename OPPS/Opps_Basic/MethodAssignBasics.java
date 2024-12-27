// OPPS Assignment - 17/12/24

/*      

What is OOPs?
OOPs (Object-Oriented Programming) is a programming paradigm based on the concept of objects, which contain data and methods.

What is a wrapper class?
A wrapper class in Java is a class that encapsulates primitive data types (e.g., Integer, Double) as objects.

What is a pure object-oriented programming language?
A pure OOP language treats everything as an object, even primitive types, with no support for primitive types or non-object functions.

What is the difference between object-oriented programming and pure object-oriented programming?
OOP supports objects and classes, but allows primitive types. Pure OOP requires everything (including basic types) to be objects.

Is Java a pure object-oriented programming language?
No, because Java supports primitive types (e.g., int, char), which are not objects.

Why is Java not a pure object-oriented programming language?
Java is not pure OOP because it allows primitive data types that are not objects.

What is the difference between a method and a function?
A method is a function associated with an object or class in OOP, while a function is a standalone block of code that performs a task.

        */

/*Q.1 A :
	method 1 :hello world  
        */

   class A{
    void show(){
        System.out.println("Hello");
    }
   }

/*Q.2 
    A :
	method1 :
	method2 :
                */

    class A1{
        void m1(){
            System.out.println("Hello");
        }
        void m2(){
            System.out.println("Bye");
        }
    }

/*Q.3
            A :
                method one 
            B:
                method one 
            C:
                method three
            D:
                method four     */

         class A2{
            void me1(){
                System.out.println("Class AMethod 1");
            }
        }
        class B1{
            void m2(){
                System.out.println("Class B Method 2");
            }
        }
        class C1{
            void m3(){
                System.out.println("Class C Method 3");
            }
        }

        class D1{
            void m4(){
                System.out.println("Class D Method 4");
            }
        }

/*Q4
        user input : 

            class A:
                add()
                sub()
                div()
                multi() 

            class B
                even()

            class C 
                odd ()      */

        
         class A7{
            int add(int a, int b){
                return (a+b);
            }
            int sub(int a, int b){
                return (a-b);
            }
            int multi(int a, int b){
                return (a*b);
            }
            double div(int a, int b){
                if(b==0){
                    System.out.println("Error");
                    return 0;
                } else {
                    return (a/b);
                }
            }
        }

        class B7{
            String even(int a){
                if(a%2==0){
                   return "It's Even";
                }
                else {
                    return "It's Odd";
                }
            }
        }

        class C7{
            String odd(int a){
                if(a%2!=0){
                   return "It's Odd";
                } else {
                    return "It's even";
                }
            }
        }



             

   public class MethodAssignBasics{
    public static void main(String [] args){
        //Q1
                A obj = new A();
                obj.show();

        //Q2

                A1 ob = new A1();
                ob.m1();
                ob.m2();

        //Q3    
                A2 o = new A2();
                o.me1();
                B1 o1 = new B1();
                o1.m2();
                C1 o2 = new C1();
                o2.m3();
                D1 o3 = new D1();
                o3.m4();


        //Q4
                  A7 last = new A7();
                System.out.println("The add : " + last.add(5,6));
                System.out.println("The sub : " + last.sub(15,6));
                System.out.println("The multi : " + last.multi(5,6));
                System.out.println("The div : " + last.div(25,5));

                B7 last1 = new B7();
                System.out.println(last1.even(10));

                C7 last2 = new C7();
                System.out.println(last2.odd(11));

                



        
        }
   }