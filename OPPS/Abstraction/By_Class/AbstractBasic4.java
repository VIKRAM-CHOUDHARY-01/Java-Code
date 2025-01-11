abstract class A{
    abstract void show();
}

class B extends A{
    void show(){
        System.out.println("Hello!");
    }
}
public class AbstractBasic4{
    public static void main(String [] args){

        A ob= new A();
        /*  Output : 
        AbstractBasic4.java:13: error: A is abstract; cannot be instantiated
        A ob= new A();
              ^
        1 error
            */
        
    }
}