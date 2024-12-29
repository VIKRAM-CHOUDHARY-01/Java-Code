/*
In a class method name same and number of parameter is also same then method will be overloaded this is known as method overloading

*/
class A{
    void show(){
        System.out.println("Hello");
    }
    void show(String name){
        System.out.println(name);
    }
}

class B{
    void display(byte a){
        System.out.println("hello" + a);
    }
    void display(int a){
        System.out.println(a);
    }
    void display(double a){
        System.out.println("Double " + a);
    }
}
class C{
    void Wham(double a){
        System.out.println("Double " +  a);

    }
    void What(float a){
        System.out.println("Float : " + a);
    }
}

    /*
    In a class method name same but number of parameter is different but datatype of parameter is same
    */

   class D{
    void show(int a){
        System.out.println("A : " + a);
    }
    void show(int a, int b){
        System.out.println( a + " " + b);
    }
   }

   class E{
        // Method 1: Takes two integers in the order (int, int)
    public void display(int a, int b) {
        System.out.println("Method with two integers in order (int, int): a = " + a + ", b = " + b);
    }

    // Method 2: Takes two integers in the order (int, int) but swapped
    public void display(int b, float a) {
        System.out.println("Method with two integers in order (int, int) swapped: a = " + a + ", b = " + b);
    }
   }

public class MethodOverloadingBasic1{
    public static void main(String [] args){
        A ob = new A();
        ob.show();
        ob.show("Vikram");

        B obj = new B();
        obj.display(10); //becasuse java make every number int first
        obj.display((byte)67); // typecasting int convert byte

        C o = new C();
        o.Wham(23);

        D wh = new D();
        wh.show(3);
        wh.show(5,6);

        E meh = new E();
        meh.display(34,5);
        meh.display(2,3.4f);
    }
}