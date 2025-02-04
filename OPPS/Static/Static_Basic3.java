//Normal class, normal instance variable, normal method , normal varaible acesss : yes
class A{
    int a;
    void show(){
        System.out.println("Hello " + a);
    }
}
public class Static_Basic3{
    public static void main(String [] args){
        A obj = new A();
        obj.show();
    }
}