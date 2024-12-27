class A{
    void show(){
         System.out.println("Hello from class A");
    }
   
}

class B extends A{
    void display(){
        System.out.println("Hello from class B");
    }
}
//Hierarchical Inheritance
class C extends A{
    void display2(){
        System.out.println("Hello from Class C");
    }
}

public class hierarchicalInheritance{
    public static void main(String []args){
        B obj = new B();
        obj.show();
        obj.display();
        C ob = new C();
        ob.show();
        ob.display2();
    }
}