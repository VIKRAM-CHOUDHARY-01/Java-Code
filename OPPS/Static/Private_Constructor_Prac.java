class A{
    private A(){
        System.out.println("Hello from Private Constructor");
    }
    static void show(){
        new A();
    }
    public A(int a){
        new A();
        //or
        //this();
    }
    static A show1(){
        return new A();
    }
}
public class Private_Constructor_Prac{
    public static void main(String [] args){
        new A(3);

        A.show();

        A obj = A.show1();
    }
}