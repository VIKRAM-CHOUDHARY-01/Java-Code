class A{
    static int a = 0; //static variable or class Variable
    A(){
        a++;
        System.out.println(a);
    }
}

class B{
    void show(){
        System.out.println("Normal Method");
    }
    
    //static method
    static void show1(){
        System.out.println("Static Method");
    }
}

//inner class
class A_1{
    class B_1{
        void show(){
            System.out.println("Inner class Method");
        }
    }
}


public class Static_Basic{
    public static void main(String [] args){

        new A();
        new A();
        new A();

        B obj = new B();
        obj.show();
        B.show1(); // class k through method call


        A_1 p = new A_1();
        A_1.B_1 k = p.new B_1();
        k.show(); // inner class method call



    }
}