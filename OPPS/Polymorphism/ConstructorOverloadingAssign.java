//Assignment Constructor Overloaidng : 27/12/24

/*  Q1. constructor overloading :
        A
        */

                //    class A{
                //     A(){
                //         System.out.println("Hello");
                //     }
                //     A(){
                //         System.out.println("Bye");
                //     }
                //    }

        /*Output :->  ConstructorOverloadingAssign.java:11: error: constructor A() is already defined in class A
            A(){
            ^
            1 error     */

        //Thus Constructor is overloaded by having same name and same parameter.


/*  Q.2 A 
        constructor overloading :problem solve  */

        class A{
            A(){
                System.out.println("Hello");
            }
            A(String s){
                System.out.println(s);
            }
        }

/*  Q.3  constructor chaining :
            A() 1 :1---5
            A() 2 :first 2---6
            A() 3 :
            A() 4 :4--3
            A() 5 :5--4
            A() 6 :6---1
                                */
        
        class C{
                    C(){
                        this("Hello - Constructor 5");
                        System.out.println("Constructor 1: ");
                    }

                    C(int a){
                        this(3.4f);
                        System.out.println("Constructor 2 : " + a);
                    }
                    C(double d){
                        System.out.println("Constructor 3 :" + d);
                    }
                    C(char c){
                        this(4.5d);
                        System.out.println("Constructor 4 : " + c);
                    }
                    C(String s){
                        this('A');
                        System.out.println("Constructor 5 : " + s);
                    }
                    C(float f){
                        this();
                        System.out.println("Constructor 6 : " + f);
                    }
                }


/*  Q4    single level :

            class A
            method1  :return and argument
            method2 :return and no argument

            class B 

            refrence variable B k through all properties access (not include B properties)      */

            class A1{
                int m1(int a){
                    return a;
                }

                String m2(){
                    return "Hello!";
                }
            }
            class B1 extends A1{
                void m3(){
                    System.out.println("bYE");
                }
            }

/*  Q5      Multilevel :

            A

            B

            C

            D

            refrence variable D k through all properties access (not include D properties)      */

            class A2{
                void m1(){
                    System.out.println("class A2");
                }
            }
            class B2 extends A2{
                void m2(){
                    System.out.println("class B2");
                }
            }
            class C2 extends B2{
                void m3(){
                    System.out.println("Class C3");
                }
            }
            class D2 extends C2{
                void m4(){
                    System.out.println("Class D2");
                }
            }

/*  Q.6     heirarichal :
            A

            B

            C 

            B k through A(not include B)

            C k through A(not include C)        */

            class A3{
                void m1(){
                    System.out.println("Method 1");
                }
            }
            class B3 extends A3{
                void m2(){
                    System.out.println("Method 2");
                }
            }
            class C3 extends A3{
                void m3(){
                    System.out.println("Method 3");
                }
            }



       public class ConstructorOverloadingAssign{
        public static void main(String [] args){

            //Q.1
                    // A obj = new A();

            //Q.2
                    new A();
                    new A("Bye");

                    System.out.println("\n----------------------------------------------\n");

            //Q.3

                    new C();

                    System.out.println("\n----------------------------------------------\n");

            //Q.4
                    A1 limit = new B1();
                    System.out.println("Class A1 m1 : " + limit.m1(45));
                    System.out.println("Class A1 m2 : " + limit.m2());
                    // limit.m3(); -> Could not be accessed since reference variable has given more priority than object.
                     
                     
                    System.out.println("\n----------------------------------------------\n");

            //Q.5

                    C2 singh = new D2();
                    singh.m1();
                    singh.m2();
                    singh.m3();
                    // singh.m4(); -> Can not access D2 method since priority is given to reference variable class type instead of Object.

                    System.out.println("\n----------------------------------------------\n");

            //Q.6   

                    A3 ref = new B3();
                    ref.m1();

                    A3 ref1 = new C3();
                    ref1.m1();


        
        }
       }
