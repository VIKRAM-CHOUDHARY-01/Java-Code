import java.lang.RuntimeException;
import java.lang.ArithmeticException;
class A{
    void show() throws RuntimeException{
        System.out.println("Hello");
        throw new RuntimeException("Error in Super class method");
    }
}
class B extends A{
    void show() throws ArithmeticException{
        System.out.println("Bye");
        throw new ArithmeticException("Error in Child class Method");
    }
}

public class Example6{
    public static void main(String []args){
      //  Q.6 Example using super class method
      try{
        B b = new B();
        b.show();
      }catch(ArithmeticException e){
        System.out.println(e);
      }
      catch(RuntimeException e1){
        System.out.println(e1);
      }
    }
}