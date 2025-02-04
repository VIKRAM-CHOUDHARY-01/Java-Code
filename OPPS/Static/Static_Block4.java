//Inheritance in static block

class A{
    static{
        System.out.println("Static block in Class A");
    }
}
class B extends A{
    //internally
                // super();
    static{
        System.out.println("Static block in class B");
    }
}
public class Static_Block4{
    public static void main(String [] args){
        new B();
            /* Output :

                        Static block in Class A
                        Static block in class B                 
                        
                        Because a static block is executed when we call its constructor and when we call a sublclass constructor the superclass construcor is always implicity called by jvm
                        */

    }
}