class A{
    private void show(){
        System.out.println("Hello!");
    }
}

class B extends A{
    private void show2(){
        System.out.println("Bye!");
    }
}

public class AccessMethod2{
    public static void main(String [] args){
        B obj = new B();
        obj.show();
        obj.show2();
    }
}