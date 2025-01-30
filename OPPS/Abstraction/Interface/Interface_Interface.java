interface A {
    void show();
}
interface B extends A{
    void show1();
}
class C implements A,B{
    public void show(){
        System.out.println("Hello");
    }
    public void show1(){
        System.out.println("Bye");
    }

}
public class Interface_Interface{
    public static void main(String [] args){

        C obj = new C();
        obj.show();
        obj.show1();

    }
}