//Assignment - > 30/01/25

/*  Q.1 
interface A
	method :return and argument 

interface B 
	method :no return and argument 

interface C
	method :return and no argument 

interface D
	method :no return and no argument 

class : implement using exteds interface

*/


interface A{
    int sum(int a, int b);
}
interface B{
    void show(String s);
}
interface C{
    String show1();
}
interface D extends A,B,C{
    void m4();
}
class E implements D{
    public int sum(int a, int b){
        return a+b;
    }
    public void show(String s){
        System.out.println(s);
    }
    public String show1(){
        return "Emilia Parez is a bad movie.";
    }
    public void m4(){
        System.out.println("13 oscar nominations for what??");
    }
}


/*  Q.2 
interface A
	private method :return and argument 

interface B ex A
	default method :no return and argument 

interface C ex B
	method :return and no argument 

	interface :method 

interface D ex C
	method :no return and no argument 
	class : 

class : access 

*/

interface A1{
    private int square(int a){
        return a*a;
    }
    default void accessAquare(int a){
       System.out.println(square(a));
    }
}
interface B1 extends A1{
    default void show(String name){
        System.out.println(name);
    }
}
interface C1 extends B1{
    int m();
    interface innerInt{
        void innerMeth();
    }
}
interface D1 extends C1{
    void set();
    class E1{
        public void show1(){
            System.out.println("Its The End");
        }
    }
}

class F extends D1.E1 implements D1,D1.innerInt{
    public int m(){
        return 69;
    }
    public void innerMeth(){
        System.out.println("We are in Middle");
    }
    public void set(){
        System.out.println("To the end");
    }

}

/*  Q.3 
interface A
	method :show()

interface B 
	method :show()

interface C 
	method :show()

interface D
	method :show()

class implements 
    */


interface A3{
    void show();
}
interface B3{
    void show();
}
interface C3{
    void show();
}
interface D3{
    void show();
}
class E3 implements A3,B3,C3,D3{
    public void show(){
        System.out.println("Its overridden for all same namem method in all interface");
    }
}


// Final Variable

interface A4{
    int a = 34; // its by default public and final
}
class B4 implements A4{
    public void show(){
        System.out.println(a); // accessble
        // a = 3; // throw Error - can not reaassign final variable
        // System.out.println(a); 
    }
}


// Q.5  Final Method

class A5{
    final void show(){
        System.out.println("Ok");
    }
}
class B5 extends A5{
    void show2(){
        show(); //can access
    }

    // final void show(){ // can not overrida aka no modification
    //     System.out.println("Bye");
    // }
}




public class Main{
    public static void main(String []args){

        //Q.1
                E obj = new E();
                System.out.println(obj.sum(10,15));
                obj.show("Yo Boi!");
                System.out.println(obj.show1());
                obj.m4();

        //Q.2
                F obj1 = new F();
                obj1.accessAquare(8);
                obj1.show("Vikram Chodhary");
                System.out.println(obj1.m());
                obj1.innerMeth();
                obj1.set();
                obj1.show1();

        //Q.3
                E3 obj2 = new E3();
                obj2.show();

                A3 obj3 = new E3();
                obj3.show();

                B3 obj4 = new E3();
                obj4.show();
                
                C3 obj5 = new E3();
                obj5.show();

                D3 obj6 = new E3();
                obj6.show();

        //Q.4
                B4 obj7 = new B4();
                obj7.show();

        //Q.5

                B5 obj8 = new B5();
                obj8.show2();
                obj8.show();
    }
}