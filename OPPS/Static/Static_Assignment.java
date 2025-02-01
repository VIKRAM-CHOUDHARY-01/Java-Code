//Assignment - 31/01/25

/*  Q.1 
class 
	class 
		method :return and argument 
		method :covariant return type   */


class A{
    class B{
        String m1(String name){
            return name;
        }

        B m2(){
            return this;
         }
    }

  
}

/*  Q.2
            class 
            class variable 

            constructor :four time call */


    class C{
        static int a = 223;
        C(){
            System.out.println(++a);
        }
    }

/*  Q.3 
            class 
                class 
                    method :private 

            method :private 

            access  */

        class D{
            class E{
                private void m1(){
                    System.out.println("I am a innner class Private Method");
                }
                void accessM1(){
                    m1();
                }
            }
            private void m2(){
                System.out.println("I am in outer class Private Method");
            }
            void accessM2(){
                m2();
            }
        }

/*  Q4
            class 
            class :abstract class 
                method :non abstract 
                    abstract 

        access inner class method   */

    class F{
        abstract class G{
            void m3(){
                System.out.println("I am an abstract class non abstract method");
            }
        }
    }

/*  Q5
        abstract class 
            class 
                method 

        access      */


        abstract class H{
            class I{
                void m5(){
                    System.out.println("Hello ! ");
                }
            }
        }

public class Static_Assignment{
    public static void main(String [] args){
        //Q.1
            A first_Obj = new A();
            A.B inner_Obj = first_Obj.new B();
            System.out.println(inner_Obj.m1("My name is Vikram choudhary"));
            System.out.println(inner_Obj.m2());

        //Q.2
            new C();
            new C();
            new C();

        //Q.3
            D obj = new D();
            obj.accessM2();
            D.E inner_Obj1 = obj.new E();
            inner_Obj1.accessM1();

        //Q.4
            F obj2 = new F();
            F.G ob = obj2.new G(){}; // need to create an anonymous class so that we can indirectly intilize abstract class G. and if try the normal way then it will throw error since an abstract class can not initiated.
            ob.m3();


        //Q5

            H ob1 = new H(){}; // here the same previous logic applies
            H.I inner = ob1.new I();
            inner.m5();


    }
}