class A{
    static int a = 34;
    static void show(){
        System.out.println("Hello from static method in class A");
    }
    static{
        System.out.println(a);
        show();
    }
}
public class Static_Block7{
    public static void main(String [] args){
        // we can access static method and variables in static block
        new A();
    }

}