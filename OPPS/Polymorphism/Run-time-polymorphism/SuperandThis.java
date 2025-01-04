class A{
    A(int a){
        System.out.println("Class A " + a);
    }
}

class B extends A{
    B(int a){
        super(34);
        System.out.println("B class " + a);
    }
    B(){
        this(3);
        System.out.println("B class This");
    }
}

public class SuperandThis{
    public static void main(String[]args){
        new B();

    }
}