//Assignment - 07/01/25

/*  Q.1 abstract class 
            method1 :abstract type :no return and no argument 
            method3 :abstract type : return and no argument

        abstract class 
            method2 :abstract type :no return and  argument
            method4 :abstract type : return and  argument

        another class extends 

        access through child class  */

        abstract class A{
            abstract void method1();
            abstract int method3();
        }
        abstract class B{
            abstract void method2(int a);
            abstract int method4(int a);
        }

        class C extends A{
            void method1(){
                System.out.println("Hello! It's first Method");
            }
            int method3(){
                return 10;
            }
            
        }
        class D extends B{
            void method2(int a){
                System.out.println("Hello! It's second Method " + 10);
            }
            int method4(int a){
                return a;
            }
        }

/*  Q.2 abstract class :default constructor 

        abstract class :default constructor 

        another class extends 

        access through child class  */


        abstract class Animal{
            Animal(){
                System.out.println("Hello Animal");
            }
        }
        abstract class Humans{
            Humans(){
                System.out.println("Hello Humans");
            }
        }

        class AccessAnimal extends Animal{
            
        }
        class AccessHumans extends Humans{

        }


/*  Q.3 abstract class :parameterised constructor 

        abstract class :parameterised constructor 

        another class extends 

        access through child class      */

        abstract class Joe{
            Joe(String name){
                System.out.println("Name is : " + name);
            }
        }
        abstract class Rogan{
            Rogan(String pod){
                System.out.println("Podcast is : " + pod);
            }
        }

        class AccessJoe extends Joe{
            AccessJoe(String name){

                super(name);
                System.out.println("The Child Constructor name : " + name);
            }
        }
           class AccessRogan extends Rogan{
            AccessRogan(String name){
                super(name);
                System.out.println("The Child Constructor name : " + name);
            }
        }

/*  Q.4 abstract class 
        method1 :abstract type :no return and no argument 
        method3 :abstract type : return and no argument

    abstract class 
        method2 :abstract type :no return and  argument
        method4 :abstract type : return and  argument

    another class extends 

    access through child class and using refrence variable  */

    abstract class Cl{
        abstract void method1();
        abstract String method3();
    }

    abstract class Cl2{
        abstract void method2(int a);
        abstract int method4(int b);
    }

    class AccessCl1 extends Cl{
        void method1(){
            System.out.println("In method one of class cl1");
        }
        String method3(){
            return "In method three of class cl1";
        }
    }
    class AccessCl2 extends Cl2{
        void method2(int a){
            System.out.println("The number is : " + a);
        }
        int method4(int b){
            return b;
        }
    }

/*  Q.5 abstract class 
	method1 :abstract type :no return and no argument :non-abstract
	method3 :abstract type : return and no argument

    abstract class 
        method2 :abstract type :no return and  argument
        method4 :abstract type : return and  argument :non-abstract

    another class extends 

    access through child class
    access through child class and using refrence variable  */

    abstract class A1{
        void m1(){
            System.out.println("Hello from abstract class's non abstract method");
        }
        abstract String m3();
    }
    abstract class A2{
        abstract void m2(int a);
        int m4(int b){
            return 30;
        }
    }

    class B1 extends A1{
            String m3(){
                return "Hello from B1 Abstract method defination";
         }

    }

    class B2 extends A2{
        void m2(int a){
            System.out.println("Number : " + a);
        }
    }

/*  Q.6 abstract class 
            non-abstract method : private 
            non-abstract method : protected 
            abstract method : private 
            abstract method : protected  

        access */

        abstract class Checking{
            private void m1(){System.out.println("Checking non abstract private method");}
            void accessM1(){
                m1();
            }
            protected void m2(){System.out.println("Checking non abstract protected method");}
            // private abstract void m3();
            protected abstract void m4();
        }
        class AccessCheck extends Checking{
            protected void m4(){
                System.out.println("AccessCheck class m4 method");
            }

        }

/*  Q7  abstract class 
            abstract method : return and argument  

        anonymous inner class   */

        abstract class C3{
            abstract String meth(String name);
        }

/*  Q8  abstract class 1
            abstract method : return and argument  

        abstract class 2
            abstract method :no return and argument  

        abstract class 3
            abstract method : return and no argument  

        abstract class 4
            abstract method :no return and no argument  

        anonymous inner class   */

        abstract class D1{
            abstract String m1(String s);
        }
         abstract class E{
            abstract void m2(String s);
        }
         abstract class F{
            abstract String m3();
        }
         abstract class G{
            abstract void m4();
        }

/*  Q.9 abstract class 
	abstract method 

        class ext abs

        class ext abs 

        access  */

        abstract class Abs{
            abstract void m();
            }
            class Ext1 extends Abs{
                void m() {
                    System.out.println("hello again");
                    }
            }
            class Ext2 extends Abs{
                void m() {
                    System.out.println("hello again 2");
                    }
                }

/*  Q10 abstract class A
            abstract method 

        class B ext abstract

        class C ext B 

        access child k through  */

        abstract class A3{
            abstract void meth();
        }
        class B4 extends A3{
            void meth() {
                System.out.println("hello B4");
            }
        }
        class E4 extends B4{
            void meth() {
                System.out.println("hello E4");
            }
        }

/*  Q11 abstract class A
            abstract method 
            non abstract method 

            class B ext abstract

            class C ext B 

            access child k through  */

            abstract class Z{
                void nonAbstract() {
                    System.out.println("non abstaract Z class");
                }
                abstract void abstractMethod();
            }
            class Y extends Z{
                void abstractMethod() {
                    System.out.println("abstract method Y class");
                }
            }
            class X extends Y{
                void abstractMethod() {
                    System.out.println("abstract method X class");
                }
            }


/*  Q12 abstract class A
            private abstract method 
            non abstract method 

            class B ext abstract

            class C ext B 

            access child k through  */

            abstract class A4{
                // private void abstractMethod();
                void nonAbstract() {
                    System.out.println("non abstaract A4 class");
                }
            }
            class B5 extends A4{}
            class B6 extends B5{}

            //We can not have pricate abstract method in abstract class.

/*  Q13 abstract class A
            abstract method 
            private non abstract method 

        class B ext abstract
            method :protected 
            method :private 

        class C ext B 

        access child k through  */

        abstract class A6 {
            abstract void m1();
            private void nonAbs(){
                System.out.println("Non abstract method");
            }

            void accessNonAbs(){
                nonAbs();
            }
        }

        class B7 extends A6{
            void m1(){
                System.out.println("A6 abstract method defi in B7");
            }
            protected void m2(){
                System.out.println("B7 protected method");
            }
            private void m3(){
                System.out.println("B7 private method");
            }
            void accessM3(){
                m3();
            }
        }

        class C4 extends B7{

        }



        public class AbstractClassAssign{
            public static void main(String [] args){
                //Q.1
                        C obj = new C();
                        obj.method1();
                        System.out.println("Method 2 : " + obj.method3());
                        D obj1 = new D();
                        obj1.method2(34);
                        System.out.println("Method 4 : " + obj1.method4(50));

                //Q.2

                        AccessAnimal aa = new AccessAnimal();
                        AccessHumans ah = new AccessHumans();

                //Q.3
                        AccessJoe aj = new AccessJoe("Assassian");
                        AccessRogan ar = new AccessRogan("Story right now");


                //Q.4
                        Cl acl = new AccessCl1();
                        acl.method1();
                        System.out.println(acl.method3());

                        Cl2 acl2 = new AccessCl2();
                        acl2.method2(30);
                        System.out.println(acl2.method4(3));  


                //Q.5
                        A1 obj3 = new B1();
                        obj3.m1();
                        System.out.println(obj3.m3());

                        A2 obj4 = new B2();
                        obj4.m2(34);
                        System.out.println(obj4.m4(33));   

                //Q.6
                        AccessCheck ac = new AccessCheck();
                        ac.accessM1();
                        ac.m2();   
                        ac.m4(); 

                //Q.7
                        C3 ob1 = new C3(){
                            String meth(String name){
                                return name;
                            }
                        };
                        System.out.println( ob1.meth("Hello Mf!") );

                //Q.8
                        D1 obj5 = new D1(){
                            String m1(String s){
                                return s;
                            }
                        };
                        System.out.println(obj5.m1("D class Abstrct method with inner class defination"));

                        E obj6 = new E(){
                            void m2(String s){
                                System.out.println(s);
                            }
                        };
                        obj6.m2("Hello");

                        F obj7 = new F(){
                            String m3(){
                                return "Bye";
                            }
                        };
                        System.out.println(obj7.m3());

                        G obj8 = new G(){
                            void m4(){
                                System.out.println("Last inner class defi");
                            }
                        };
                        obj8.m4();


                //Q.9
                        Ext1 obj9 = new Ext1();
                        obj9.m();
                        Ext2 obj10 = new Ext2();
                        obj10.m();


                //Q10    
                        B4 ob2 = new B4();
                        ob2.meth();
                        E4 ob3 = new E4();
                        ob3.meth();

                //Q11
                        Y ob4 = new Y();
                        ob4.abstractMethod();
                        ob4.nonAbstract();

                        X ob5 = new X();
                        ob5.abstractMethod();
                        ob5.nonAbstract();


                //Q.13

                        C4 ob6 = new C4();
                        ob6.m1();
                        ob6.accessNonAbs();
                        ob6.m2();
                        ob6.accessM3();
                       
            }
        }