class A{
    void show1(){
        System.out.println("I am in A Class");
    }

}
class B extends A{
    void show2(){
        System.out.println("I am in B Class");
    }
}
class C extends B{
    void show3(){
        System.out.println("I am in C Class");
    }
}
public class multilevelinheritance{
    public static void main(String []args){

        C obj = new C();
        obj.show1();

    }
}