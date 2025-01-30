interface A{
    void show();
    default void nonAbs(){
        System.out.println("Non abstract Method in Interface");
    }
}

class B implements A{
    public void show(){
        System.out.println("Hello!");
    }
    void display(){
        System.out.println("Normal Method");
    }
}

public class InterfaceBasic4{
    public static void main(String [] args){
    //refrence variable :
        A obj = new B();
        obj.show();
        obj.nonAbs();
        obj.display();

    } 
}