// Run time Polymorphism Assignment - 4/01/25
import java.util.*;
/*  Q.1 single level inheritance :
        ->class name different and method name same then method will be overrided */

    class A{
        void show(){
            System.out.println("Hello! from Class A");
        }
    }
    class B extends A{
        void show(){
            System.out.println("Hello! from Class B");
        }
    }

/*  Q.2 class name different and method name same child k through parent method ko call krna hai used super keyword */

    class A1{
        void display(){
            System.out.println("Hell Yeah!");
        }
    }
    class B1 extends A1{
        void display(){
            super.display();
            System.out.println("Bye!");
        }
    }

/*  Q.3 class name different and method name same number of parameter :  */

    class A3{
        void Show(){
            System.out.println("YO Mister White");
        }
    }
    class B3 extends A3{
        void Show(int a, int b){
            System.out.println("The Sum is : " + (a+b));
        }
    }

/*  Q.4 class name different method name same but return type of method changed  */ 
    // class A4{
    //     void show(){
    //         System.out.println("Yo! Mister White");
    //     }
    // }
    // class B4 extends A4{
    //     int show(){
    //         return 0;
    //     }
    // }

    /*Output :      int show(){
                        ^
                        return type int is not compatible with void
                        1 error */


/*  Q.5 multi level inheritance :
        class name different and method name same then method will be overrided 
                                                                                    */

    class A5{
        void show(){
            System.out.println("Hello! Class A");
        }
    }
    class B6 extends A5{
        void show(){
            System.out.println("Hello! Class B");
        }
    }
    class B7 extends B6{
        void show(){
            System.out.println("Hello! Class C");
        }
    }

/*  Q.6 class name different and method name same child k through parent method ko call krna hai used super keyword */
    class A8{
        void show(){
            System.out.println("Hello! Class A8");
            }
    }
    class B8 extends A8{
        void show(){
            super.show();
            System.out.println("Hello! Class B8");
        }
    }
    class B9 extends B8{
        void show(){
            super.show();
            System.out.println("Hello! Class B9");
        }
    }


/*  Q.7 class name different and method name same number of parameter :*/
    
    class A9 {
        void show(int a){
            System.out.println("Hello A9 : " + a);
        }
    }
     class B10 extends A9 {
        void show(int a){
            System.out.println("Hello B10 : " + a);
        }
    }
     class B11 extends B10 {
        void show(int a){
            System.out.println("Hello B11 : " + a);
        }
    }

/*  Q8 class name different method name same but return type of method changed  */

    // class A10 {
    //     int show(){
    //         return 10;
    //         }
    // }
    // class B12 extends A10{
    //     String show(){
    //         return "Hello B12";
    //     }
    // }
    // class B13 extends B12{
    //     void show(){
    //         System.out.println("Hello B13");
    //     }
    // }

    /*  RunTimeAssign1.java:128: error: show() in B12 cannot override show() in A10
        String show(){
               ^
        return type String is not compatible with int
        RunTimeAssign1.java:133: error: show() in B13 cannot override show() in B12
                void show(){
                    ^
        return type void is not compatible with String
        2 errors
      */


/*  Q9  heirarichal level inheritance :
        ->class name different and method name same then method will be overrided   */
        
        class A11{
            void show(){
                System.out.println("Hello! A11");
            }
        }
        class B14 extends A11{
            void show(){
                System.out.println("Hello ! B14");
            }
        }
          class B15 extends A11{
            void show(){
                System.out.println("Hello ! B15");
            }
        }

/*  Q10 class name different and method name same child k through parent method ko call krna hai used super keyword     */

        class A12{
            void show(){
                System.out.println("Hello! A12");
            }
        }
        class B16 extends A12{
            void show(){
                super.show();
                System.out.println("Hello ! B16");
            }
        }
          class B17 extends A12{
            void show(){
                super.show();
                System.out.println("Hello ! B17");
            }
        }

/*  Q11 class name different and method name same number of parameter :*/

        class A13{
            void show(int a){
                System.out.println("Hello! A13 " + a);
            }
        }
        class B18 extends A13{
            void show(int a, int b){
                System.out.println((a+b));
            }
        }
          class B19 extends A13{
            void show(double a){
                System.out.println("Hello double" + a);
            }
        }
   


/*  Q12 class name different method name same but return type of method changed */
    
     //  class A13{
    //         void show(){
    //             System.out.println("Hello! A12");
    //         }
    //     }
    //     class B18 extends A13{
    //         int show(){
    //             return 0;
    //         }
    //     }
    //       class B19 extends A13{
    //         void show(){
    //             System.out.println("Hello");
    //         }
    //     }


        /* Output : error: show() in B18 cannot override show() in A13
                                int show(){
                                    ^
                    return type int is not compatible with void
                    1 error */


/*  Q13 user input 

        class A
            show():parameter :two addition 

        class B
            show():no parameter value passed :show method 

        call parent method through child class */

        class A14 {
            void show(int a, int b){
                System.out.println("The sume is : " + (a+b));
            }
        }
        class A15 extends A14{
            void show(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number : ");
                int a = sc.nextInt();
                System.out.println("Enter Number : ");
                int b= sc.nextInt();
                super.show(a,b);
            }
        }

/*  Q14 single level inheritance : parameterised constructor :super method access */
    class A16 {
        A16(int a){
            System.out.println("Hello! A16 : " + a);
        }
    }

    class B20 extends A16{
        B20(){
            super(34);
            System.out.println("Now its completed");
        }
    }

/*  Q15 multi level inheritance : parameterised constructor :super method access */
    
    class A17{
        A17(int a){
            System.out.println("Hello! A17 : " + a);
            }
    }
    class B21 extends A17{
        B21(){
            super(45);
            System.out.println("Now its completed B21");
            }
    }
    
    class C22 extends B21{
        C22(){
            super();
            System.out.println("Now its completed C22");
            }
    }


/*  Q16 heirarichal level inheritance : parameterised constructor :super method access */

    class A18{
        A18(int a){
            System.out.println("Hello A18 : " + a);
        }
    }
    class B22 extends A18{
        B22(int a){
            super(a);
            System.out.println("Hello B22 : " + a);
            }
    }
    class C23 extends A18{
        C23(int a){
            super(a);
            System.out.println("Hello C23 : " + a);
        }
    }

/*  Q17 constant :

                    A
                        two instance variable a and b 

                    B 
                        addition :through super keyword */

    class A19 {
        int a=34;
        int b = 16;

    }
    class B24 extends A19{
        void show(){
            int sum = super.a+super.b;
            System.out.println("The sum is : " + sum);
            
        }
    }


/*  Q18 user input  :

        A
            two instance variable a and b 

        B 
            addition :through super keyword */

        class A20{
           int a;
           int b;
           void setA(){
            Scanner sc =new Scanner(System.in);
            this.a = sc.nextInt();
           }
            void setB(){
            Scanner sc =new Scanner(System.in);
            this.b = sc.nextInt();
           }
        }
        class B25 extends A20{
            void sum(){
                int sum = super.a+super.b;
                System.out.println("The sum is : " + sum);
            }
        }

    public class RunTimeAssign1{
        public static void main(String [] args){
            //Q.1
                    B obj1 = new B();
                    obj1.show();

            //Q.2
                    B1 obj2 = new B1();
                    obj2.display();

            //Q.3
                    B3 obj3 = new B3();
                    obj3.Show(10, 20);

            //Q.4
                    // B4 obj4 = new B4();
                    // obj4.show();

            //Q.5
                    B7 obj5 = new B7();
                    obj5.show();

            //Q.6
                    B9 obj6 = new B9();
                    obj6.show();

            //Q7
                    B11 obj7 = new B11();
                    obj7.show(56);

            //Q8
                    // B13 obj8 = new B13();
                    // obj8.show();

            //Q9

                    B14 obj9 = new B14();
                    obj9.show();
                    B15 obj09 = new B15();
                    obj09.show();

            //Q10
                    B16 obj10 = new B16();
                    obj10.show();
                    B17 obj010 = new B17();
                    obj010.show();

            //Q12
                    // B18 obj11 = new B18();
                    // obj11.show();
                    // B19 obj011 = new B19();
                    // obj011.show();


            //Q11
                    B18 obj11 = new B18();
                    obj11.show(2,4);
                    B19 obj011 = new B19();
                    obj011.show(3.3);

            //Q.13
                    A15 obj12 = new A15();
                    obj12.show();

            //Q14
                   new B20();

            //Q15

                    new C22();    

            //Q16
                    new B22(54);
                    new C23(4); 

            //Q17
                    B24 obj13 = new B24();
                    obj13.show();         

            //Q18

                    B25 obj14 = new B25();
                    obj14.setA();
                    obj14.setB();
                    obj14.sum();
        }
    }