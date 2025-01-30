interface A{
    int a = 34; // its by default final and public thus it can be accessed in implemented class/interface but can not reassign.
}
class B implements A{
    public void show(){
        System.out.println(a);
    }
}
public class Interface_Variable{
    public static void main(String [] args){
        B b = new B();
        b.show();
    }
}