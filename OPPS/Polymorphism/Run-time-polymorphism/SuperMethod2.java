class A{
    A(int a){
        System.out.println("Hello! A " + a);
    }
}

class B extends A{
    B(int a){
        super(6);
        System.out.println("Bye ! B " + a);
    }
}

public class SuperMethod2{
    public static void main(String [] args){

       new B(67);
        


    }
}