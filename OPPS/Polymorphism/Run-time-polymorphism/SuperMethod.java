class A{
    A(){
        System.out.println("Hello! A");
    }
}

class B extends A{
    B(){
        // super(); Internally
        System.out.println("Bye ! B");
    }
}

public class SuperMethod{
    public static void main(String [] args){

       new B();
        


    }
}