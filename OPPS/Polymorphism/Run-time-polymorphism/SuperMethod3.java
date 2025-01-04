class A{
    String name = "Hello";
}
class B extends A{
    String name = "World";
     void show(){
        System.out.println(super.name);
        System.out.println(name);
     }
}

public class SuperMethod3{
    public static void main(String []args){
        B b = new B();
        b.show();
    }
}