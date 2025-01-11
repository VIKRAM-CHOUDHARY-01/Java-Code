abstract class A{
    abstract void show();
    void display(){ // non abstract method is always declared and defined in abstract class
        System.out.println("Nice");
    }
}
class B extends A{
    void show(){
        System.out.println("Hello!");
    }
}
public class AbstractBasic6{
    public static void main(String [] args){

        B ob= new B();
        ob.display() ;

        A obj = new B(); // through reference variable
        obj.display();
        obj.show();
      
        
    }
}