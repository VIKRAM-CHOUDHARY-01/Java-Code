class A{
    public void show(){
        System.out.println("A class Method");
    }
}

class B extends A{
    public void show2(){
        System.out.println("B class Method");
    }
}

public class AccessMethod1{
    public static void main(String [] args){
        B p = new B();
        p.show();
        p.show2();
    }
}