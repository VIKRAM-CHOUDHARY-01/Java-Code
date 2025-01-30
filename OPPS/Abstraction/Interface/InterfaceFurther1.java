interface A{
    //interface with class
    class B{
        void show(){
            System.out.println("class");
        }
    }
    //interface with interface
    interface C{
        void show1();
    }
}

//access class in interface
class D extends A.B{
    
}

// access interface in interface
class E implements A.C{
    public void show1(){
        System.out.println("Interface");
    }
}

// access both class and interface which were in a interface
class F extends A.B implements A.C{
     public void show1(){
        System.out.println("Interface in F class");
    }
}

public class InterfaceFurther1{
    public static void main(String [] args){
        //access class in interface
        D d = new D();
        d.show();

        
    }
}