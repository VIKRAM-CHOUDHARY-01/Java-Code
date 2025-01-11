abstract class A{
    abstract void show();
}

class B extends A{
    void show(){
        System.out.println("Hello!");
    }
}
public class AbstractBasic5{
    public static void main(String [] args){

        A ob= new B();
        ob.show() ;
      
        
    }
}