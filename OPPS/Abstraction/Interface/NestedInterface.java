interface A{
    interface B{
        void show();
    }
}

class C implements A.B{
    public void show(){
        System.out.println("Hello!");
    }
}
public class NestedInterface{
    public static void main(String[] args){
        C obj = new C();
        obj.show();
        A.B ref = new C();
        ref.show();
    }
}