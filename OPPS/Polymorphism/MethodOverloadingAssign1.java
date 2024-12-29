//Assignment - 26/12/24

/*   Q.1 error problem solve 

    in a class name and method name but number of parameter same 
    five methods same name add sub multi div mod 
            */

    // class A{
    //     int add(int a, int b){
    //         System.out.println("The Addition is : " + (a+b));
    //     }
    //      int add(int a, int b){
    //         System.out.println("The Substraction is : " + (a-b));
    //     }
    //      int add(int a, int b){
    //         System.out.println("The Multiplication is : " + (a*b));
    //     }
    //      int add(int a, int b){
    //         System.out.println("The Division is : " + (a/b));
    //     }

    // }
    /* Output : MethodOverloadingAssign1.java:13: error: method add(int,int) is already defined in class A
                int add(int a, int b){
                    ^
        MethodOverloadingAssign1.java:16: error: method add(int,int) is already defined in class A
                int add(int a, int b){
                    ^
        MethodOverloadingAssign1.java:19: error: method add(int,int) is already defined in class A
                int add(int a, int b){ 
                 */

                //Thus having same name and same parameter gives us method overloading problem

/*   Q.2 in a class name and method name but number of parameter change 
         five methods same name add sub multi div mod   
                */

    class B{
        void opera(int a){
            System.out.println("The Addition : " + (a+a));
        }
        void opera(int a, int b){
            System.out.println("The Substraction : " + (a-b));
        }
        void opera(int a, int b, int c){
            System.out.println("The multiplication : " + (a*b*c));
        }
        void opera(int a, int b, int c, int d){
            if((c+d)==0){
                System.out.println("Not Divisible");
            } else {
                System.out.println("The Division : " + ((a+b)/(c+d)));
            }
            
        }

    }

/*  Q.3 in a class name and method name but data type change number of parameter same 
        five methods same name add sub multi div mod 
        */

    class C{
            void operation(int a, int b) {
                System.out.println("The Addition: " + (a + b));
            }

        
            void operation(double a, double b) {
                System.out.println("The Subtraction: " + (a - b));
            }


            void operation(float a, float b) {
                System.out.println("The Multiplication: " + (a * b));
            }

            void operation(float a, int b) {
                if (b != 0) {
                    System.out.println("The Division: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
            }


            void operation(int a, double b) {
                System.out.println("The Modulus: " + (a % b));
            }
            }

/*  Q.4 in a class name and method name but number of parameter same 
    8 methods same name all prmitive data type  */

    class D{
        D(){
            System.out.println("The same name method with 8 type of primitiave data type parameters : ");
        }
        void m1(byte b){
            
            System.out.println("1. Byte Value : " + b);
        }
        void m1(short b){
            System.out.println("2. Short Value : " + b);
        }
        void m1(int b){
            System.out.println("3. Integer Value : " + b);
        }
        void m1(long b){
            System.out.println("4. Long Value : " + b);
        }
        void m1(float b){
            System.out.println("5. Float Value : " + b);
        }
        void m1(double b){
            System.out.println("6. Double Value : " + b);
        }
        void m1(char b){
            System.out.println("7. Char Value : " + b);
        }
       
        void m1(boolean b){
            System.out.println("8. The Boolean : " + b);
        }

    }
/*  Q.5 in a class name and return type method name but number of parameter same 
        five methods same name add sub multi div mod            */
        
    //      class E{
    //             int shiri(int a,int b){
    //                 System.out.println("The Addition : " + (a+a));
    //                 return a+b;
    //             }
    //             double shiri(int a, int b){
    //                 System.out.println("The Substraction : " + (a-b));
    //                 return (a-b);
    //             }
    //             long shiri(int a, int b){
    //                 System.out.println("The multiplication : " + (a*b));
    //                 return (a*b);
    //             }
    //             float shiri(int a, int b){
    //                 if(b==0){
    //                     System.out.println("Not Divisible");
    //                     return 0f;
    //                 } else {
    //                     System.out.println("The Division : " + (a/b));
    //                     return (a/b);
    //                 }
                    
    //             }

    // }

/* Output : MethodOverloadingAssign1.java:135: error: method shiri(int,int) is already defined in class E
                    double shiri(int a, int b){
                        ^
            MethodOverloadingAssign1.java:139: error: method shiri(int,int) is already defined in class E
                            long shiri(int a, int b){
                                ^
            MethodOverloadingAssign1.java:143: error: method shiri(int,int) is already defined in class E
                            float shiri(int a, int b){
                            */


                           //Thus change in return type does not solve the method overloading issue.



/*  Q.7 in a class name and methods name same (number of parameter same but name of variable different )

            */

        // class F{
        //     void show(int a){
        //         System.out.println("first : " + a);
        //     }
        //     void show(int b){
        //         System.out.println("second : " + b);
        // }
        // } 

    /* Ouptput : MethodOverloadingAssign1.java:175: error: method show(int) is already defined in class F
            void show(int b){
                 ^
1 error         */

    //Thus change in Variable name does not solve method overloading issue.


/*  Q.8 in a class name and method name but number of parameter change 
        parameter order change.     */

        class G{
            void show(int a, float b){
                System.out.println("From first : " + a + " - " + b);
            }
            void show(float b, int a){
                System.out.println("From Second : " + a + " - " + b);
            }
        } 
    
    class MethodOverloadingAssign1{

        
/*   Q.6 main method overload 
        five methods same name add sub multi div mod 
                        */

        public static void main(int a){
            System.out.println("The Addition : " + (a+a));
        }

        public static void main(int a,int b){
            System.out.println("The Substraction : " + (a-b));
        }

        public static void main(int a,int b,int c){
            System.out.println("The Multi : " + (a*b*c));
        }

        public static void main(double a, double b){
            if(b==0){
                System.out.println("Error");
            } else {
                System.out.println("The Division : " + (a/b));
            } 
        }
    
        public static void main(String[]args){
            //Q/1
                    // A obj = new A();
                    // obj.add(4,54);

            //Q/2
                    B ob = new B();
                    ob.opera(2);
                    ob.opera(40,10);
                    ob.opera(5, 10,10);
                    ob.opera(80,100,10,20);

                    System.out.println("\n--------------------------------------\n");

            //Q.3
                    C obj = new C();
                    obj.operation(2, 5);         // Addition (int, int)
                    obj.operation(4.6d, 0.6d);   // Subtraction (double, double)
                    obj.operation(5.0f, 10.0f);  // Multiplication (float, float)
                    obj.operation(40.0f, 10);    // Division (float, int)
                    obj.operation(10, 3.0);      // Modulus (int, double)

                    System.out.println("\n--------------------------------------\n");

            //Q.4

                    D pri = new D();
                    pri.m1((byte)5); //byte
                    pri.m1((short)5); //short
                    pri.m1(5); //int
                    pri.m1(5l); //long
                    pri.m1(5.1f); // float
                    pri.m1(5.3); //double
                    pri.m1('v'); // char
                    pri.m1(true); // boolean


                    System.out.println("\n--------------------------------------\n");


            //Q.5

                // E op = new E();
                // op.shiri(2,4);
                // op.shiri(2,4);
                // op.shiri(2,4);
                // op.shiri(2,4);

            //Q.6

                MethodOverloadingAssign1 mb = new MethodOverloadingAssign1();
                mb.main(45);
                mb.main(10,3);
                mb.main(10,3,5);
                mb.main(10.0,2.0);


                System.out.println("\n--------------------------------------\n");


            //Q.7

                // F av = new F();
                // av.show(2);
                // av.show(5);

            //Q.8
                
                G gv = new G();
                gv.show(1,3.3f);
                gv.show(2.3f,4);

                

                    


        }
    }