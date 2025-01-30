interface A {
    void show();
}

interface B{
    default void show(){
        System.out.println("Bye");
    }

}
class C implements A,B{
    public void show(){
        B.super.show();
        System.out.println("Hello");
    }
}
public class Interface_Interface{
    public static void main(String [] args){
        C ob = new C();
        ob.show();
        A obj = new C();
        obj.show();
        B o = new C();
        o.show();

    }
}