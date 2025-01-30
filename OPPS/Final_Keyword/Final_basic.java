
class A{
    final void show(){
        System.out.println("A");
    }
}
class B extends A{
    //will show error
    // final void show(){
    //     System.out.println("B");
    // }
}
public class Final_Keyword{
    public static void main(String [] args){

        B obj = new B();
        obj.show();

    }
}