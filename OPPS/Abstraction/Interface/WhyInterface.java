interface A{
    void show();
}
class B{
    void show1(){
        System.out.println("Badass");
    }
}
class C extends B implements A{
    public void show(){
        System.out.println("Ravikumar");
    }
}

public class WhyInterface{
    public static void main(String [] arg){
        C ob = new C();
        ob.show1();
        ob.show();
    }
}