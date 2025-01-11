abstract class A{
    abstract void show();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
       //class  
       A p=new A(){
        void show(){
            System.out.println("anonymous inner class");
        }
       };
       p.show();
    }
}
