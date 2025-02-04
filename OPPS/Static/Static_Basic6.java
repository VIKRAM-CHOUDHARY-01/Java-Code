//normal class, static instance variable, method static : access -> yes
class A{
    static int a= 35;
    static void show(){
        System.out.println(a);
    }
}
public class Static_Basic6{
    public static void main(String [] args){
        A obj = new A();
        obj.show();
    }
}