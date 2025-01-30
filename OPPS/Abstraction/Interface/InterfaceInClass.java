class A{
    interface B{
        void show();
    }
}
class C implements A.B{
    public void show(){
        System.out.println("Hello lost baby girl!");
    }
}

public class InterfaceInClass{
    public static void main(String [] args){
        C c = new C();
        c.show();
    }
}