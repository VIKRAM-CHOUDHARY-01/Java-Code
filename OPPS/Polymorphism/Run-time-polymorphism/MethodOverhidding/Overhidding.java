class A{
    static void show(){
        System.out.println("A class");
    }
}
class B extends A{
    static void show(){
        // super.show(); -:> will give error here
        System.out.println("B class");
    }
}

public class Overhidding{
    public static void main(String [] args){    
        B ob = new B();
        ob.show();
    }
}