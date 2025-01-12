//Assignment ->  10/01/25

/*  Q.11    class 
                interface 

                interface 

            access */

        class A{
            interface B{
                void m1();
            }
            interface C{
                void m2();
            }
        }
        class D extends A implements A.B, A.C{
            public void m1() {
                System.out.println("nice");
            }
            public void m2(){
                System.out.println("guys");
            }
        }

/*  Q12 interface 
                interface 
                    class 

            access */

        interface E{
            interface F{
                class G{
                    void method(){
                        System.out.println("James Gosling");
                    }
                }
            }
        }
        class I extends E.F.G {}

/*  Q13 class 
            interface 
                class 

        access */

        class H {
            interface J {
                class K{
                    void method(){
                        System.out.println("I.A.S");
                    }
                }
            }
        }

        class L extends H.J.K{}
/*  Q14 class
            interface 
                interface 

        access  */

        class M{
            interface N{
                interface P{
                    void m1();
                }
            }
        }
        class Q implements M.N.P{
            public void m1(){
                System.out.println("Small message for chatGPT to help me out to clear my confusion is my answers are right or not : you are best!");
            }
        }

/*  Q15
        interface 
            abstract class 


        access */

        interface R{
            abstract class S{
                abstract void meth();
                public void meth2(){
                    System.out.println("Normal method in interface's abstract class");
                }
            }
        }
        class T extends R.S{
            public void meth(){
                System.out.println("does it worked");
            }
        }

/*  Q16 abstract class 
            interface

        access */

        abstract class U{
            interface V{
                void meth();
            }
        }
        class W implements U.V{
            public void meth(){
                System.out.println("Kuch bhi...");
            }
        }

/*  Q17 abstract class 

        interface 

        both access in one class */

        abstract class X{
            abstract void m1();

        }
        interface Y{
            void m2();
        }
        class Z extends X implements Y{
            public void m1(){
                System.out.println("Abstract class");
            }
            public void m2(){
                System.out.println("Interface");
                }
        }

/*  Q18 interface 
            return and argument 
            return and no argument 

        interface 
            no return and no argument 

        anonymous inner class */

        interface A1{
            String m1(String s);
            int m2();
        }
        interface B2{
            void m3();
        }



        public class InterfaceAssignment3{
            public static void main(String [] args){

                //Q11
                    D obj = new D();
                    obj.m1();
                    obj.m2();
                //Q12
                    I obj1 = new I();
                    obj1.method();

                //Q13
                    L obj2 = new L();
                    obj2.method();

                //Q14
                    Q obj3 = new Q();
                    obj3.m1();

                //Q15
                    T obj4 = new T();
                    obj4.meth();
                    obj4.meth2();

                //Q16
                    W obj5 = new W();
                    obj5.meth();

                //Q17
                    Z obj6 = new Z();
                    obj6.m1();
                    obj6.m2();

                //Q18
                    A1 obj7 = new A1(){
                        public String m1(String s){
                            return s;
                        }
                        public int m2(){
                            return 10;
                        }
                    };
                    System.out.println(obj7.m1("Yo! I am in a anonymous inner class"));
                    System.out.println(obj7.m2());
                    B2 obj8 = new B2(){
                        public void m3(){
                            System.out.println("Yo! I am in a anonymous inner class AGAIN");
                        }
                    };
                    obj8.m3();                    


            }
        }