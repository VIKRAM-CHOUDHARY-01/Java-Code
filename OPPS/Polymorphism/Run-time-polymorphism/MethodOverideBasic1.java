class A{
    void show(){
        System.out.println("Class A METHOD");
    }
}
class B extends A{
    void show(){
        System.out.println("Class B method");
    }
}

public class MethodOverideBasic1{
    public static void main(String [] args){
        B obj = new B();
        obj.show();
    }
}