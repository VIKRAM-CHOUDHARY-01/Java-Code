//Multiple inheritance method ambiguity problem solved because interface can not create constructor
interface A{
    // public method :
    void dog(); // by default : public abstract

    // when using default keyword then create non - abstract method in interface

    default void display(){
        System.out.println("non absract method");
    }
    private show1(){
        System.out.println("Private no");
    }
}


class B implements A{
            public void dog(){
                System.out.println("Dog");
            }
}
public class InterfaceBasic3{
    public static void main(String[] args) {
        B wh = new B();
        wh.dog();
        wh.display();
    }
}