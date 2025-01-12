//Assignment ->  10/01/25

/*  Q.1 interface 
            interface : method1 :return and argument 

        access method1 */

        interface A{
          
            interface B{
                int show(int a);
            }
        }

        class C implements A.B{
            public int show(int a){
               return a*a;
            }
        }

/*  Q.2 interface 
                method2 :return and no argument 
            interface : method1 :return and argument 

        access method1  */

        interface D{
            String method2();
            interface E{
                String method1(String s);
            }
        }

        class F implements D.E{
                public String method1(String s){
                    return s;
                }
        }

/*  Q.3 interface 
	        interface : method1 :return and argument 
		            method2 :return and no argument :private 

        access method1 */

        interface G {
            interface H{
                int m1(int a);

                private String m2(){
                    return "La La Land";
                }
                default void accessM2(){
                    System.out.println(m2());
                }
            }

        }

        class I implements G.H{
            public int m1(int a){
                return a*a;
            }
        }


/*  Q.4 interface 
		method3 :return and argument 
		method4 :no return and no argument : private 

	interface : method1 :return and argument 
		method2 :return and no argument :private 

        access method1  */


        interface J{
            String method3(String s);
            private void method4(){
                System.out.println("Private method in interface J");
            }
            default void accessM4(){
                method4();
            }
            interface K{
                int method1(int a);
                private String m5(){
                    return "Aree Aree";
                }
                default void accessM5(){
                    System.out.println(m5());
                }
            }
        }

        class L implements J{
            public String method3(String s){
                return s;
            }
        }
        class M implements J.K{
            public int method1(int a){
                return a+a;
            }
        }


/*  Q.5 interface 
            class 
                method :covariant type 

        access      */

        interface N{
            class P{
                P method1(){
                    return this;
                }
            }
        }

        class Q extends N.P{
        }

/*  Q6  interface 
                private method 
                abstract method 

            class 
                method :covariant type 
                protected method 
                private method 

            access  */

        interface R{
            private void method(){
                System.out.println("Hello Private Method");
            }
            default void accessMethod(){
                method();
            }
            void m2();

            class S {
                S m3(){
                    return this;
                }

               // protected method() -> Not Valid, will give error

               private void m4(){
                    System.out.println("Private Method in interface in class");
               }

               void accessM4(){
                m4();
               }
            }
        }

        class T implements R{
            public void m2(){
                System.out.println("Abstract method in interface R");
            }
        }
        class U extends R.S{}

/*  Q7  class 
            interface 
                method1 :return and argument 

        access */

        class V{
            interface W{
                int method1(int a);
            }
        }

        class X extends V implements V.W{
            public int method1(int a){
                return a;
            }
        }

/*  Q8  class 
                private :
            interface 
                private :
                method1 :return and argument 

        access  */
        class Y {
            private void m(){
                System.out.println("Method in a class");
            }
            public void accessM(){
                m();
            }
            interface Z{
                private void m1(){
                    System.out.println("Method in a interface's Class");
                }
                default void accessM1(){
                    m1();
                }
                String m2(String s);
            }
        }
        class A1 extends Y implements Y.Z{
            public String m2(String s){
                
                return s;
            }
        }

/*  Q9  interface 
            method1

        class 
            method2

        class both access */

        interface B1{
            void method1();
        }
        class C1{
            void method2(){
                System.out.println("Connect");
            }
        }

        class D1 extends C1 implements B1{
            public void method1(){
                System.out.println("Hello");
            }
        }


/*  Q10 interface 
            class 

            class

            interface 

        access*/

    class E1{
        void m1(){
            System.out.println("RRR");
        }
    }
    class F1{
        void m2(){
            System.out.println("Bahubali");
        }
    }

    interface G1{
        
    class E1{
        void m1(){
            System.out.println("RRR");
        }
    }
    class F1{
        void m2(){
            System.out.println("Bahubali");
        }
    }
        void m3();
    }

    class H1 extends G1.E1{}
    class J1 extends G1.F1 implements G1{
        public void m3(){
            System.out.println("Bahubali 2");
        }
    }




        public class InterfaceAssignment2{
            public static void main(String [] args){

                //Q.1
                    C obj = new C();
                    System.out.println("The Square is : " + obj.show(3));

                //Q.2
                    F obj2 = new F();
                    System.out.println(obj2.method1("Hello"));

                //Q.3

                    I obj3 = new I();
                    System.out.println(obj3.m1(6));;
                    obj3.accessM2();

                //Q.4
                    L obj4 = new L();
                    System.out.println(obj4.method3("Meet joe black"));
                    obj4.accessM4();

                    M obj5 = new M();
                    System.out.println(obj5.method1(5));
                    obj5.accessM5();

                //Q.5   
                    Q obj6 = new Q();
                    System.out.println(obj6.method1());

                //Q.6
                    T obj7 = new T();
                    obj7.m2();
                    obj7.accessMethod();
                    U obj8 = new U();
                    obj8.accessM4();
                    System.out.println(obj8.m3());


                //Q.7
                    X obj9 = new X();
                    System.out.println(obj9.method1(3));

                //Q.8   
                    A1 obj10 = new A1();
                    System.out.println(obj10.m2("Lekin Ho jaayega"));
                    obj10.accessM();
                    obj10.accessM1();

                //Q.9
                    D1 obj11 = new D1();
                    obj11.method1();
                    obj11.method2();
                
                //Q.10  
                    H1 obj12 = new H1();
                    obj12.m1();
                    J1 obj13 = new J1();
                    obj13.m2();
                    obj13.m3();

            }
        }