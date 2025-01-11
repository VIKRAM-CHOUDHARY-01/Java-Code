abstract class A{
    //Abstract method : always declare
    // absract method does not define in abstract class

    abstract void show();
}

class B extends A{
    void show(){
        System.out.println("Hello!");
    }
}
public class AbstractBasic2{
    public static void main(String [] args){

        B obj = new B();
        obj.show();

    }
}

