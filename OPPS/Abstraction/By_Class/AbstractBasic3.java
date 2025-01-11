abstract class A{
    A(){
        System.out.println("Hello constructor");
    }
    abstract void show();
}
class B extends A{
    // B(){
    //     super();
    // }
    void show(){
        System.out.println(
            "Abstract Method"
        );
    }
}
public class AbstractBasic3{
    public static void main(String [] args){
        B b = new B();
        b.show();
    }
}
