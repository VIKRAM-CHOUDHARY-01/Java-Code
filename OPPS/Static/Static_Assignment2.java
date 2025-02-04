//Static Topic Assignment 2  - 04.02.25
import java.util.*;
    /*  Q.1
            class 
                static class 
                    method :non-static :no return and no argument  

            access  */

                class A{
                    static class B{
                        void show(){
                            System.out.println("Hello from a non-static method in a nested static class");
                        }
                    }
                }


    /*  Q.2

            class 
                static class 
                    method :static :covariant return type 
                    method :return and argument  

            access      */


                class C{
                    static class D{
                        static D show(){
                            return new D();
                        }
                        String show1(String s){
                            return s;
                        }
                    }
                }

    /*  Q.3 

            class 
                static class :
                    method :return and no argument 

                class :
                    method :return and argument 

            access  */

                class E{
                    static class F{
                        String m1(){
                            return "Reutrn and no argument method in nested class";
                        }
                        class G{
                            String m2(){
                                return "Return and argument method in nested class's inner class";
                            }
                        }
                    }
                }
    
    /*  Q4

            class 
                abstract class 
                        method :no return and no argument 
                static class
                        method : no return and  argument 

                interface 
                        method :return and no argument 
                
                class 
                        method : return and  argument

            access      */

                class H{
                    abstract class I{
                        void m1(){
                            System.out.println("Normal method in abstract class");
                        }
                    }
                    static class J{
                        void m2(int a){
                            System.out.println("No return and argument method in static class : " + a );
                        }
                    }
                    interface K{
                        default String m3(){
                            return "Return and no argument method in interface";
                        }
                       
                    }
                    class L{
                        String m4(String s){
                            return s;
                        }
                    }
                }

    /*  Q5  
            interface 
                return and argument :define method through private , default , static 

            access      */

                interface M{
                    private int m1(int a){
                        return a;
                    }
                    static String m2(String name){
                        return name;
                    }
                    default int[] m3(int []a){
                        return a;
                    }

                    default int accessM1(int b){
                        return m1(b);
                    }
                }   

    /*  Q6  
            class 
                non-static variable 
                static block :inside access non-static variable     */

                // class N{
                //     int a = 34;
                //     static{
                //         System.out.println(a); // will give error
                //     }
                // }
    /*  Q7
            class 
                static variable 
                static block :inside access static variable     */

                class O{
                    static int a = 35;
                    static{
                        System.out.println(a);
                    }
                }

    /*  Q.8

                multilevel inheritance :
                A
                A()
                {}
                static

                B
                A()
                {}
                static


                C
                A()
                {}
                static

                D
                A()
                {}
                static              */


                 class P{
                    P(){
                        System.out.println("Hello from A constructor class P -> 6");
                    }
                    {
                        System.out.println("Hello From Anonymous Block class P -> 5");
                    }
                    static{
                        System.out.println("Hello from Static Block class P -> 1");
                    }
                 }  
                 class Q extends P{
                  Q(){
                    super();
                  }
                      {
                        System.out.println("Hello From Anonymous Block class Q - > 7");
                    }
                    static{
                        System.out.println("Hello from Static Block class Q -> 2");
                    }
                   
                 }
                 class R extends Q{
                 R(){
                    super();
                 }
                  {
                        System.out.println("Hello From Anonymous Block class R -> 8");
                    }
                    static{
                        System.out.println("Hello from Static Block class R -> 3");
                    }
                  
                 }
                 class S extends R{
                    S(){
                        super();
                    }
                       {
                        System.out.println("Hello From Anonymous Block class S -> 9");
                    }
                    static{
                        System.out.println("Hello from Static Block class S -> 4");
                    }
                 }


        /*  Q9

                    class 
                        four static blocks 

                    Main class :static block    */

                    class T{
                        static{
                            System.out.println("Static Block 1 from T");
                        }
                         static{
                            System.out.println("Static Block 2 from T");
                        }
                         static{
                            System.out.println("Static Block 3 from T");
                        }
                         static{
                            System.out.println("Static Block 4 from T");
                        }
                    }

        /*Q10

                class 
                    four methods :static 

                    two static block    */


                    class U{
                        
                    
                        static void m3(){
                            System.out.println("Static Method 3 from U");
                        }
                        static void m4(){
                            System.out.println("Static Method 4 from U");
                        }
                        static{
                            System.out.println("First Static block of U");
                        }
                         static void m1(){
                            System.out.println("Static Method 1 from U");
                        }
                        static void m2(){
                            System.out.println("Static Method 2 from U");
                        }
                          static{
                            System.out.println("Second Static block of U");
                        }

                    }

        /*  Q11
                class 
                    non-static variable 
                    static method

                access  */

                    // class V{
                    //    int a = 34;
                    //     static void show1(){
                    //         System.out.println("Static Method 1 from V" + a);
                    //     }
                    // }

                    //can't access the non static variable in static method

        /*Q12  
                class 
                    static variable 
                    static method

                access  */

                class W{
                    static int b = 34;
                    static void show1(){
                        System.out.println("Static Method 1 from W" + b);
                    }
                }








                        public class Static_Assignment2{
                            static{
                                System.out.println("Static Block 1 from Static_Assignment2(Main) class ");
                            }
                            public static void main(String [] args){
                                //Q.1
                                        A.B obj=  new A.B();
                                        obj.show();

                                //Q.2   
                                        System.out.println(C.D.show());

                                        C.D ob = new C.D();
                                        System.out.println(ob.show1("Hello"));

                                //Q.3
                                        E.F obj1 = new E.F();
                                        System.out.println(obj1.m1());

                                        E.F.G obj2 = obj1.new G();
                                        System.out.println(obj2.m2());

                                //Q.4

                                        // H obj3 = new H();
                                        // H.I innerObj3 = obj3.new I();
                                        // innerObj3.Obj3();
                                        //will give error : abstract class can not be initiated


                                        /* only two way to access it : either I make an anonymous inner class, or i extend that abstract class.*/
                                        //abstract class
                                        H obj3 = new H();
                                        H.I innerObj3 = obj3.new I(){};
                                        
                                        //static class
                                        H.J obj4 = new H.J();
                                        obj4.m2(345);

                                         /* Interface's method can not be accessed without I implement it into some other class or i need to create an inner anonymous class */
                                        //absract class
                                         H.K obj5 = new H.K(){};
                                         System.out.println(obj5.m3());

                                         //normal class

                                         H.L obj6 = obj3.new L();
                                         System.out.println(obj6.m4("Return and argument method in class"));

                                //Q5
                                        M obj7 = new M(){};
                                        System.out.println(obj7.accessM1(4));
                                        System.out.println(M.m2("Vikram Kumar Choudhary"));
                                        int a[] = {35,6,64,6,3};
                                        System.out.println(Arrays.toString(obj7.m3(a)));


                                //Q.6
                                        // new N();

                                //Q7
                                        new O();

                                        System.out.println("\n------------------------------------------------------------\n");

                                //Q.8
                                        new S();
                                         System.out.println("\n------------------------------------------------------------\n");

                                //Q9
                                        new T();
                                         System.out.println("\n------------------------------------------------------------\n");


                                //Q10
                                        U.m1();
                                        U.m2();
                                        U.m3();
                                        U.m4();
                                        // new U();

                                        // static block can also be executed when we call static method

                                //Q11
                                       
                                        //  V.show1();

                                //Q12
                                        W.show1();
                                        





                            }
                        }