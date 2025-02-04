// normal class, static instance variable, method non-static : access ->yes

class A{
    static int a = 343;
    void show(){
        System.out.println(a);
    }
}
public class Static_Basic4{
    public static void main(String []args){
        A obj = new A();
        obj.show();
    }
}